class pen{
    String color;
    String name;
    String brand;

    public void write(){
        System.out.println("This is a Pen");
    }
    public void desc(){
        System.out.println("Pens color ="+this.color+" name = "+this.name+" brand = "+this.brand);
    }
}

public class oops{
    public static void main(String args[]){
        pen p1 = new pen();
        p1.color = "red";
        p1.name="mero pen";
        p1.brand="Techno tip";
        p1.write();
        p1.desc();

        pen p2 = new pen();
        p2.color = "Green";
        p2.name="mero pen";
        p2.brand="Techno tip";
        p2.write();
        p2.desc();
    }
}
