// File: Main.java (outside both packages)
import java.util.Scanner;
import Marketing.Sales;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the employee id and employee name: ");
        int empid = scanner.nextInt();
        String ename = scanner.next();
        
        System.out.print("Enter the basic salary: ");
        double basic = scanner.nextDouble();

        // Creating sales employee object
        Sales salesPerson = new Sales(empid, ename);
        
        // Calculating earnings and allowance
        double totalEarnings = salesPerson.earnings(basic);
        double travelAllowance = salesPerson.tallowance(totalEarnings);
        
        // Displaying results
        System.out.println("The emp id of the employee is " + empid);
        System.out.println("The total earning is " + totalEarnings);

        scanner.close();
    }
}
