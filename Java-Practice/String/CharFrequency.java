import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string in uppercase
        System.out.print("Enter a string in UPPERCASE: ");
        String str = sc.nextLine();

        // Remove spaces if needed (optional)
        str = str.replaceAll("\\s", "");

        // Create array to count A-Z (26 letters)
        int[] freq = new int[26];

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                freq[ch - 'A']++;
            }
        }

        // Print frequency
        System.out.println("\nCharacter Frequencies:");
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 'A') + " : " + freq[i]);
            }
        }
    }
}
