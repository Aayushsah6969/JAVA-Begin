import java.util.*;

public class DiagonalSum {
    public static void main(String args[]) {
        Scanner num = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = num.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int Lsum = 0;
        int Rsum = 0;
        for (int i = 0; i < arr.length; i++) {
            Lsum += arr[i][i];
            Rsum += arr[i][arr.length - i - 1];
        }

        System.out.println("Sum of left diagonal: " + Lsum);
        System.out.println("Sum of right diagonal: " + Rsum);
        // arr[i][j] = (i+1)*(j+1);

    }
}
