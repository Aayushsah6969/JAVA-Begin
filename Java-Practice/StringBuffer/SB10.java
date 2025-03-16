/*
deleteCharAt() method deletes the character at the index specified by 'l'.
StringBuffer deleteCharAt(int l)
*/
class SB10{  
public static void main(String args[]){  
//StringBuffer sb=new StringBuffer("KIIT University");
//String sb1=new String(sb); 
String sb=new String("KIIT");
StringBuffer sb1=new StringBuffer(sb);
sb1.reverse();
String sb2=new String(sb1);
System.out.println(sb2); 
 
}  
}  