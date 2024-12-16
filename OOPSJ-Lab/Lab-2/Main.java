class ObjectCounter {
    // Static variable to count the number of objects
    static int objectCount = 0;
    // Constructor increments the count each time an object is created
    public ObjectCounter() {
        objectCount++;
    }
    // Static method to display the number of objects created
    static void displayObjectCount() {
        System.out.println("Number of objects created: " + objectCount);
    }
}
public class Main {
    public static void main(String[] args) {
        // Creating objects
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        // Displaying the number of objects created
        ObjectCounter.displayObjectCount(); // Output: Number of objects created: 3
    }
}
