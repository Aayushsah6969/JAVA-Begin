/*
It is used to insert text at the specified position.
StringBuffer insert(int index, String str)
StringBuffer insert(int index, char ch)
*/
class SB8{  
public static void main(String args[]){  
StringBuffer sb=new StringBuffer("KIIT University");
//sb.insert(4,"CSE"); 
//sb.insert(0,2025);
//sb.insert(1,'B');
char a[]={'C','S','E'};
sb.insert(0,a);
System.out.println(sb);  
}  
}  