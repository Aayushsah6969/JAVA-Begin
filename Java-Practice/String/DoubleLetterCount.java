import java.util.Scanner;

public class DoubleLetterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to uppercase
        input = input.toUpperCase();

        int count = 0;

        // Loop through the string and check for double letters
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                count++;
            }
        }

        // Output result
        System.out.println("\nNumber of double letter sequences: " + count);
    }
}
