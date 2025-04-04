import java.io.*;
import java.util.Scanner;

public class F1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "Input.txt";

        try {
            // Writing to file
            FileWriter writer = new FileWriter("C:Input.txt");
            
            System.out.print("Enter number of students: ");
            int numStudents = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            for (int i = 0; i < numStudents; i++) {
                System.out.println("Enter details for Student " + (i + 1) + ":");

                System.out.print("Roll Number: ");
                int rollNo = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Subject: ");
                String subject = scanner.nextLine();

                System.out.print("Marks: ");
                int marks = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                // Write data to file
                writer.write(rollNo + "," + name + "," + subject + "," + marks + "\n");
            }
            writer.close();

            // Reading from file
            System.out.println("\nStudent Details from File:");
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] studentData = line.split(",");
                System.out.println("Roll No: " + studentData[0] + 
                                   ", Name: " + studentData[1] + 
                                   ", Subject: " + studentData[2] + 
                                   ", Marks: " + studentData[3]);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
