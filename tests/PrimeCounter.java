import java.util.Scanner;

public class PrimeCounter {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String args[]) {
        int[] numbers = new int[5];
        for (int i = 0; i < 3; i++) {
            numbers[i] = Integer.parseInt(args[i]); // Command-line args
        }
        Scanner sc = new Scanner(System.in);
        numbers[3] = sc.nextInt();
        numbers[4] = sc.nextInt();
        sc.close();

        int count = 0;
        for (int num : numbers) {
            if (isPrime(num)) count++;
        }
        System.out.println("Total prime numbers: " + count);
    }
}
 