import java.util.Scanner;

public class WordLengthTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split into words
        String[] words = sentence.split("\\s+");

        // Print header
        System.out.println("\nWord\t\tLength");
        System.out.println("-------------------------");

        // Print each word and its length
        for (String word : words) {
            System.out.println(word + "\t\t" + word.length());
        }
    }
}
