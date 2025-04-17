import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("input.txt");  // Open source file
            FileWriter fw = new FileWriter("output.txt"); // Open destination file
            
            int ch;
            while ((ch = fr.read()) != -1) { // Read character by character
                fw.write(ch);  // Write to destination file
            }

            fr.close(); // Close files
            fw.close();
            System.out.println("File copied successfully.");
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
