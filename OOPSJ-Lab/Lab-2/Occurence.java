import java.util.*;
public class Occurence {
    public static void main(String args[]){
        Scanner size = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = size.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter "+i+"th element: ");
            arr[i] = size.nextInt();
        }
        for(int i: arr){

        }

    }
}

/* import java.util.Scanner;

public class Occurrence{
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter numbers
        System.out.println("Enter list of numbers (e.g., 15 25 15 11 25 32 15 32):");
        String input = scanner.nextLine();
        
        // Split the input string into an array of numbers (as strings)
        String[] inputArray = input.split(" ");
        
        // Loop through the array of numbers
        System.out.println("Occurrences of each number:");
        for (int i = 0; i < inputArray.length; i++) {
            // Convert the number to an integer
            int number = Integer.parseInt(inputArray[i]);
            
            // Check if this number is already counted
            boolean isCounted = false;
            for (int j = 0; j < i; j++) {
                if (inputArray[j].equals(inputArray[i])) {
                    isCounted = true;
                    break;
                }
            }
            
            // If the number is not counted yet, count its occurrences
            if (!isCounted) {
                int count = 0;
                for (String num : inputArray) {
                    if (num.equals(inputArray[i])) {
                        count++;
                    }
                }
                System.out.println("Occurrence of " + number + " = " + count);
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}

/* */
