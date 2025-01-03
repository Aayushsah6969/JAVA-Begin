public class method_overloading {
    void volume(int l, int b, int h){
        System.out.println("Volume of cuboid is: "+l*b*h);
    }
    void volume(double r, double h){
        System.out.println("Volume of cylinder is: "+3.14*r*r*h);
    }
    public static void main(String args[]){
        method_overloading obj = new method_overloading();
        obj.volume(5,6,7);
        obj.volume(3.5,8.0);
    }
}
