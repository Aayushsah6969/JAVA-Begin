# Method Overloading and Constructor Overloading in Java

## Method Overloading

### Definition
**Method overloading** in Java allows multiple methods in the same class to have the same name but differ in their parameter lists (number, types, or order of parameters).

### Features
1. **Compile-Time Polymorphism**: Method overloading is an example of compile-time (static) polymorphism.
2. **Same Name, Different Parameters**: Methods must have the same name but different signatures.
3. **Return Type Irrelevant**: Overloading does not depend on the return type of methods.

### Syntax
```java
class Calculator {
    // Method with two int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    double add(double a, double b) {
        return a + b;
    }
}
```

### Use Cases
1. **Enhanced Code Readability**: Simplifies method usage by providing multiple ways to call them.
2. **Utility Classes**: Often used in classes like `Math` or `Collections`.
3. **Flexible API Design**: Allows designing APIs that handle different data types or combinations.

### Working Scenarios
- **Varying Number of Parameters**:
  ```java
  int sum(int a) { return a; }
  int sum(int a, int b) { return a + b; }
  ```
- **Different Data Types**:
  ```java
  double multiply(double a, double b) { return a * b; }
  int multiply(int a, int b) { return a * b; }
  ```

### Non-Working Scenarios
1. **Differing Only by Return Type**:
   ```java
   int show() { return 1; } // Error when overloaded with
   void show() { System.out.println("Show"); }
   ```
2. **Ambiguity**:
   - Caused by type promotion:
     ```java
     void show(int a, double b) {}
     void show(double a, int b) {} // May cause ambiguity
     ```

---

## Constructor Overloading

### Definition
**Constructor overloading** allows a class to have multiple constructors with the same name (class name) but different parameter lists.

### Features
1. **Multiple Ways to Instantiate**: Provides flexibility to create objects with different initializations.
2. **Polymorphic Behavior**: Achieved during compile-time.

### Syntax
```java
class Person {
    String name;
    int age;

    // Default Constructor
    Person() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    Person(String name) {
        this.name = name;
        age = 0;
    }

    // Another Parameterized Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

### Use Cases
1. **Flexible Object Creation**: Simplifies creating objects with varying initial states.
2. **Object Duplication**: Custom copy constructors help duplicate objects.

### Working Scenarios
- **Default and Parameterized Constructors**:
  ```java
  Person p1 = new Person();
  Person p2 = new Person("Alice");
  Person p3 = new Person("Bob", 25);
  ```

- **Chaining Constructors**:
  ```java
  class Person {
      String name;
      int age;

      Person() {
          this("Unknown", 0);
      }

      Person(String name, int age) {
          this.name = name;
          this.age = age;
      }
  }
  ```

### Non-Working Scenarios
1. **Identical Parameter List**:
   - Constructors must differ in parameter lists:
     ```java
     Person(String name, int age) {}
     Person(String name, int age) {} // Error: Duplicate constructor
     ```

2. **Static Constructor**:
   - Constructors cannot be static because they are tied to objects, not the class.

---

## Differences Between Method Overloading and Constructor Overloading
| Feature                | Method Overloading                  | Constructor Overloading           |
|------------------------|-------------------------------------|------------------------------------|
| **Purpose**            | Adds flexibility to methods         | Provides multiple ways to initialize objects |
| **Name**               | Methods with the same name          | Constructor name matches class name |
| **Return Type**        | Can have different return types     | No return type (not even `void`)   |
| **Static Allowed**     | Methods can be static               | Constructors cannot be static      |

---

## Theory Focus (College Curriculum and Interviews)

### Key Points
1. **Method Overloading**:
   - Example of compile-time polymorphism.
   - Used for better code readability and flexibility.
2. **Constructor Overloading**:
   - Allows initialization of objects in multiple ways.
   - Custom copy constructors are crucial for duplicating objects.

### Common Interview Questions
1. What is method overloading, and why is it used?
2. Can two overloaded methods differ only by return type? (Answer: No.)
3. What is the purpose of constructor overloading?
4. How do you achieve constructor chaining?
5. Explain the differences between method overloading and overriding.

---

## Examples

### Method Overloading Example
```java
class MathUtils {
    // Adding two integers
    int add(int a, int b) {
        return a + b;
    }

    // Adding three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Adding two doubles
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        System.out.println(math.add(5, 10));       // 15
        System.out.println(math.add(1, 2, 3));    // 6
        System.out.println(math.add(2.5, 3.5));   // 6.0
    }
}
```

### Constructor Overloading Example
```java
class Student {
    String name;
    int id;

    // Default Constructor
    Student() {
        name = "Default Name";
        id = 0;
    }

    // Constructor with one parameter
    Student(String name) {
        this.name = name;
        this.id = 0;
    }

    // Constructor with two parameters
    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alice");
        Student s3 = new Student("Bob", 101);

        s1.display();
        s2.display();
        s3.display();
    }
}
```

---

Mastering method and constructor overloading enhances your ability to write flexible and reusable code, making it a crucial concept for academic and professional success.
