import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class removeNegatives {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Inserisci dei numeri (\"0\" per finire):");
        int inputNums = reader.nextInt();

        Queue<Integer> posNums = new LinkedList<>();

        while (inputNums != 0) {

            if (inputNums > 0) {
                posNums.add(inputNums);
            }

            inputNums = reader.nextInt();

        }

        reader.close();

        System.out.println("I numeri inseriti positivi sono:");
        while (!posNums.isEmpty()) {
            System.out.println(posNums.remove());
        }

    }
}
