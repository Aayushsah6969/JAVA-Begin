class A {
    int a; String name;
    A(){
        a=13;
        name="Aayush";
    }
    void show(){
        System.out.println(a+" "+name);
    }
}

class constructor1{
    public static void main(String[] args) {
        A objc = new A();
        objc.show();
    }
}
