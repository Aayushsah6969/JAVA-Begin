// Save this file as Main.java in the default package or create another package
import Marketing.Sales; // Import Sales class from Marketing package

public class Main {
    public static void main(String[] args) {
        // Input: Employee details
        int empId = 101;
        String empName = "John Doe";
        double basicSalary = 50000; // Example basic salary

        // Create an instance of Sales class
        Sales salesPerson = new Sales(empId, empName, basicSalary);

        // Calculate total earnings and traveling allowance
        double totalEarnings = salesPerson.earnings();
        double travelAllowance = salesPerson.tAllowance();

        // Display results
        System.out.println("Employee ID: " + salesPerson.empId);
        System.out.println("Total Earnings: " + totalEarnings);
        System.out.println("Travel Allowance: " + travelAllowance);
    }
}
