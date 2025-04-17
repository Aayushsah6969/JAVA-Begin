import java.util.*;

public class WordSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split into words
        String[] words = sentence.split("\\s+");

        // Sort words alphabetically
        Arrays.sort(words);

        // Print sorted words
        System.out.println("Words in alphabetical order:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
