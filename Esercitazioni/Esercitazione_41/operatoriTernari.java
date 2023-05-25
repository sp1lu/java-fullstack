import java.util.Scanner;

public class operatoriTernari {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Scegli un numero:");
        int userNum = reader.nextInt();

        reader.close();

        int sepNum = 10;

        String ternaryOpResult = (userNum > sepNum)
                ? "Il numero è più grande di %d.".formatted(sepNum)
                : "Il numero è più piccolo di %d.".formatted(sepNum);

        System.out.println(ternaryOpResult);

    }
}