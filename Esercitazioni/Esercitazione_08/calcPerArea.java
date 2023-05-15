import java.util.InputMismatchException;
import java.util.Scanner;

public class calcPerArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Come ti chiami?");
        String name = input.next();

        while (true) {
            try {
                System.out.println("%s, inserisci il valore del lato:".formatted(name));
                int lato = input.nextInt();

                if (lato > 40 || lato <= 0) {
                    System.out.println("------------------------");
                    System.out.println("%s, hai inserito un valore non valido. Inserire un numero compreso tra 1 e 40."
                            .formatted(name));
                    System.out.println("------------------------");

                    continue;

                } else {
                    int area = areaCalc(lato);
                    int perimeter = perimeterCalc(lato);

                    System.out.println("------------------------");
                    System.out.println("Grazie, %s. Ecco i risultati:".formatted(name));
                    System.out.println("Perimetro = %d".formatted(perimeter));
                    System.out.println("Area = %d".formatted(area));
                    System.out.println("------------------------");
                }

                break;

            } catch (InputMismatchException e) {
                System.out.println("------------------------");
                System.out.println("Non hai inserito un numero");
                System.out.println("------------------------");

                input.next();
            }
        }

        input.close();

    }

    public static int areaCalc(int measure) {
        int areaCalc = measure * measure;
        return areaCalc;
    }

    public static int perimeterCalc(int measure) {
        int perimeterCalc = measure * 4;
        return perimeterCalc;
    }

}