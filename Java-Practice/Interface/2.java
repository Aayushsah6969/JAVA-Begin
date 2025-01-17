// A class can implement multiple Interfaces
interface A {
    int a = 10;

    void show();
}

interface B {
    void add(int a, int b);
}

interface C {
    void display();
}

class D implements A, B, C {
    public void show() {
        System.out.println("Value of a=" + a);
    }

    public void add(int a, int b) {
        int c = a + b;
        System.out.println("Sum=" + c);
    }

    public void display() {
        System.out.println("I am the method of class B");
    }
}

class Main {
    public static void main(String ar[]) {
        D ob = new D();
        ob.show();
        ob.display();
        ob.add(9, 10);
    }
}