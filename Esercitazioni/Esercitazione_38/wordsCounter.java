import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class wordsCounter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Map<String, Integer> wordsMap = new HashMap<>();

        System.out.println("Inserisci il testo da contare:");
        String userTxt = reader.nextLine();

        String[] wordsArray = userTxt.split(" ");

        for (String word : wordsArray) {
            if (wordsMap.containsKey(word)) {
                wordsMap.put(word, wordsMap.get(word) + 1);

            } else {
                wordsMap.put(word, 1);
            }
        }

        System.out.println("La lista delle parole ed il loro conteggio è:");

        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        reader.close();
    }
}