/*
Inter-thread Communication or Co-operation allow synchronized threads to communicate
with each other.
This is a mechanism in which a thread is paused running in its critical section and 
another thread is allowed to enter(or lock) in the same critical section to be executed. 
It is implemented by following methods of object class:
wait()
notify()
notifyAll()  
*/
class Customer
{
int amount=10000;
synchronized void withdraw(int amount)
 {
 System.out.println("Going to withdraw......");
 if(this.amount<amount)
   {
   System.out.println("Less balance; waiting for deposit......");
   try
    {
    wait();
    }
    catch(Exception e){  }
   }
  this.amount-=amount;
  System.out.println("Withdraw completed.....");
 }
synchronized void deposit(int amount)
 {
 System.out.println("Going to deposit......");
 this.amount+=amount;
 System.out.println("Deposit completed......");
 notify();
 }
}
class MT6
{
public static void main(String ar[])
{
final Customer c=new Customer();
 new Thread()
   {
   public void run()
    {
    c.withdraw(15000);
    }
   }.start();
 new Thread()
   {
   public void run()
    {
    c.deposit(10000);
    }
   }.start();
 }
}
