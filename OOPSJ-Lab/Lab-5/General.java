// Save this file as General.java in the General package
package General;
class Employee {
    protected int empId; // Protected so it can be accessed by the subclass
    private String empName; // Private as per the requirement
    private double basicSalary;

    public Employee(int empId, String empName, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
    }

    public double earnings() {
        double da = 0.8 * basicSalary; // DA is 80% of basic salary
        double hra = 0.15 * basicSalary; // HRA is 15% of basic salary
        return basicSalary + da + hra;
    }
}
