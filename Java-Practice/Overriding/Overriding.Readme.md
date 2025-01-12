# Overriding in Java

## Introduction
**Overriding** is a feature of object-oriented programming in Java that allows a subclass to provide a specific implementation for a method already defined in its parent class. The overridden method in the child class must have the same name, return type, and parameters as the method in the parent class.

### Key Rules for Method Overriding
1. The method must have the same name, return type, and parameter list as in the parent class.
2. The access modifier of the overridden method in the child class cannot be more restrictive than that of the parent class.
3. Methods declared as `final` or `static` cannot be overridden.
4. The overriding method can throw the same or a subclass of the exceptions thrown by the parent method.

---

## Why Use Method Overriding?
1. **Runtime Polymorphism**: Enables dynamic method dispatch, where the method to be executed is determined at runtime.
2. **Custom Behavior**: Allows a subclass to provide specific implementations for inherited methods.

---

## Example of Method Overriding

### Code Example
```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Runtime polymorphism
        animal.sound(); // Calls overridden method in Dog class
    }
}
```

### Output
```
Dog barks
```

---

## Using the `final` Keyword

### What is the `final` Keyword?
The `final` keyword in Java is used to restrict the modification of variables, methods, or classes.

### Applications
1. **Final Variable**:
   - A variable declared as `final` cannot be reassigned after initialization.
   - Example:
     ```java
     final int MAX = 100;
     MAX = 200; // Compilation error
     ```

2. **Final Method**:
   - A method declared as `final` cannot be overridden by subclasses.
   - Example:
     ```java
     class Animal {
         final void sound() {
             System.out.println("Animal makes a sound");
         }
     }

     class Dog extends Animal {
         // Compilation error: Cannot override final method
         void sound() {
             System.out.println("Dog barks");
         }
     }
     ```

3. **Final Class**:
   - A class declared as `final` cannot be extended by any other class.
   - Example:
     ```java
     final class Animal {
         void sound() {
             System.out.println("Animal makes a sound");
         }
     }

     class Dog extends Animal { // Compilation error: Cannot inherit from final class
     }
     ```

---

## Reference Variables in Overriding
In Java, the method to execute is determined by the object type, not the reference type. This is a key feature of runtime polymorphism.

### Code Example
```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Reference of Animal, object of Dog
        animal.sound(); // Calls Dog's overridden method

        Animal anotherAnimal = new Animal();
        anotherAnimal.sound(); // Calls Animal's method
    }
}
```

### Output
```
Dog barks
Animal makes a sound
```

---

## Theory Focus (College Curriculum and Interviews)

### Key Points
- **Overriding** allows a subclass to provide its own implementation for an inherited method.
- **`final` Keyword**:
  - Prevents reassignment (variables).
  - Prevents overriding (methods).
  - Prevents inheritance (classes).
- **Dynamic Method Dispatch** determines the method to execute at runtime based on the object's actual type.

### Common Interview Questions
1. What is method overriding, and how is it different from method overloading?
2. Can a `final` method be overridden? Why or why not?
3. What is dynamic method dispatch in Java?
4. How does the `final` keyword affect inheritance?
5. Can you explain the difference between reference type and object type in overriding?

---

Method overriding is an essential concept for achieving runtime polymorphism and customizing behavior in object-oriented programming. Mastery of this concept is critical for both academic success and professional interviews.
