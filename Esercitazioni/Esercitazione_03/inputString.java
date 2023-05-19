import java.util.Scanner;
import java.util.InputMismatchException;

public class inputString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Come ti chiami: ");
        String name = input.next();

        int soglia = 18;

        try {
            System.out.println("Quanti anni hai?");
            int age = input.nextInt();

            if (age >= soglia) {
                System.out.println("Ciao, sei un grande idiota da ben %d anni!".formatted(age));
            } else {
                System.out.println("Ah, ma sei piccolo, " + name + "!");
                System.out.println("Hai ancora " + age + " anni.");
                System.out.println("Sei ancora un idiota!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Non prendermi per il culo!");
        }

        input.close();

    }
}