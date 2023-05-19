import java.util.Scanner;

public class guessNumChristian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroDaIndovinare = 11;
        int tentativo;

        boolean vincita = false;

        while (vincita == false) {
            System.out.println("Indovina un numero da 1 e 11");

            tentativo = input.nextInt();

            if (tentativo == numeroDaIndovinare) {
                vincita = true;
            } else if (tentativo < numeroDaIndovinare) {
                System.out.println("Numero troppo piccolo, riprova");
            } else if (tentativo > numeroDaIndovinare) {
                System.out.println("Numero troppo piccolo, riprova");
            }

        }

        System.out.println("Bravo hai indovinato");

        input.close();
    }

}