// Save this file as Marketing.java in the Marketing package
package Marketing;

import General.Employee; // Import Employee class from General package

public class Marketing extends Employee {
    public Marketing(int empId, String empName, double basicSalary) {
        super(empId, empName, basicSalary); // Call the constructor of the superclass
    }

    public double tAllowance() {
        double totalEarnings = earnings(); // Get the total earnings
        return 0.05 * totalEarnings; // Travelling Allowance is 5% of total earnings
    }
}
