import java.util.*;
class user_input_sum{
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = user.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = user.nextInt();
        int sum = num1+num2;
        System.out.println("The sum is: " + sum);
    }
}