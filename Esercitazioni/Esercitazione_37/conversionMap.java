import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class conversionMap {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Map<Integer, String> conversionTab = new LinkedHashMap<>();

        conversionTab.put(0, "Pupazzo");
        conversionTab.put(50, "Pistola ad acqua");
        conversionTab.put(100, "Fucile ad acqua");
        conversionTab.put(150, "Videogioco");
        conversionTab.put(200, "Console");
        conversionTab.put(250, "Automobile");
        conversionTab.put(300, "Casa");
        conversionTab.put(350, "Aereo");
        conversionTab.put(400, "Nave da crociera");
        conversionTab.put(450, "Stato");
        conversionTab.put(500, "Pianeta");

        System.out.println("Ecco i premi:");
        conversionTab.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("-----------------------");

        System.out.println("Inserire il punteggio:");
        int userPoints = reader.nextInt();

        reader.close();

        String prize = "";

        for (Map.Entry<Integer, String> entry : conversionTab.entrySet()) {
            if (userPoints >= entry.getKey()) {
                prize = entry.getValue();

            } else {
                break;
            }
        }

        System.out.println("Hai vinto un " + prize.toLowerCase() + ".");

    }
}
