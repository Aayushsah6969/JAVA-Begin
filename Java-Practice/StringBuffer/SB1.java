/*
StringBuffer Class append() Method
The append() method concatenates the given argument with this String.
*/
class SB1{  
public static void main(String args[]){  
StringBuffer sb=new StringBuffer("Hello "); 
System.out.println(sb);//prints Hello  
sb.append("Java");//now original string is changed  
System.out.println(sb);//prints Hello Java  
}  
}  