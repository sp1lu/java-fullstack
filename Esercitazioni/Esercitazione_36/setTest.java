import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class setTest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Set<Integer> nums = new HashSet<Integer>();

        System.out.println("Inserisci dei numeri interi separati da spazi:");
        String[] userNums = reader.nextLine().split(" ");

        reader.close();

        for (String num : userNums) {
            nums.add(Integer.parseInt(num));
        }

        System.out.println("I numeri inseriti sono:");
        for (Integer num : nums) {
            System.out.println(num);
        }
    }
}