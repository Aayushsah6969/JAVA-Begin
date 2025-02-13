/*Java Member Inner class
A non-static class that is created inside a class but outside a method is called member inner class. It is also known as a regular inner class. It can be declared with access modifiers like public, default, private, and protected.
*/
class N1
{  
 private int data=30;  
 class Inner
    {  
  void msg()
   {
   System.out.println("Data="+data);
   }  
   } 
 public static void main(String args[]){  
  N1 obj=new N1();  
  N1.Inner in=obj.new Inner();  
  in.msg();  
 }  
}  