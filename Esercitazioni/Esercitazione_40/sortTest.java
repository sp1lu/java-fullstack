import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortTest {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Banana");
        fruits.add("Arancia");
        fruits.add("Melone");
        fruits.add("Nespola");
        fruits.add("Pesca");
        fruits.add("Mela");

        System.out.println("Lista originale");
        System.out.println(fruits);

        System.out.println("Lista ordinata");
        Collections.sort(fruits);
        System.out.println(fruits);

        System.out.println("Lista invertita");
        Collections.reverse(fruits);
        System.out.println(fruits);

        System.out.println("Sostituire cose");
        Collections.replaceAll(fruits, "Banana", "Stocazzo!!!");
        System.out.println(fruits);

        System.out.println("Ruotando cose");
        Collections.rotate(fruits, 3);
        System.out.println(fruits);

    }
}
