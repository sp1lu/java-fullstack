/* import java.util.InputMismatchException;
import java.util.Scanner;

public class calcArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            Double width;
            Double length;

            try {
                System.out.println("Inserire il valore della base:");
                width = input.nextDouble();

                System.out.println("Inserire il valore dell'altezza:");
                length = input.nextDouble();

                input.close();

                if (width >= 400 || length >= 400) {
                    System.out.println("--------------");
                    System.out.println("Esagerato! Non inserire valori superiori a 400");
                    System.out.println("--------------");

                } else if (width <= 0 || length <= 0) {
                    System.out.println("--------------");
                    System.out.println("Non posso calcolare aree negative");
                    System.out.println("--------------");
                }

                else {
                    Double area = width * length;

                    System.out.println("--------------");
                    System.out.println("Area = %f".formatted(area));
                    System.out.println("--------------");
                }

                break;

            } catch (InputMismatchException e) {

                System.out.println("------------------");
                System.out.println("Non hai inserito un numero");
                System.out.println("------------------");

                input.next();

            }

        }

    }

} */

import java.util.InputMismatchException;
import java.util.Scanner;

public class calcArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double width;
        Double length;

        while (true) {

            try {
                System.out.println("Inserire il valore della base:");
                width = input.nextDouble();

                if (width >= 400) {
                    System.out.println("--------------");
                    System.out.println("Esagerato! Non inserire valori superiori a 400");
                    System.out.println("--------------");

                    continue;

                } else if (width <= 0) {
                    System.out.println("--------------");
                    System.out.println("Non posso calcolare aree negative");
                    System.out.println("--------------");

                    continue;
                }

                break;

            } catch (InputMismatchException e) {

                System.out.println("------------------");
                System.out.println("Non hai inserito un numero");
                System.out.println("------------------");

                input.next();

            }

        }

        while (true) {

            try {
                System.out.println("Inserire il valore dell'altezza:");
                length = input.nextDouble();

                if (length >= 400) {
                    System.out.println("--------------");
                    System.out.println("Esagerato! Non inserire valori superiori a 400");
                    System.out.println("--------------");

                    continue;

                } else if (length <= 0) {
                    System.out.println("--------------");
                    System.out.println("Non posso calcolare aree negative");
                    System.out.println("--------------");

                    continue;

                } else {
                    Double area = width * length;

                    System.out.println("--------------");
                    System.out.println("Area = %f".formatted(area));
                    System.out.println("--------------");
                }

                break;

            } catch (InputMismatchException e) {

                System.out.println("------------------");
                System.out.println("Non hai inserito un numero");
                System.out.println("------------------");

                input.next();

            }

        }

        input.close();

    }

}