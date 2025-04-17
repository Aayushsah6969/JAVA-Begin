import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().toLowerCase().replaceAll("\\s", "");

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().toLowerCase().replaceAll("\\s", "");

        // Convert to char array and sort
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        // Compare
        if (Arrays.equals(a, b)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }
    }
}
