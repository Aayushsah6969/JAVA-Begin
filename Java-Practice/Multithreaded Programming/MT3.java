//Example of Static synchronization
class A {
  synchronized static void ptable(int n) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(n * i);
      try {
        Thread.sleep(100);
      } catch (Exception e) {
      }
    }
  }
}

class MyThread1 extends Thread {
  public void run() {
    A.ptable(5);
  }
}

class MyThread2 extends Thread {
  public void run() {
    A.ptable(7);
  }
}

class MT3 {
  public static void main(String ar[]) {
    MyThread1 t1 = new MyThread1();
    MyThread2 t2 = new MyThread2();
    t1.start();
    t2.start();
  }
}
