class A{
    void show(){
        System.out.println("A's Method");
    }
}

class B extends A{
    void show(){
        System.out.println("B's Method");
    }
}

class C extends A{
    void show(){
        System.out.println("C's Method");
    }
}

public class hierarchial_dispatch {
    public static void main(String args[]){
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
