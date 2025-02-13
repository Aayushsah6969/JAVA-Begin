import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner;  
public class FileNotFoundExceptionExample {  
    public static void main(String[] args) {  
        try {  
            File file = new File("nonexistent_file.txt");  
            Scanner scanner = new Scanner(file);  
        } catch (FileNotFoundException e) {  
            System.out.println("File not found: " + e.getMessage());  
        }  
    }  
}  