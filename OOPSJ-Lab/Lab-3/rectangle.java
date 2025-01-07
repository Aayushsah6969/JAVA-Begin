
class Rectangle{
    double length;
    double breadth;
    double area;
    double perimeter;

    Rectangle(double x, double y)
    {
        length=x;
        breadth=y;
    }
    void calculate()
    {
         area=length*breadth;
         perimeter=2*(length+breadth);
    }
    void display()
    {
        System.out.println("The area of rectangle is"+area);
        System.out.println("The perimeter of rectangle is"+perimeter);
    }

}

class Main{
        public static void main(String args[])
        {
            Rectangle ob=new Rectangle(5,4);
            ob.calculate();
            ob.display();
}
}