import java.util.Scanner;

public class operatoriTernari {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Scegli un numero:");
        int userNum = reader.nextInt();

        reader.close();

        String ternaryOpResult = (userNum > 10)
                ? "Il numero è più grande di 10."
                : "Il numero è più piccolo di 10.";

        System.out.println(ternaryOpResult);

    }
}