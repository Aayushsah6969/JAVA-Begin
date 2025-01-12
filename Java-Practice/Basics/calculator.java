import java.util.*;

public class calculator {
    public static void main(String[] args){
        Scanner opert = new Scanner(System.in);
        int num1 =0;
        int num2=0;
        int choice =-1;
        while(choice != 000){
        System.out.println("1: SUM \n 2: DIFFERENCE\n 3: MULTIPLY\n 4: DIVISION \n 000: EXIT \n Enter your choice: ");
         choice = opert.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter first number: ");
                 num1 = opert.nextInt();
                System.out.println("Enter second number: ");
                 num2 = opert.nextInt();
                System.out.println("Sum = "+(num1+num2));
                break;
            case 2:
                System.out.println("Enter first number: ");
                 num1 = opert.nextInt();
                System.out.println("Enter second number: ");
                 num2 = opert.nextInt();
                System.out.println("Difference = "+(num1-num2));
                break;
            case 3:
                System.out.println("Enter first number: ");
                 num1 = opert.nextInt();
                System.out.println("Enter second number: ");
                 num2 = opert.nextInt();
                System.out.println("Product = "+(num1*num2));
                break;
            case 4:
                System.out.println("Enter first number: ");
                 num1 = opert.nextInt();
                System.out.println("Enter second number: ");
                 num2 = opert.nextInt();
                System.out.println("Division = "+(num1/num2));
                break;
            case 000:
                System.exit(0);
            default:
                System.out.println("Invalid choice");

        }
        }
    }
}
