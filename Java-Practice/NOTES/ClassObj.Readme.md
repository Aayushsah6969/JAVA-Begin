# Classes and Objects in Java

## Definition
- **Class**: A blueprint or template for creating objects. It defines properties (fields) and behaviors (methods) that objects of the class will have.
- **Object**: An instance of a class. It represents a specific entity with defined properties and behaviors.

## Syntax
### Defining a Class
```java
class ClassName {
    // Fields (Properties)
    int field1;
    String field2;

    // Constructor
    ClassName(int f1, String f2) {
        field1 = f1;
        field2 = f2;
    }

    // Method (Behavior)
    void displayInfo() {
        System.out.println("Field1: " + field1 + ", Field2: " + field2);
    }
}
```

### Creating an Object
```java
public class Main {
    public static void main(String[] args) {
        // Creating an object of the class
        ClassName obj = new ClassName(10, "Hello");

        // Accessing the object's method
        obj.displayInfo();
    }
}
```

## Use Cases
1. **Modeling Real-World Entities**: E.g., a `Car` class to model cars with properties like color and methods like drive.
2. **Code Reusability**: Classes can be reused to create multiple objects.
3. **Encapsulation**: Group related data and methods together.

## Working Scenarios
1. **Class with Constructor**:
   - Constructor initializes the object during creation.
   ```java
   class Person {
       String name;
       int age;

       Person(String name, int age) {
           this.name = name;
           this.age = age;
       }
   }
   ```

2. **Accessing Fields and Methods**:
   - Use the dot (`.`) operator to access fields and methods.
   ```java
   Person p = new Person("John", 25);
   System.out.println(p.name);
   ```

3. **Multiple Objects of the Same Class**:
   - Each object has its own copy of fields.
   ```java
   Person p1 = new Person("Alice", 30);
   Person p2 = new Person("Bob", 25);
   ```

## Non-Working Scenarios
1. **Accessing Fields Without Creating an Object**:
   - Will cause an error unless the field is `static`.
   ```java
   System.out.println(ClassName.field1); // Error
   ```

2. **Uninitialized Fields**:
   - Fields must be initialized before use (except for default values like `0` for integers).

3. **Calling Methods Without an Object**:
   - Will result in a `Non-static method cannot be referenced from a static context` error.
   ```java
   ClassName.displayInfo(); // Error if not static
   ```

## What's Possible
1. **Create Multiple Objects**: Multiple instances of the same class.
2. **Define Static Members**: Shared across all objects of the class.
3. **Inheritance**: Extend a class to create specialized versions.
4. **Encapsulation**: Use `private` fields and provide access via `public` methods.

## What's Not Possible
1. **Modify a `final` Class**: A class marked as `final` cannot be extended.
   ```java
   final class FinalClass {}
   class SubClass extends FinalClass {} // Error
   ```

2. **Direct Access to Private Fields**: Requires getter and setter methods.
3. **Creating an Object Without a Constructor**: If no constructor is defined, the default no-argument constructor is used.

## Examples
### Basic Example
```java
class Dog {
    String breed;
    int age;

    Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    void bark() {
        System.out.println("Woof! Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Labrador", 3);
        System.out.println("Breed: " + dog.breed);
        dog.bark();
    }
}
```

---
Classes and Objects are the foundation of object-oriented programming in Java. Mastering this concept will help you write modular and reusable code.
