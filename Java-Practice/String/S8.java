/*
Java String intern() Method
A pool of strings, initially empty, is maintained privately by the class String.

When the intern method is invoked, if the pool already contains a String equal to this String object as determined by the equals(Object) method, then the String from the pool is returned. Otherwise, this String object is added to the pool and a reference to this String object is returned.
*/
class S8  
{  
public static void main(String ar[])  
{  
String s=new String("KIIT");    
String s2=s.intern();    
System.out.println(s2);    
}  
}  