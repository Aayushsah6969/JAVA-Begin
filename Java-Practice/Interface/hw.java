interface A{
    default void vehicle(){
        System.out.println("Vehicle A");
    }
}
interface B{
    default void vehicle(){
        System.out.println("Vehicle B");
    }
}
class hw implements A,B{
    public void vehicle(){
        A.super.vehicle();
        B.super.vehicle();
    }
    public static void main(String ar[]){
        hw h = new hw();
        h.vehicle();
    }
}