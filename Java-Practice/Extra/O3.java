//Use of this keyword
/*
The this keyword in Java is used to refer to the current object or class instance. It's a reserved keyword that's used to access instance variables, invoke methods and constructors, and more. 
*/
class O3
{
int a,b;      
O3(int a,int b)
{
a=a;    
b=b;    
}
void show()
{
System.out.println("Value of a="+a+" Value of b="+b);
}
}
class Main
{
public static void main(String ar[])
{
O3 ob=new O3(5,7);
ob.show();
}
}