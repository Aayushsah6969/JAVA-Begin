interface A{
    public static final int a =10;
    public abstract void show();
}
class B implements A{
    public void show(){
        System.out.println("Value of a="+a);
    }
    void display(){
        System.out.println("I am the method of class B");
    }
}

class main{
    public static void main(String arg[]){
        B ob = new B();
        ob.show();
        ob.display();
    }
}