import java.util.InputMismatchException;
import java.util.Scanner;

public class inputType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double num;
        String str;
        char c;

        while (true) {
            try {
                System.out.println("Inserisci un numero:");
                num = input.nextDouble();

                System.out.println("Inserisci una stringa:");
                str = input.next();

                System.out.println("Inserisci un carattere:");
                c = input.next().charAt(0);

                break; // chiude il while loop dopo aver concluso le tre richieste (lo metto dentro al try perché sì)

            } catch (InputMismatchException e) {
                System.out.println("--------------------------");
                System.out.println("Non hai inserito un numero");
                input.nextLine();
            }
        }

        input.close();

        System.out.println("--------------------------");
        System.out.println("Numero: " + Math.round(num));
        System.out.println("Stringa: " + str);
        System.out.println("Carattere: " + c);
        System.out.println("--------------------------");

    }
}