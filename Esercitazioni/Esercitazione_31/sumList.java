import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sumList {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        List<Integer> list = new ArrayList<Integer>();

        System.out.println("Inserisci gli elementi nella list (0 per uscire):");

        int element = reader.nextInt();

        while (element != 0) {
            list.add(element);
            element = reader.nextInt();
        }

        int sum = 0;

        for (Integer num : list) {
            sum += num;
        }

        System.out.println("La somma della lista degli elementi e' " + sum + ".");

        reader.close();
    }
}
