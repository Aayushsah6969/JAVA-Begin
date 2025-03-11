/*
Using String.split() method:
The split() method of String class can be used to extract a substring from a sentence. It accepts arguments in the form of a regular expression.
*/
// import java.util.*;  
  
class S11  
{      
public static void main(String args[])  
{    
String text= new String("Hello, My name is Rinku");   
String[] s1 = text.split(" ");
// System.out.println(s1);      
System.out.println(s1[0]);      
}  
}     