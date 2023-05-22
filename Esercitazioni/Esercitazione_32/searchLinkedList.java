import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

public class searchLinkedList {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        List<String> list = new LinkedList<String>();

        System.out.println("Inserisci gli elementi della lista (\"end\" per terminare):");
        String element = "";

        while (!element.equals("end")) {
            element = reader.nextLine().toLowerCase();
            list.add(element);
        }

        System.out.println("Quale elemento vuoi cercare?");
        String searchedString = reader.nextLine().toLowerCase();

        int listIndex = list.indexOf(searchedString); // catch the index of the searched word and save it

        if (listIndex != -1) {
            System.out.println("L'elemento si trova all'indice " + listIndex + " della lista.");

        } else {
            System.out.println("L'elemento non e' presente nella lista.");
        }

        System.out.println(listIndex);
        reader.close();
    }
}