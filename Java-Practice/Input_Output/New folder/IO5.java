/*
In this example, we are writing the data in the file testout.txt using Java FileWriter class.
*/
import java.io.FileWriter;  
public class IO5 {  
    public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("D:\\testout1.txt");    
           fw.write("Welcome to the class of OOPJ.");    
           fw.close();    
          }
          catch(Exception e)
          {
          System.out.println(e);
          }    
          System.out.println("Success...");    
     }    
}  