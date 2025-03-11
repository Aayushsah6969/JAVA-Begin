/*
The term "object slicing" refers to the scenario that occurs when an object of a derived class is assigned to an instance of a base class. It results in the derived class object losing methods and member variables. 
*/
class O1
{
void show()
{
System.out.println("Parent class method");
}
}
class O2 extends O1
{
void display()
{
System.out.println("Child class method");
}
}
class Main
{
public static void main(String ar[])
{
O1 ob=new O2();
ob.show();
//ob.display();
}
}