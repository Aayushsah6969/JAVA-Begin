//How read Integer inputs from a file
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ReadFile {  
  public static void main(String[] args) { 
   int data[]=new int[2];
   int a=0,b=0,c=0;
   int i=0; 
    try {
      File myObj = new File("C:FileOperationExample.txt");
      Scanner myReader = new Scanner(myObj);  
      while (myReader.hasNextInt()) {
        data[i] = myReader.nextInt();
        System.out.println(data[i]);
        i=i+1;
      }
      myReader.close();
     c=data[0]+data[1];
    System.out.println("Sum="+c);
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
   
   
   
  }  
} 