/*Java static nested class
A static class is a class that is created inside a class, is called a static nested class in Java. It cannot access non-static data members and methods. It can be accessed by outer class name.

It can access static data members of the outer class, including private.
The static nested class cannot access non-static (instance) data members or
Java static nested class example with instance method
*/

class N4
  {  
  static int data=30;  
  static class Inner
  {  
   void msg()
   {
   System.out.println("Data="+data);}  
   }  
  public static void main(String args[]){  
  N4.Inner obj=new N4.Inner();  
  obj.msg();  
  }  
}  