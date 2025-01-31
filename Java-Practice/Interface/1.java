// Define the interface
interface Animal {
    void makeSound();
    
    default void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Implement the interface in another class
class Cat implements Animal {
    // Provide implementation for the abstract method
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

// Main class to demonstrate the interface usage
class main {
    public static void main(String[] args) {
        // Create objects of the implementing classes
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call the methods
        dog.makeSound();
        dog.sleep();

        cat.makeSound();
        cat.sleep();
    }
}
