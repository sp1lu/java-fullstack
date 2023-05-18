import java.util.Scanner;

public class doWhileAgain {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int num;

        do { // esegue almeno una volta
            System.out.println("Inserire un numero (0 per uscire):");
            num = reader.nextInt();
            System.out.println("Hai inserito %d".formatted(num));
        } while (num != 0); // escape condition

        reader.close();
    }
}
