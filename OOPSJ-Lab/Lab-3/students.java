import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    Student(int x, String y, double z) {
        roll = x;
        name = y;
        cgpa = z;
    }
}

 class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of students:");
        int n = sc.nextInt();
        sc.nextLine(); 

        Student[] students = new Student[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details for student " + (i + 1));
            System.out.print("Enter the roll of the student: ");
            int roll = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter the name of the student: ");
            String name = sc.nextLine();
            System.out.print("Enter the CGPA of the student: ");
            double cgpa = sc.nextDouble();
            sc.nextLine(); 

            students[i] = new Student(roll, name, cgpa);
        }

        
        System.out.println("\nStudent Details:");
        for (Student student : students) {
            System.out.println("Roll: " + student.roll + ", Name: " + student.name + ", CGPA: " + student.cgpa);
        }

    
        Student lowestCgpaStudent = students[0];
        for (Student student : students) {
            if (student.cgpa < lowestCgpaStudent.cgpa) {
                lowestCgpaStudent = student;
            }
        }

        
        System.out.println("\nStudent with the lowest CGPA:");
        System.out.println("Name: " + lowestCgpaStudent.name + ", CGPA: " + lowestCgpaStudent.cgpa);

        sc.close();
}
}
