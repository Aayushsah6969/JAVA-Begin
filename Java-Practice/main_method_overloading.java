public class main_method_overloading {
    void square(int num1){
        System.out.println("Square of "+num1+" is "+num1*num1);
    }
    void square(float num2){
        System.out.println("Square of "+num2+" is "+num2*num2);
    }
    public static void main(String[] args) {
        main_method_overloading obj = new main_method_overloading();
        obj.square(5);
    }
    public static void main(String[] args){
        main_method_overloading objs= new main_method_overloading();
        objs.square(4.5f);
    }
}
