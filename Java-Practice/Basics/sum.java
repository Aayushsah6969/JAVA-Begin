import java.util.*;

class sum {
    public static void main(String args[]) {
        Scanner add = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int fn = add.nextInt();
        System.out.println("Enter second number: ");
        int sn = add.nextInt();
        System.out.println("The Sum = " + (fn + sn));
        add.close();
    }
}