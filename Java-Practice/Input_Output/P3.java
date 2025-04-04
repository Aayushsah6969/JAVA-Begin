// Importing the FileWriter class  
import java.io.FileWriter;   
   
// Importing the IOException class for handling errors  
import java.io.IOException;   
   
class  WriteOperation {  
    public static void main(String[] args) {  
      
    try {  
        FileWriter fwrite = new FileWriter("C:FileOperationExample.txt");  
        // writing the content into the FileOperationExample.txt file  
        //fwrite.write("A named location used to store related information is referred to as a File."); 
        fwrite.write("10 20 30 56 78");
   
        // Closing the stream  
        fwrite.close();   
        System.out.println("Content is successfully wrote to the file.");  
    } catch (IOException e) {  
        System.out.println("Unexpected error occurred");  
        e.printStackTrace();  
        }  
    }  
}  