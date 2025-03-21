abstract class A{
     void show(){
        System.out.println("Hello");
    }
    abstract void add(int a, int b);
}
class B extends A{
    void add(int a, int b){
        System.out.println(a+b);
    }
}
class Main{
    public static void main(String[] args){
        B obj = new B();
        obj.show();
        obj.add(5, 10);
    }
}