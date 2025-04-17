import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Input the word to search
        System.out.print("Enter the word to search: ");
        String searchWord = sc.nextLine();

        // Convert to lowercase for case-insensitive matching (optional)
        sentence = sentence.toLowerCase();
        searchWord = searchWord.toLowerCase();

        // Split sentence into words
        String[] words = sentence.split("\\s+");

        // Count frequency
        int count = 0;
        for (String word : words) {
            if (word.equals(searchWord)) {
                count++;
            }
        }

        // Output result
        System.out.println("\nThe word \"" + searchWord + "\" occurs " + count + " time(s) in the sentence.");
    }
}
