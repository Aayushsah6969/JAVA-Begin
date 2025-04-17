import java.util.*;

public class WordLengthSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split into words
        String[] words = sentence.split("\\s+");

        // Convert to List for sorting
        List<String> wordList = Arrays.asList(words);

        // Sort by length using Comparator
        wordList.sort(Comparator.comparingInt(String::length));

        // Print sorted words
        System.out.println("\nWords sorted by length:");
        for (String word : wordList) {
            System.out.println(word + " (" + word.length() + ")");
        }
    }
}
