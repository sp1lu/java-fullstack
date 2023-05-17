import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class forSomething {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("Fai la lista della spesa");
        System.out.println("Due volte INVIO per uscire");

        List<String> toBuyList = new ArrayList<String>();

        while (true) {
            String userInput = input.nextLine();

            if (userInput.equals("")) {
                break;
            }

            toBuyList.add(userInput);
        }

        input.close();

        if (toBuyList.size() == 0) {
            System.out.println("Non hai niente da comprare oggi");
        } else {

            System.out.println("-------------------------");
            System.out.println("Hai " + toBuyList.size() + " cose da comprare oggi.");
            System.out.println("Eccole:");

            for (String listElement : toBuyList) {
                System.out.println(listElement);
            }

            System.out.println("-------------------------");

        }

    }
}
