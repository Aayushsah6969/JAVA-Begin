/*Java is strictly call by value when we pass the reference of the object it creates a copy of the reference and then passes it as value to the method. The copy reference also points to the same address so all the changes also reflect in the main method this is the main difference between call by value in java and call by reference in java. 
*/

//Example of Call by Reference in Java using Object

class Main{
    int number=10;
    
    // pass object as parameter
    public static void increment(Main pb){
        pb.number = pb.number+1;  // increment variable by 1
        System.out.println("value in method: "+pb.number);
    }
    
    public static void main(String[] args) {
    Main pb=new Main(); // pb is an object of class Main
        
        System.out.println("value before method call: "+pb.number);
        increment(pb); // pass object of the class Main
        System.out.println("value after method call: "+pb.number);
    }
}
/*Output

value before method call: 10
value in method: 11
value after method call: 11
*/