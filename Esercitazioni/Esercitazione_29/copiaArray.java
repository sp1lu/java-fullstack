import java.util.Arrays;
import java.util.Scanner;

public class copiaArray {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Ask user array size
        // Initialize a new array with user input size
        System.out.println("Inserisci la dimensione dell'array: ");
        int dim = reader.nextInt();
        int[] array = new int[dim];

        // Ask user array elements
        // For cycle is used to ask user multiple elements...
        // ...until the array size is fulfilled
        System.out.println("Inserisci gli elementi dell'array: ");
        for (int i = 0; i < dim; i++) {
            array[i] = reader.nextInt();
        }

        int[] copyArray = new int[dim]; // Initialize a new array: same size of the original

        // Copy one-by-one element from the first array to the second one
        for (int i = 0; i < dim; i++) {
            copyArray[i] = array[i];
        }

        System.out.println("L'array originale: " + Arrays.toString(array));
        System.out.println("L'array copiato: " + Arrays.toString(copyArray));

        reader.close();
    }
}