import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class shuffleObj {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Banana");
        fruits.add("Arancia");
        fruits.add("Mela");
        fruits.add("Melone");
        fruits.add("Pesca");
        fruits.add("Nespola");

        System.out.println(fruits);

        Collections.shuffle(fruits);

        System.out.println("Il primo frutto ora è: " + fruits.get(0));
    }
}
