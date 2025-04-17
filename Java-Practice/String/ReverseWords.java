import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split sentence into words
        String[] words = sentence.split("\\s+");

        System.out.println("\nEach word reversed:");

        // Reverse each word and print
        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            System.out.println(reversed);
        }
    }
}
