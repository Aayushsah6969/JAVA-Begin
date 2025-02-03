// File: Sales.java (inside package Marketing)
package Marketing;
import General.Employee;

public class Sales extends Employee {
    public Sales(int empid, String ename) {
        super(empid, ename);
    }

    public double tallowance(double totalEarnings) {
        return 0.05 * totalEarnings; // 5% of total earnings
    }
}
