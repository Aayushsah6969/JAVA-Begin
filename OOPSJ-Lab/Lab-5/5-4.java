import java.util.*;
interface employee{
    void getDetails(int emp_id, String emp_name);
}

interface Manager extends employee{
    void getDeptDetails(int dpt_id, String dpt_name);
}

class head implements Manager{
    int emp_id;
    String emp_name;
    int dpt_id;
    String dpt_name;
    public void getDetails(int id, String name){
        emp_id = id;
        emp_name = name;
        System.out.println("Details of Employee and Department");
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
    }
    public void getDeptDetails(int id, String name){
        dpt_id = id;
        dpt_name = name;
        System.out.println("Department ID: " + dpt_id);
        System.out.println("Department Name: " + dpt_name);
    }
}

class main{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        head h = new head();
        System.out.print("Enter the employee id: ");
        int emp_id = sc.nextInt();
        System.out.print("Enter the employee name: ");
        String emp_name = sc.next();
        System.out.print("Enter the department id: ");
        int dpt_id = sc.nextInt();
        System.out.print("Enter the department name: ");
        String dpt_name = sc.next();
        h.getDetails(emp_id, emp_name);
        h.getDeptDetails(dpt_id, dpt_name);
    }
}