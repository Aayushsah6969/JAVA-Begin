abstract class A{
    abstract void show();
    void add(int a, int b){
        int c = a+b;
        System.out.println("Sum = "+c);
    }
}

class B extends A{
    void show(){
        System.out.println("Class A implemented");
    }
}

class both {
    public static void main(String args[]){
        B ob = new B();
        ob.show();
        ob.add(3,4);
    }
}
