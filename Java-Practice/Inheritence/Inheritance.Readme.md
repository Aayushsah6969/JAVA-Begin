# Inheritance in Java

## Introduction
**Inheritance** is a fundamental concept in object-oriented programming that allows one class (child class) to acquire the properties and behaviors of another class (parent class). This promotes code reuse, modularity, and hierarchical classification.

### Key Terms
- **Parent Class (Super Class)**: The class whose properties and methods are inherited.
- **Child Class (Sub Class)**: The class that inherits properties and methods from the parent class.
- **`super` Keyword**: A reference to the parent class, used to access parent class members and constructors.

---

## Why Use Inheritance?
1. **Code Reusability**: Common functionality can be defined once in a parent class and reused by child classes.
2. **Extensibility**: New classes can be created by extending existing ones.
3. **Polymorphism**: Enables dynamic method dispatch, enhancing flexibility and code clarity.
4. **Hierarchy Representation**: Models real-world relationships like "is-a" relationships.

---

## Types of Inheritance in Java
1. **Single Inheritance**:
   - A child class inherits from one parent class.
   - Example: `class B extends A {}`

2. **Multilevel Inheritance**:
   - A class inherits from a child class that is already inheriting another class.
   - Example: `class C extends B extends A {}`

3. **Hierarchical Inheritance**:
   - Multiple child classes inherit from the same parent class.
   - Example: `class B extends A; class C extends A;`

> **Note**: Java does not support multiple inheritance through classes to avoid ambiguity (diamond problem). However, multiple inheritance is achieved using interfaces.

---

## Example of Single Level Inheritance

### Code Example
```java
// Parent Class
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Child Class
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Buddy";
        dog.eat(); // Inherited method
        dog.bark(); // Child class method
    }
}
```

### Output
```
Buddy is eating.
Buddy is barking.
```

---

## Using the `super` Keyword
1. **Access Parent Class Methods**:
   The `super` keyword is used to call a method of the parent class when it is overridden in the child class.

2. **Access Parent Class Constructor**:
   The `super` keyword can invoke the constructor of the parent class to initialize inherited properties.

### Code Example
```java
class Animal {
    String name;

    // Parent Class Constructor
    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    // Child Class Constructor
    Dog(String name) {
        super(name); // Call to parent class constructor
    }

    @Override
    void eat() {
        super.eat(); // Call to parent class method
        System.out.println("Dog is eating dog food.");
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.eat(); // Calls overridden method with parent class method using super
        dog.bark(); // Child class method
    }
}
```

### Output
```
Buddy is eating.
Dog is eating dog food.
Buddy is barking.
```

---

## Theory Focus (College Curriculum and Interviews)

### Key Points
- **Definition**: Inheritance enables a class to acquire properties of another class.
- **Types**: Single, Multilevel, and Hierarchical inheritance are supported in Java.
- **`super` Keyword**: Used to access parent class members and constructors.

### Common Interview Questions
1. What is inheritance, and why is it used?
2. Explain the types of inheritance in Java.
3. Why does Java not support multiple inheritance through classes?
4. How is the `super` keyword used in inheritance?
5. What is the difference between `super` and `this` in Java?

---

Inheritance simplifies code reuse and enhances modularity, making it a core concept in object-oriented programming. Mastering this concept is essential for both academic and professional success.
