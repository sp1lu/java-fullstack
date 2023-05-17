import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class listEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> fruits = new ArrayList<String>();

        fruits.add("Mela");
        fruits.add("Banana");
        fruits.add("Arancia");

        System.out.println("------------------------------------");
        System.out.println("Prodotti disponibili:");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("#" + i + " " + fruits.get(i));
        }

        List<String> cart = new ArrayList<String>();

        System.out.println("------------------------------------");
        System.out.println("Quale elemento della lista vuoi aggiungere al carrello?");

        while (true) {

            try {

                if (fruits.isEmpty()) {
                    System.out.println("Non ci sono piu' prodotti da acquistare");
                    System.out.println("Elementi nel carrello:");

                    for (int i = 0; i < cart.size(); i++) {
                        System.out.println("#" + i + " " + cart.get(i));
                    }

                    break;
                }

                int userChoice = input.nextInt();

                if (userChoice > fruits.size()) {
                    System.out.println("------------------------------------");
                    System.out.println("Non hai scelto un prodotto valido");
                    System.out.println("Scegli un altro prodotto:");

                    for (int i = 0; i < fruits.size(); i++) {
                        System.out.println("#" + i + " " + fruits.get(i));
                    }

                    continue;

                } else if (userChoice < 0) {
                    System.out.println("------------------------------------");
                    System.out.println("Prodotti ancora disponibili:");

                    for (int i = 0; i < fruits.size(); i++) {
                        System.out.println("#" + i + " " + fruits.get(i));
                    }

                    System.out.println("------------------------------------");

                    System.out.println("Elementi nel carrello:");

                    for (int i = 0; i < cart.size(); i++) {
                        System.out.println("#" + i + " " + cart.get(i));
                    }

                    break;

                } else {
                    cart.add(fruits.get(userChoice));
                    fruits.remove(userChoice);

                    System.out.println("------------------------------------");
                    System.out.println("Prodotti ancora disponibili:");

                    for (int i = 0; i < fruits.size(); i++) {
                        System.out.println("#" + i + " " + fruits.get(i));
                    }

                    System.out.println("------------------------------------");

                    System.out.println("Elementi nel carrello:");

                    for (int i = 0; i < cart.size(); i++) {
                        System.out.println("#" + i + " " + cart.get(i));
                    }

                    System.out.println("------------------------------------");
                }

            } catch (InputMismatchException e) {
                System.out.println("------------------------------------");
                System.out.println("Non hai scelto un prodotto valido");
                System.out.println("Scegli un altro prodotto:");

                for (int i = 0; i < fruits.size(); i++) {
                    System.out.println("#" + i + " " + fruits.get(i));
                }

                input.next();
            }
        }

        input.close();

    }
}