abstract class A{
    A(){
        System.out.println("I'am Constructor of A");
    }
    abstract void show();
    abstract void add(int a, int b);
}

abstract class B extends A{
    B(){
        System.out.println("I'am Constructor of B");
    }
}
class C extends B{
    C(){
        System.out.println("I'am Constructor of C");
    }
    void show(){
        System.out.println("I'am show of C");
    }
    void add (int a, int b){
        System.out.println("Sum ="+(a+b));
    }
}

class const_abst {
    public static void main(String[] args) {
        C on =new C();
        on.show();
        on.add(10, 20);
    }
}
