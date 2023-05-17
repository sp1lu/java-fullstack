import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class toBuyList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("Fai la lista della spesa");
        System.out.println("end per uscire");
        System.out.println("list per vedere gli elementi attualmente nella lista");
        System.out.println("c per svuotare. f per cancellare l'ultimo elemento. d per rimuovere.");

        List<String> toBuyList = new ArrayList<String>();

        while (true) {
            String userInput = input.nextLine();

            if (userInput.equals("end")) {
                break;

            } else if (userInput.equals("c") || userInput.equals("C")) {
                toBuyList.clear();
                System.out.println("Lista della spesa svuotata");

            } else if (userInput.equals("f") || userInput.equals("F")) {

                if (toBuyList.size() == 0) {
                    System.out.println("La lista della spesa vuota. Nulla da rimuovere");
                    System.out.println("Ricomincia ad aggiungere elementi");

                    continue;
                } else {
                    System.out.println("-------------------------");
                    System.out.println(toBuyList.get(toBuyList.size() - 1) + " rimosso dalla lista");
                    toBuyList.remove(toBuyList.size() - 1);

                    System.out.println("-------------------------");
                    System.out.println("Lista aggiornata:");

                    for (String listElement : toBuyList) {
                        System.out.println(listElement);
                    }

                    System.out.println("-------------------------");
                }

            } else if (userInput.equals("d") || userInput.equals("D")) {

                if (toBuyList.size() == 0) {
                    System.out.println("La lista della spesa vuota. Nulla da rimuovere");
                    System.out.println("Ricomincia ad aggiungere elementi");

                    continue;

                } else {
                    System.out.println("-------------------------");
                    System.out.println("Quale elemento vuoi rimuovere?");

                    for (int i = 0; i < toBuyList.size(); i++) {
                        System.out.println("#" + i + " " + toBuyList.get(i));
                    }

                    try {
                        int toRemove = input.nextInt();

                        if (toRemove > toBuyList.size()) {
                            System.out.println("Elemento non esistente nella lista");

                            continue;

                        } else {

                            System.out.println("-------------------------");
                            System.out.println(toBuyList.get(toRemove) + " rimosso dalla lista");

                            toBuyList.remove(toRemove);

                            System.out.println("Lista aggiornata:");

                            for (String listElement : toBuyList) {
                                System.out.println(listElement);
                            }

                            System.out.println("-------------------------");
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("-------------------------");
                        System.out.println("Non hai inserito un numero per scegliere cosa eliminare");
                        System.out.println("Niente eliminato");
                        System.out.println("Continua con la lista");

                        input.next();

                    }
                }

            } else if (userInput.equals("list")) {
                System.out.println("-------------------------");
                System.out.println("Lista attuale:");

                for (int i = 0; i < toBuyList.size(); i++) {
                    System.out.println("#" + i + " " + toBuyList.get(i));
                }

                System.out.println("-------------------------");
                System.out.println("Continua ad aggiungere elementi:");

            } else {
                toBuyList.add(userInput);
            }
        }

        input.close();

        if (toBuyList.size() == 0) {
            System.out.println("Non hai niente da comprare oggi");

        } else {
            toBuyList.removeAll(Arrays.asList(null, ""));
            System.out.println("-------------------------");
            System.out.println("Oggi devi comprare %d cose. Eccole:".formatted(toBuyList.size()));

            for (int i = 0; i < toBuyList.size(); i++) {
                System.out.println("#" + (i + 1) + " " + toBuyList.get(i));
            }

            System.out.println("-------------------------");

        }

    }
}