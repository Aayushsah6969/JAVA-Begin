class SharedResource {
    synchronized void printCount(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Thread1 extends Thread {
    SharedResource resource;

    Thread1(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        resource.printCount(1);
    }
}

class Thread2 extends Thread {
    SharedResource resource;

    Thread2(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        resource.printCount(10);
    }
}

public class TestSynchronization {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread1 t1 = new Thread1(resource);
        Thread2 t2 = new Thread2(resource);
        t1.start();
        t2.start();
    }
}