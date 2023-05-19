import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        ArrayList<String> charsWordToGuess = new ArrayList<String>(Arrays.asList("c", "a", "n", "e"));

        charsWordToGuess.remove(2);
        charsWordToGuess.add(2, null);

        System.out.println(charsWordToGuess);
        System.out.println(charsWordToGuess.size());

        for (int i = 0; i < charsWordToGuess.size(); i++) {

            if (charsWordToGuess.get(i) == null) {
                System.out.print("_ ");
            } else {
                System.out.print(charsWordToGuess.get(i) + " ");
            }

        }

    }
}
