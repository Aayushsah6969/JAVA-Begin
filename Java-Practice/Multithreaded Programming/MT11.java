/*
public final int getPriority() method of Thread class returns priority of the given thread.
public final void setPriority(int newpriority) method changes the priority of thread to the value newpriority.
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
class MT11
{
public static void main(String ar[])
{
Five t1=new Five();
Seven t2=new Seven();
System.out.println("Priority of t1="+t1.getPriority());
System.out.println("Priority of t2="+t2.getPriority());
t1.setPriority(2);
t2.setPriority(7);
System.out.println("Priority of t1="+t1.getPriority());
System.out.println("Priority of t2="+t2.getPriority());
t2.start();
t1.start();
}
}