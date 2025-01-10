abstract class A {
    abstract void show();

    abstract void add(int a, int b);
}

class B extends A {

    void show() {
        System.out.println("I have completed the show");
    }

    void add(int a, int b) {
        int c;
        c = a + b;
        System.out.println("Sum=" + c);
    }
}

// Driver class
class abstract1 {
    public static void main(String args[]) {

        B b = new B();

        b.show();
        b.add(12, 13);
    }
}
