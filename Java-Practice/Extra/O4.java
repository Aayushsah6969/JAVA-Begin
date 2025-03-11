/*
this: to invoke current class method
the method of the current class may be invoked by using the this keyword. If you don't use the this keyword, compiler automatically adds this keyword while invoking the method.
*/
class O4{  
void show()
{
System.out.println("I am show method");
}  
void display()
{  
System.out.println("I am display method");  
//show();//same as this.show()  
this.show();  
}  
}  
class Main{  
public static void main(String args[]){  
O4 ob=new O4();  
ob.display();  
}}  