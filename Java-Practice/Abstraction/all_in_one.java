// child class of an abstract class is abstract
//constructor of abstract class
// static method of abstract class
// We can take the reference variable of an abstract class

abstract class A {
    int a, b;
    static final int q = 25;

    A(int x, int y) {
        a = x;
        b = y;
        System.out.println("I am the constructor of class A ");
    }

    static void show() {
        System.out.println("I have completed the show");
        System.out.println("Value of q=" + q);
    }

    abstract void add();
}

class C extends A {
    int c;

    C(int x, int y, int z) {
        super(x, y);
        c = z;
        System.out.println("I am the constructor of class C ");
    }

    void add() {
        int p;
        p = a + b + c;
        System.out.println("Sum=" + c);
    }
}

// Driver class
class all_in_one {
    public static void main(String args[]) {

        A c = new C(10, 20, 30);
        A.show();
        c.add();
    }
}