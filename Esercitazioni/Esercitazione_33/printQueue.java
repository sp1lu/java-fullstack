import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class printQueue {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Inserire parole/frasi (\"end\" per finire):");
        String userInput = reader.nextLine();

        Queue<String> phrasesQueue = new LinkedList<>();

        while (!userInput.equals("end")) {
            phrasesQueue.add(userInput);
            userInput = reader.nextLine();
        }

        reader.close();

        System.out.println("Gli elementi della queue sono:");

        while (!phrasesQueue.isEmpty()) {
            System.out.println(phrasesQueue.remove());
        }

    }

}