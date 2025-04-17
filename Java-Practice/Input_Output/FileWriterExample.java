import java.io.*;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("output.txt"); // Create or overwrite file
            fw.write("Hello! This is a line written to the file.\n");
            fw.write("You can write multiple lines like this.");
            fw.close(); // Always close the writer
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
