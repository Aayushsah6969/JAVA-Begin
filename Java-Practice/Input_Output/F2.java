//File copy
import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Getting file names from the user
        System.out.print("Enter source file name: ");
        String sourceFile = scanner.nextLine();
        
        System.out.print("Enter destination file name (for character stream copy): ");
        String charDestFile = scanner.nextLine();
        
        System.out.print("Enter destination file name (for byte stream copy): ");
        String byteDestFile = scanner.nextLine();
        
        scanner.close();
        
        // Copy using Character Stream
        copyUsingCharacterStream(sourceFile, charDestFile);
        
        // Copy using Byte Stream
        copyUsingByteStream(sourceFile, byteDestFile);
    }

    // Method to copy file using Character Stream (FileReader and FileWriter)
    private static void copyUsingCharacterStream(String source, String destination) {
        try (FileReader fr = new FileReader(source); FileWriter fw = new FileWriter(destination)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
            System.out.println("File copied successfully using Character Stream.");
        } catch (IOException e) {
            System.out.println("Error copying file using Character Stream: " + e.getMessage());
        }
    }

    // Method to copy file using Byte Stream (FileInputStream and FileOutputStream)
    private static void copyUsingByteStream(String source, String destination) {
        try (FileInputStream fis = new FileInputStream(source); FileOutputStream fos = new FileOutputStream(destination)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully using Byte Stream.");
        } catch (IOException e) {
            System.out.println("Error copying file using Byte Stream: " + e.getMessage());
        }
    }
}
