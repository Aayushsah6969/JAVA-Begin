//Calling parameterized constructor from default constructor
class O6
{  
O6()
{
this(5); //call to this must be first statement in constructor
System.out.println("Hello Java");
}  
O6(int x)
{   
System.out.println(x);  
}  
}  
class Main
{  
public static void main(String args[])
{  
O6 ob=new O6();  
}
}  