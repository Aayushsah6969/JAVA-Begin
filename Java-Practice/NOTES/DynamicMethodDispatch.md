# Dynamic Method Dispatch in Java

## **Introduction**
Dynamic Method Dispatch (also known as Runtime Polymorphism) is a mechanism in Java that allows a method to be overridden in a subclass and the correct version of the method to be called at runtime, depending on the type of the object being referred to. This is one of the key features of Object-Oriented Programming (OOP).

It is implemented through method overriding and ensures that the method executed is determined by the actual object being referenced, not the reference type.

---

## **Key Concepts**

### **What is Dynamic Method Dispatch?**
Dynamic Method Dispatch is the process by which a call to an overridden method is resolved at runtime rather than compile-time. This is achieved by using a superclass reference to point to a subclass object.

### **Why Use Dynamic Method Dispatch?**
- To achieve **runtime polymorphism**.
- To implement **method overriding**.
- To create **flexible and extensible code**.
- To allow subclass-specific implementations while maintaining a uniform interface.

---

## **How It Works**
- A superclass reference variable is used to store the reference of a subclass object.
- When a method is called using this reference, Java determines which version of the method to execute based on the actual object type (subclass) at runtime.

---

## **Syntax**
```java
class Superclass {
    void display() {
        System.out.println("Display from Superclass");
    }
}

class Subclass extends Superclass {
    @Override
    void display() {
        System.out.println("Display from Subclass");
    }
}

public class DynamicDispatchDemo {
    public static void main(String[] args) {
        Superclass obj = new Subclass(); // Superclass reference pointing to Subclass object
        obj.display(); // Calls the overridden method in Subclass
    }
}
```

**Output**:
```
Display from Subclass
```

---

## **Example**
### **Basic Example**
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

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class DynamicDispatchExample {
    public static void main(String[] args) {
        Animal animal; // Reference of superclass

        animal = new Dog();
        animal.sound(); // Calls Dog's sound method

        animal = new Cat();
        animal.sound(); // Calls Cat's sound method
    }
}
```
**Output**:
```
Dog barks
Cat meows
```

---

### **Real-World Use Case Example**
```java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape shape;

        shape = new Circle();
        shape.draw(); // Calls Circle's draw method

        shape = new Rectangle();
        shape.draw(); // Calls Rectangle's draw method
    }
}
```
**Output**:
```
Drawing a Circle
Drawing a Rectangle
```

---

## **Key Points**
1. **Method Resolution at Runtime**:
   - Java uses the type of the object being referred to, not the type of the reference variable, to decide which method to execute.

2. **Superclass Reference, Subclass Object**:
   - A superclass reference can point to a subclass object, enabling dynamic dispatch.

3. **Overridden Methods Only**:
   - Only methods that are overridden are resolved at runtime.
   - Fields (variables) are resolved at compile-time based on the reference type.

---

## **Advantages**
1. **Flexibility**:
   - Allows the implementation of polymorphic behavior.
2. **Extensibility**:
   - Makes it easier to add new functionality by introducing new subclasses.
3. **Reusability**:
   - Promotes code reuse and cleaner code.

---

## **Limitations**
1. **Only Applicable to Methods**:
   - Does not apply to fields or static methods.

2. **Performance Overhead**:
   - Method calls are resolved at runtime, which may introduce a slight performance overhead compared to compile-time resolution.

---

## **Tips for Interviews**
1. **Dynamic Dispatch and Polymorphism**:
   - Be clear about the relationship between dynamic dispatch and runtime polymorphism.
2. **Static vs Dynamic Binding**:
   - Remember that fields and static methods are resolved at compile-time (static binding), while instance methods are resolved at runtime (dynamic binding).
3. **Common Misconceptions**:
   - Understand that the reference type determines what members (fields) are accessible, but the object type determines which method implementation is executed.

---

## **Key Differences: Static Binding vs Dynamic Binding**
| **Aspect**          | **Static Binding**                  | **Dynamic Binding**              |
|---------------------|------------------------------------|----------------------------------|
| **Resolution Time** | Compile-time                      | Runtime                          |
| **Applicable To**   | Static methods and fields         | Instance methods                 |
| **Performance**     | Faster                            | Slightly slower due to runtime resolution |

---

## **Frequently Asked Questions**

1. **What is the main purpose of Dynamic Method Dispatch?**
   - To achieve runtime polymorphism and allow flexibility in code execution.

2. **Can static methods be overridden?**
   - No, static methods are bound at compile-time and cannot participate in dynamic dispatch.

3. **How is dynamic method dispatch implemented in Java?**
   - By using a superclass reference to refer to a subclass object and overriding methods in the subclass.

4. **Why does Java use dynamic dispatch?**
   - To ensure that the correct method is invoked for an object, regardless of the reference type, at runtime.

---

Feel free to explore dynamic method dispatch further by implementing it in different scenarios!
