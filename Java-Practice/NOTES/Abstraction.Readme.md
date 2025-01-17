# Abstraction in Java

## Introduction
**Abstraction** is a process in object-oriented programming that hides implementation details and shows only the essential features of an object. It focuses on "what an object does" rather than "how it does it."

Abstraction in Java is implemented using:
1. **Abstract Classes**
2. **Interfaces**

---

## Types of Abstraction
1. **Abstract Class**:
   - A class that is declared with the `abstract` keyword.
   - It can have abstract methods (methods without a body) as well as concrete methods (methods with a body).

2. **Interface**:
   - A blueprint of a class that can have only abstract methods (until Java 7).
   - From Java 8 onwards, it can also include default and static methods.

---

## The `abstract` Keyword
- The `abstract` keyword is used to define an abstract class or method.
- **Abstract Method**:
  - A method that does not have a body and must be implemented by subclasses.
  - Example:
    ```java
    abstract void display();
    ```
- **Abstract Class**:
  - A class that cannot be instantiated directly and may include abstract methods.
  - Example:
    ```java
    abstract class Shape {
        abstract void draw();
    }
    ```

---

## Use Cases of Abstraction
1. **Defining a Template**: Provide a base class for related classes to share common behavior.
2. **Reducing Code Duplication**: Abstract methods ensure consistent implementation in subclasses.
3. **Encapsulation and Modularity**: Keeps implementation details hidden from the user.
4. **Code Maintainability**: Promotes clear separation of concerns.

---

## Features/Properties of Abstraction
1. **Cannot Instantiate Abstract Classes**: An abstract class cannot be instantiated directly.
2. **Partial Implementation**: Abstract classes may contain both abstract and concrete methods.
3. **Must Be Extended**: Subclasses must implement all abstract methods unless they are also declared abstract.
4. **Supports Constructor Chaining**: Abstract classes can have constructors that can be called during object creation in subclasses.

---

## Constructor Chaining Using Multilevel Inheritance
Constructor chaining is the process of calling a parent class constructor from a child class constructor. This ensures that all parent class properties are initialized before the child class is constructed.

### Code Example
```java
abstract class Animal {
    String name;

    // Abstract class constructor
    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }

    abstract void sound();
}

class Mammal extends Animal {
    Mammal(String name) {
        super(name); // Calls the constructor of the parent class
        System.out.println("Mammal constructor called");
    }

    @Override
    void sound() {
        System.out.println(name + " makes a mammal sound.");
    }
}

class Dog extends Mammal {
    Dog(String name) {
        super(name); // Calls the constructor of Mammal
        System.out.println("Dog constructor called");
    }

    @Override
    void sound() {
        System.out.println(name + " barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.sound();
    }
}
```

### Output
```
Animal constructor called
Mammal constructor called
Dog constructor called
Buddy barks.
```

---

## Tips and Notes
1. **When to Use Abstract Classes**:
   - Use abstract classes when classes share some behavior but should have their unique implementation for specific methods.

2. **Difference Between Abstract Classes and Interfaces**:
   - Abstract classes allow partial implementation, while interfaces (before Java 8) are purely abstract.
   - A class can implement multiple interfaces but can extend only one abstract class.

3. **Real-World Analogy**:
   - Abstract class: A general template, like "Vehicle."
   - Concrete subclass: Specific vehicles like "Car" or "Bike," each having unique implementations.

4. **Error to Avoid**:
   - Do not try to instantiate an abstract class directly.

---

## Common Interview Questions
1. What is abstraction, and why is it used?
2. Explain the difference between abstraction and encapsulation.
3. Can abstract classes have constructors in Java?
4. What is the difference between abstract classes and interfaces?
5. Can an abstract class have a main method? Why or why not?

---

Abstraction is a cornerstone of object-oriented programming that simplifies code, enforces modularity, and promotes reusability. Understanding its nuances and practical applications is crucial for excelling in academic and professional settings.
