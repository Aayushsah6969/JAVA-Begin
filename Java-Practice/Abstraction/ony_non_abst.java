abstract class A{
    void show(){
        System.out.println("I have completed the show!!");
    }
    void add(int a, int b){
        int c = a+b;
        System.out.println("The sum is "+c);
    }
}
class B extends A{
    void display(){
        System.out.println("CSE");
    }
}
//driver class



class ony_non_abst {
    public static void main(String args[]){
        B ob = new B();
        ob.show();
        ob.add(2,5);
        ob.display();
    }
}
