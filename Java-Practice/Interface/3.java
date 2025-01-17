// A class extends another class and implements multiple Interfaces
interface A {
    int a = 10;

    void show();
}

interface B {
    void add(int a, int b);
}

class C {
    void display() {
        System.out.println("I am the method of class B");
    }

}

class D extends C implements A, B {
    public void show() {
        System.out.println("Value of a=" + a);
    }

    public void add(int a, int b) {
        int c = a + b;
        System.out.println("Sum=" + c);
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