/*
currentThread()
The currentThread() method returns a reference to the currently executing thread object.
public static Thread currentThread()
*/
class MT8 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String ar[]) {
        MT8 t1 = new MT8();
        MT8 t2 = new MT8();
        t1.start();
        t2.start();
    }
}