public class printNumbers {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5 };

        System.out.println("L'array ha %d elementi".formatted(numbers.length));

        for (int number : numbers) {
            System.out.println(number + " di " + numbers.length);
        }
    }
}
