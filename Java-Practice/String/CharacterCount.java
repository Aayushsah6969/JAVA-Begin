import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Initialize counters
        int upper = 0, lower = 0, digits = 0, special = 0;

        // Loop through each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                special++;
            }
        }

        // Output the results
        System.out.println("\nCharacter Summary:");
        System.out.println("Uppercase letters     : " + upper);
        System.out.println("Lowercase letters     : " + lower);
        System.out.println("Digits                : " + digits);
        System.out.println("Special characters    : " + special);
    }
}
