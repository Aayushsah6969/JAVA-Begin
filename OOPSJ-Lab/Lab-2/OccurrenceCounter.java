// import java.util.Scanner;

// public class OccurrenceCounter {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input array size
//         System.out.println("Enter the number of elements in the array:");
//         int n = scanner.nextInt();

//         // Input array elements
//         int[] arr = new int[n];
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         // Create a boolean array to keep track of counted elements
//         boolean[] counted = new boolean[n];

//         // Count and print occurrences
//         System.out.println("Occurrences of each number:");
//         for (int i = 0; i < n; i++) {
//             if (!counted[i]) { // Only process elements not yet counted
//                 int count = 1; // Initialize count for the current element
//                 for (int j = i + 1; j < n; j++) {
//                     if (arr[i] == arr[j]) {
//                         count++;
//                         counted[j] = true; // Mark duplicate as counted
//                     }
//                 }
//                 System.out.println("Occurrence of " + arr[i] + " = " + count);
//             }
//         }
//     }
// }

import java.util.Arrays;
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

        // Sort the array
        Arrays.sort(arr);

        // Count occurrences
        System.out.println("Occurrences of each number:");
        int i = 0;
        while (i < n) {
            int count = 1; // At least one occurrence
            while (i + 1 < n && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }
            System.out.println("Occurrence of " + arr[i] + " = " + count);
            i++;
        }
    }
}
