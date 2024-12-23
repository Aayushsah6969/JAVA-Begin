
/* 
import java.util.*;

public class OccurrenceCounter {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number of elements in the array
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        
        // Create an array of the entered size
        int[] arr = new int[n];

        // Ask the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Loop through the array to count occurrences of each element
        System.out.println("Occurrences of each number:");
        for (int i = 0; i < n; i++) {
            // Check if this element has already been counted
            boolean isCounted = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isCounted = true;
                    break;
                }
            }

            // If the number is not counted yet, count its occurrences
            if (!isCounted) {
                int count = 0;
                for (int k = 0; k < n; k++) {
                    if (arr[k] == arr[i]) {
                        count++;
                    }
                }
                System.out.println("Occurrence of " + arr[i] + " = " + count);
            }
        }
    }
}
*/

 import java.util.Scanner;

public class OccurrenceCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Create a boolean array to keep track of counted elements
        boolean[] counted = new boolean[n];

        // Count and print occurrences
        System.out.println("Occurrences of each number:");
        for (int i = 0; i < n; i++) {
            if (!counted[i]) { // Only process elements not yet counted
                int count = 1; // Initialize count for the current element
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        counted[j] = true; // Mark duplicate as counted
                    }
                }
                System.out.println("Occurrence of " + arr[i] + " = " + count);
            }
        }
    }
}

