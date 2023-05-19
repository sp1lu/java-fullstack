import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class guessNum {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;

        /* int ranNum = (int) (Math.random() * (max - min)) + min; */
        Random r = new Random();
        int ranNum = r.nextInt(max - min) + min;

        Scanner reader = new Scanner(System.in);

        int numTry = 0;
        System.out.println("Quanti tentativi vuoi usare per indovinare il numero?");
        int userNumTry = reader.nextInt();

        System.out.println("Indovina il numero tra " + min + " e " + max);

        int userGuess = 0;

        while (userNumTry != numTry) {

            try {

                userGuess = reader.nextInt();

                if (userGuess > ranNum) {
                    System.out.println("----------------------------------------------------");
                    System.out.println("Il numero che hai inserito e' troppo grande.");

                    numTry++;

                    System.out.println("Tentativi rimasti: " + (userNumTry - numTry));

                } else if (userGuess < ranNum) {
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Il numero che hai inserito e' troppo piccolo.");

                    numTry++;

                    System.out.println("Tentativi rimasti: " + (userNumTry - numTry));

                } else {

                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("------------------------------------------------");
                System.out.println("Non hai inserito un numero e/o un numero valido.");
                System.out.println("Riprova:");

                numTry++;

                System.out.println("Tentativi rimasti: " + (userNumTry - numTry));

                reader.next();

            }

            while (numTry == userNumTry) {
                System.out.println("-------------------------------------------");
                System.out.println("Hai finito il numero di tentativi. Peccato!");
                System.out.println("-------------------------------------------");

                break;
            }

        }

        System.out.println("------------------------------------------------");
        System.out.println("Hai indovinato in soli " + numTry + " tentativi!");
        System.out.println("Il numero era proprio %d.".formatted(userGuess));
        System.out.println("------------------------------------------------");

        reader.close();
    }

}