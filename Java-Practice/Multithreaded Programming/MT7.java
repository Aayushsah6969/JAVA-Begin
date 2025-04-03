/*
The join() method waits for a thread to die. In other words, it causes the currently
running threads to stop executing until the thread it joins with completes its task.
public void join()throws InterruptedException
public void join(long milisecs)throws InterruptedException
*/
class Multi extends Thread
 {
 public void run()
 {
 for(int i=1;i<=5;i++)
 {
  try
   {
   Thread.sleep(1000);
   }
   catch(Exception e)
   {
   System.out.println(e);
   }
 System.out.println(i);
 }
 }
public static void main(String ar[])
{
Multi t1=new Multi();
Multi t2=new Multi();
Multi t3=new Multi();
      t1.start();
      try
      {
      t1.join();
      }
      catch(Exception e)
      {
      System.out.println(e);
      }
      t2.start();
      t3.start();
}
}