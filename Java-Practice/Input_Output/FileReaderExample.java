import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("output.txt"); // Open file to read
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch); // Print each character
            }
            fr.close(); // Always close the reader
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
