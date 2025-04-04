/*
The BufferedReader class, part of Java's java.io package, provides a convenient way to read text from an input stream. It extends the abstract class Reader and offers additional functionality for buffering input, making it particularly suitable for scenarios where reading character data is required, such as parsing text files or processing network communication.
*/
/*
int read()-It is used for reading a single character.
*/

//File Reading
import java.io.*;  
public class IO2{  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("D:\\testout.txt");    
          BufferedReader br=new BufferedReader(fr);    
  
          int i;    
          while((i=br.read())!=-1){  
          System.out.print((char)i);  
          }  
          br.close();    
          fr.close();    
    }    
}    