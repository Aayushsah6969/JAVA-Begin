class A{
    int x,y;
    A(int a, int b){
        x=a; y=b;
    }
    void show(){
        System.out.println(x+" "+y);
    }
}

class constructor2 {
    public static void main(String[] args){
        A a = new A(10,20);
        a.show();
    }
}
