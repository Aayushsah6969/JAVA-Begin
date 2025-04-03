/*
This method returns true if the thread upon which it is called is still running otherwise 
it returns false.
*/

class Five extends Thread
{
public void run()
 {
for(int i=1;i<=10;i++)
 System.out.println(5*i);
 }
}
class Seven extends Thread
 {
 public void run()
 {
 for(int i=1;i<=10;i++)
  System.out.println(7*i);
 }
}
class MT10
{
public static void main(String ar[])
{
Five t1=new Five();
Seven t2=new Seven();
System.out.println(t1.isAlive());
t1.start();
System.out.println(t1.isAlive());
try
{
t2.sleep(100);
}
catch(InterruptedException e){ }
System.out.println(t2.isAlive());
t2.start();
}
}