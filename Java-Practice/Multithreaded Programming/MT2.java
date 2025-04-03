/*
Write a program to find the thread used by JVM to execute the statements.
currentThread() is a static method in Thread class
*/
class MT2 {
    public static void main(String ar[]) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread=" + t);
        System.out.println("Its name=" + t.getName());
    }
}