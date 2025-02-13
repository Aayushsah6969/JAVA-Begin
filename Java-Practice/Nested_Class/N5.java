/*Java Member Inner class
A non-static class that is created inside a class but outside a method is called member inner class. It is also known as a regular inner class. It can be declared with access modifiers like public, default, private, and protected.
*/
/*Outer class can not access any member of it's member inner class
*/
class N5
{  
 private int data=30;
 void display()
 {
 System.out.println("Value of a="+a);
 }  
 class Inner
    {  
  int a=10;
  void msg()
   {
   System.out.println("Data="+data);
   }  
   } 
 public static void main(String args[])
  {  
  N5 obj=new N5();  
  N5.Inner in=obj.new Inner();  
  in.msg();
  obj.display();  
 }  
}  