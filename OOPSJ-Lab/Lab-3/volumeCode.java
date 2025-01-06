import java.util.*;
class Box {
     double length;
     double width;
     double height;

    
     Box(double x, double y, double z) {
         length=x;
         width=y;
         height=z;
    }

     double volume() {
        return length * width * height;
    }
}

 class Demo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);


        System.out.println("Enter the dimensions of the box:");
        System.out.print("Length: ");
        double length = sc.nextDouble();
        System.out.print("Width: ");
        double width = sc.nextDouble();
        System.out.print("Height: ");
        double height = sc.nextDouble();

        
        Box ob = new Box(length, width, height);

        System.out.println("The volume of the box is: " + ob.volume() + " cubic units.");

}
}