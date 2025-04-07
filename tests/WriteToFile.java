import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            // Create FileWriter object for the file "output.txt"
            FileWriter writer = new FileWriter("output.txt");

            // Write text to the file
            writer.write("Hello! This is a simple file writing example.\n");
            writer.write("Java is fun!");

            // Close the writer
            writer.close();

            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
