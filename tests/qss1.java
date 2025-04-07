//Write a program in java which will display the working of two threads in synchronization

 
import java.util.Scanner;
class Thread1 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread 1 is running");
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class Thread2 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread 2 is running");
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
public class qss1
{
    public static void main(String args[])
    {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.start();
        t2.start();
        try
        {
            t1.join();
            t2.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}