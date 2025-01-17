# Constructor and Static Keyword in Java

## Constructor

### Definition
A **constructor** is a special method used to initialize objects. It is called automatically when an object is created. The constructor has the same name as the class and does not have a return type (not even `void`).

### Features
1. **Automatically Invoked**: A constructor is called when an object is instantiated.
2. **No Return Type**: Constructors don’t have a return type.
3. **Same Name as Class**: The name of the constructor must match the class name.
4. **Overloading**: A class can have multiple constructors with different parameter lists (constructor overloading).

### Types of Constructors
1. **Default Constructor**:
   - A no-argument constructor that initializes objects with default values.
   - If no constructor is explicitly defined, Java provides a default constructor.
   ```java
   class Person {
       String name;
       int age;

       Person() {
           name = "Default Name";
           age = 0;
       }
   }
   ```

2. **Parameterized Constructor**:
   - A constructor that takes arguments to initialize fields.
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

3. **Copy Constructor** (Custom Implementation):
   - Creates a new object by copying an existing object.
   ```java
   class Person {
       String name;
       int age;

       Person(Person p) {
           this.name = p.name;
           this.age = p.age;
       }
   }
   ```

### Use Cases
1. **Initializing Objects**: Simplifies object creation with predefined values.
2. **Code Reusability**: Constructor overloading provides multiple ways to create objects.

### Working Scenarios
- **Chaining Constructors**:
  Use `this()` to call one constructor from another within the same class.
  ```java
  class Person {
      String name;
      int age;

      Person() {
          this("Unknown", 0); // Calls parameterized constructor
      }

      Person(String name, int age) {
          this.name = name;
          this.age = age;
      }
  }
  ```

### Non-Working Scenarios
1. **Explicit Return Type**:
   - Adding a return type to a constructor causes a compilation error.
   ```java
   class Person {
       Person void() { // Error: Return type not allowed
       }
   }
   ```

2. **Incorrect Name**:
   - If the constructor name doesn’t match the class name, it is treated as a regular method.

---

## Static Keyword

### Definition
The **static** keyword in Java is used for memory management. It can be applied to variables, methods, blocks, and nested classes. Static members belong to the class rather than instances of the class.

### Features
1. **Class-Level Scope**: Static members are shared across all instances of the class.
2. **Memory Efficiency**: Static variables are stored in a fixed memory location.
3. **Accessible Without Objects**: Static members can be accessed using the class name.

### Use Cases
1. **Static Variables**:
   - Shared among all instances of a class.
   - Often used for constants.
   ```java
   class Counter {
       static int count = 0;

       Counter() {
           count++;
       }
   }
   ```

2. **Static Methods**:
   - Belong to the class and can access only static data.
   - Cannot access non-static members directly.
   ```java
   class Utility {
       static void displayMessage() {
           System.out.println("Static Method Called");
       }
   }
   ```

3. **Static Block**:
   - Used for static initialization of data.
   ```java
   class Test {
       static int num;

       static {
           num = 42;
           System.out.println("Static block executed");
       }
   }
   ```

4. **Static Nested Classes**:
   - Nested classes that can exist independently of the outer class instance.
   ```java
   class Outer {
       static class Nested {
           void display() {
               System.out.println("Static Nested Class");
           }
       }
   }
   ```

### Working Scenarios
1. **Accessing Static Members**:
   - Using the class name:
     ```java
     System.out.println(Counter.count);
     ```

2. **Static Method Accessing Static Data**:
   ```java
   static void increment() {
       count++;
   }
   ```

### Non-Working Scenarios
1. **Accessing Non-Static Members**:
   - Static methods cannot directly access non-static fields or methods.
   ```java
   static void method() {
       System.out.println(nonStaticVar); // Error
   }
   ```

2. **Overriding Static Methods**:
   - Static methods are not polymorphic and cannot be overridden.
   ```java
   class Parent {
       static void show() {}
   }
   class Child extends Parent {
       static void show() {} // Hides, not overrides
   }
   ```

---

## Theory Focus (College Curriculum and Interviews)

### Key Differences: Constructor vs. Static Keyword
| Aspect               | Constructor                         | Static Keyword                   |
|----------------------|-------------------------------------|-----------------------------------|
| **Purpose**          | Initialize objects                 | Manage class-level memory        |
| **Invocation**       | Called on object creation          | Invoked without object creation  |
| **Scope**            | Object-level                      | Class-level                     |
| **Polymorphism**     | Supports overloading               | Not polymorphic                  |

### Common Interview Questions
1. What is the purpose of a constructor in Java?
2. Can we have a static constructor in Java? (Answer: No, constructors are tied to objects.)
3. What happens if a constructor has a return type?
4. Can static methods access non-static fields? Why or why not?
5. Explain the use of `static` blocks and their execution order.

---

## Examples

### Constructor Example
```java
class Employee {
    String name;
    int id;

    // Parameterized Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 101);
        emp.display();
    }
}
```

### Static Keyword Example
```java
class Calculator {
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + Calculator.add(5, 10));
    }
}
```

---

Mastering the concepts of constructors and the `static` keyword is essential for both academic success and excelling in technical interviews.
