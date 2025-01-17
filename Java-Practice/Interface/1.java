// Define the interface
interface Animal {
    // Abstract method (no body)
    void makeSound();
    
    // Default method (has a body)
    default void sleep() {
        System.out.println("Sleeping...");
    }
}

// Implement the interface in a class
class Dog implements Animal {
    // Provide implementation for the abstract method
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
