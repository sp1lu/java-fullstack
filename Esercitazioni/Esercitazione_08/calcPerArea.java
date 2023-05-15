import java.util.InputMismatchException;
import java.util.Scanner;

public class calcPerArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Inserire il valore del lato:");
                int lato = input.nextInt();

                if (lato > 40 || lato <= 0) {
                    System.out.println("------------------------");
                    System.out.println("Valore non valido. Inserire un numero compreso tra 1 e 40.");
                    System.out.println("------------------------");

                    continue;

                } else {
                    int area = areaCalc(lato);
                    int perimeter = perimeterCalc(lato);

                    System.out.println("------------------------");
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