/*
this() : to invoke current class constructor
The this() constructor call can be used to invoke the current class constructor. It is used to reuse the constructor. In other words, it is used for constructor chaining.
*/

//Calling default constructor from parameterized constructor:

class O5
{  
O5()
{
System.out.println("Hello Java");
}  
O5(int x)
{  
this();  
System.out.println(x);  
}  
}  
class Main
{  
public static void main(String args[])
{  
O5 ob=new O5(10);  
}
}  