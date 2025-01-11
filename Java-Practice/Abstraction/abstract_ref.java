class A{
    void show(){
        System.out.println("A's method");
    }
}
class B extends A{
    void show(){
        System.out.println("B's method");
    }
}
class C extends A{
    void show(){
        System.out.println("C's method");
    }
}

class abstract_ref {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A ref;
        ref=a;
        ref.show();
        ref=b;
        ref.show();
        ref=c;
        ref.show();
    }
}
