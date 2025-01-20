import java.util.*;

interface Salary {
    void earning(int basic);
    void deduction(int basic);
    void bonus(int basic);
}

class Manager implements Salary {
    public void earning(int basic) {
        int earn = basic + (basic * 80 / 100) + (basic * 15 / 100);
        System.out.println("Earnings = " + earn);
    }

    public void deduction(int basic) {
        int ded = basic * 12 / 100;
        System.out.println("Deduction = " + ded);
    }

    public void bonus(int basic) {
        // No implementation in Manager
    }
}

class Substaff extends Manager {
    public void bonus(int basic) {
        int bns = basic * 50 / 100;
        System.out.println("Bonus = " + bns);
    }
}

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the basic salary: ");
        int salary = sc.nextInt();
        
        Substaff substaff = new Substaff();
        substaff.earning(salary);
        substaff.deduction(salary);
        substaff.bonus(salary);
        
        sc.close();
    }
}
