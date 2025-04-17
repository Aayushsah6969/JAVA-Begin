import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split sentence into words
        String[] words = sentence.split("\\s+");

        String longestWord = "";
        int maxLength = 0;

        // Loop to find longest word
        for (String word : words) {
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }

        // Output result
        System.out.println("\nLongest word: " + longestWord);
        System.out.println("Length of longest word: " + maxLength);
    }
}
