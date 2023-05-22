import java.util.Scanner;

public class cercaArray {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Inserisci la dimensione dell'array: ");
        int dim = reader.nextInt();
        int[] array = new int[dim];

        System.out.println("Inserisci gli elementi dell'array: ");
        for (int i = 0; i < dim; i++) {
            array[i] = reader.nextInt();
        }

        System.out.println("Inserisci il numero da cercare: ");
        int searchedNum = reader.nextInt();

        int arrayIndex = -1; // Initialize arrayIndex as -1 'cause is out of bounds and I'll use it as check value

        // Search for the user number inside the array number-by-number
        for (int i = 0; i < dim; i++) {
            if (array[i] == searchedNum) { // If array element at cycled index is equal to searched number...
                arrayIndex = i; // ...take the corrispondent index and save inside a variable

                break;
            }
        }

        if (arrayIndex != -1) { // It has a value different from -1 only if it found something
            System.out.println("Il numero si trova all'indice " + arrayIndex + " dell'array.");

        } else {
            System.out.println("Il numero non e' presente nell'array.");
        }

        reader.close();
    }
}