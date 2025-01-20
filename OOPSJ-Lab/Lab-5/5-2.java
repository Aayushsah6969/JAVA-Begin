interface motor{
    int cap=10;
    void run();
    void consume();
}

class WashingMachine implements motor{
    public void run(){
        System.out.println("Washing Machine is running");
    }
    public void consume(){
        System.out.println("Washing Machine is consuming electricity");
    }
    public void display(){
        System.out.println("Capacity of Washing Machine is "+cap+"kg");
    }
}

class main{
    public static void main(String ar[]){
        WashingMachine ob = new WashingMachine();
        ob.run();
        ob.consume();
        ob.display();
    }
}