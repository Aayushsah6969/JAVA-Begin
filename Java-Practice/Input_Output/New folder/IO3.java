/*
Java FileReader class is used to read data from the file. It returns data in byte format like FileInputStream class.
It is character-oriented class which is used for file handling in java.
int read()-It is used to return a character in ASCII form. It returns -1 at the end of file.
*/
/*
void close() - It is used to close the FileReader class.
*/
import java.io.*;  
public class IO3{  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("D:\\testout.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
    }    
}    