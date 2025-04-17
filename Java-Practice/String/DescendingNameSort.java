import java.util.Scanner;

public class DescendingNameSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[20];

        // Input 20 names
        System.out.println("Enter 20 names:");
        for (int i = 0; i < 20; i++) {
            System.out.print((i + 1) + ". ");
            names[i] = sc.nextLine();
        }

        // Bubble sort in descending order
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - 1 - i; j++) {
                if (names[j].compareToIgnoreCase(names[j + 1]) < 0) {
                    // Swap names[j] and names[j+1]
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        // Display sorted names
        System.out.println("\nNames in Descending Order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
