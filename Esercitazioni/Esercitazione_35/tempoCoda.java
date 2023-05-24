import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class tempoCoda {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Inserisci il numero dei clienti avuti oggi:");
        int clientsNum = reader.nextInt();

        Queue<Integer> totalServiceTime = new LinkedList<>();

        for (int i = 0; i < clientsNum; i++) {
            System.out.println("Quanto tempo e' stato impiegato per servire il cliente %d (in minuti):".formatted(i));

            int serviceTime = reader.nextInt();

            if (serviceTime < 0) {
                System.out.println("Non puoi aver impiegato un tempo negativo.");

            } else {
                totalServiceTime.add(serviceTime);
            }

        }

        reader.close();

        int totalTime = 0;

        while (!totalServiceTime.isEmpty()) {
            totalTime = totalTime + totalServiceTime.remove();
        }

        System.out.println("Il tempo totale utilizzato e' stato di %d minuti".formatted(totalTime));

    }
}
