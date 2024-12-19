

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
