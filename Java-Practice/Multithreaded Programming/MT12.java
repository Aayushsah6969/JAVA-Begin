//Example of synchronized block
class A {
  void ptable(int n) {
    synchronized (this) {
      for (int i = 1; i <= 10; i++) {
        System.out.println(n * i);
        try {
          Thread.sleep(1000);
        } catch (Exception e) {
        }
      }
    }
  }
}

class MyThread1 extends Thread {
  A t;

  MyThread1(A p) {
    t = p;
  }

  public void run() {
    t.ptable(5);
  }
}

class MyThread2 extends Thread {
  A t;

  MyThread2(A p) {
    t = p;
  }

  public void run() {
    t.ptable(7);
  }
}

class MT12 {
  public static void main(String ar[]) {
    A obj = new A();
    MyThread1 t1 = new MyThread1(obj);
    MyThread2 t2 = new MyThread2(obj);
    t1.start();
    t2.start();
  }
}
