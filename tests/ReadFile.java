import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try {
            // Create FileWriter object for the file "output.txt"
            FileReader reader = new FileReader("output.txt");
int i;
while((i=reader.read())!=-1){
    // Print the character read from the file
    System.out.print((char)i);
}
            // Close the reader
            reader.close();
           

            System.out.println("File read successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
