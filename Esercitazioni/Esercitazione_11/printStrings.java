public class printStrings {
    public static void main(String[] args) {

        String[] words = { "ciao", "zio", "come", "stai", "?" };

        System.out.println("L'array ha %d elementi".formatted(words.length));

        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}