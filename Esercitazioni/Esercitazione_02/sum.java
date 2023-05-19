import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int num1 = input.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        int num2 = input.nextInt();

        System.out.print("Come ti chiami? ");
        String name = input.next();

        input.close();

        int sum = num1 + num2;
        /* System.out.print(name + ", la somma dei due numeri: " + sum); */
        System.out.print("%s, la somma dei due numeri è: %s".formatted(name, sum));
    }
}