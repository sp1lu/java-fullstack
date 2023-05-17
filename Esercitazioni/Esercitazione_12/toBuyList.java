import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class toBuyList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("Fai la lista della spesa");
        System.out.println("Due volte INVIO per uscire");
        System.out.println("c per svuotare. f per cancellare l'ultimo elemento");

        List<String> toBuyList = new ArrayList<String>();

        while (true) {
            String userInput = input.nextLine();

            if (userInput.equals("")) {
                break;

            } else if (userInput.equals("c") || userInput.equals("C")) {
                toBuyList.clear();
                System.out.println("Lista della spesa svuotata");

            } else if (userInput.equals("f") || userInput.equals("F")) {
                System.out.println("-------------------------");
                System.out.println(toBuyList.get(toBuyList.size() - 1) + " rimosso dalla lista");
                toBuyList.remove(toBuyList.size() - 1);

                System.out.println("-------------------------");
                System.out.println("Lista aggiornata:");

                for (String listElement : toBuyList) {
                    System.out.println(listElement);
                }

                System.out.println("-------------------------");

            } else {
                toBuyList.add(userInput);
            }
        }

        input.close();

        if (toBuyList.size() == 0) {
            System.out.println("Non hai niente da comprare oggi");

        } else {
            System.out.println("-------------------------");
            System.out.println("Hai %d cose da comprare oggi.".formatted(toBuyList.size()));
            System.out.println("Eccole:");

            for (String listElement : toBuyList) {
                System.out.println(listElement);
            }

            System.out.println("-------------------------");

        }

    }
}
