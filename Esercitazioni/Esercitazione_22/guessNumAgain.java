import java.util.Random;
import java.util.Scanner;;

public class guessNumAgain {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;

        Random r = new Random();
        int ranNum = r.nextInt(max - min) + min;

        Scanner reader = new Scanner(System.in);

        System.out.println("----------");
        System.out.println("Giochiamo!");
        System.out.println("Devi indovinare un numero da 0 a 100");

        System.out.println("Ma prima...quanti tentativi vuoi utilizzare?");
        int userNumTry = reader.nextInt();

        int numTry = 0;

        System.out.println("Indovina il numero");

        while (numTry != userNumTry) {
            int userGuess = reader.nextInt();

            if (userGuess < ranNum) {
                System.out.println("-------------------------------------");
                System.out.println("Il numero e' troppo piccolo. Riprova.");

                numTry++;

                System.out.println("Tentativi rimasti: " + (userNumTry - numTry));

            } else if (userGuess > ranNum) {
                System.out.println("------------------------------------");
                System.out.println("Il numero e' troppo grande. Riprova.");

                numTry++;

                System.out.println("Tentativi rimasti: " + (userNumTry - numTry));

            } else {
                System.out.println("--------------------------------------------");
                System.out.println("Bravo! Il numero era proprio " + ranNum + "!");
                System.out.println("Hai indovinato in %d tentativi".formatted(numTry));
                System.out.println("--------------------------------------------");

                break;
            }
        }

        if (numTry == userNumTry) {
            System.out.println("-------------------------------------------");
            System.out.println("Hai finito il numero di tentativi. Peccato!");
            System.out.println("-------------------------------------------");
        }

        reader.close();
    }
}
