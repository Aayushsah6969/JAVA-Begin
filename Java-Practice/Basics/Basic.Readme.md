# Introduction to OOP and Java

## Object-Oriented Programming (OOP)
**Object-Oriented Programming (OOP)** is a programming paradigm based on the concept of "objects," which can contain data in the form of fields (attributes) and code in the form of methods (functions).

### Key Principles of OOP
- **Encapsulation**: Bundling data and methods into a single unit (class).
- **Abstraction**: Hiding implementation details and exposing only essential features.
- **Inheritance**: Allowing one class to inherit properties and methods from another.
- **Polymorphism**: Providing multiple implementations for a single interface or method.

---

## Difference Between OOP and POP
| **Feature**                | **OOP**                                 | **POP**                               |
|----------------------------|-----------------------------------------|---------------------------------------|
| **Approach**               | Object-centric                          | Function-centric                      |
| **Data Handling**          | Encapsulated within objects             | Shared globally                       |
| **Code Reusability**       | High (via inheritance)                  | Limited                               |
| **Modularity**             | Strong                                  | Weak                                  |
| **Example Languages**      | Java, Python, C++                       | C, Pascal                             |

---

## Introduction to Java
Java is a high-level, class-based, object-oriented programming language designed for portability, scalability, and robustness. Developed by Sun Microsystems (now owned by Oracle), it follows the principle of "Write Once, Run Anywhere (WORA)."

### Applications of Java
- **Desktop Applications**: IDEs, games, media players.
- **Web Applications**: E-commerce, social media platforms.
- **Mobile Applications**: Android app development.
- **Enterprise Applications**: Banking, ERP systems.
- **IoT and Embedded Systems**.

---

## Java Architecture
### JDK (Java Development Kit)
- A software development environment for writing and running Java programs.
- Includes JRE, compiler (`javac`), and development tools.

### JRE (Java Runtime Environment)
- Provides the libraries and JVM necessary to run Java applications.

### JVM (Java Virtual Machine)
- Converts bytecode into machine code and executes it.
- Ensures platform independence.

### Bytecode
- Intermediate code generated by the Java compiler (`.class` file).
- Executed by the JVM.

---

## Characteristics of Java
- **Platform Independent**: Runs on any device with JVM.
- **Object-Oriented**: Follows OOP principles.
- **Robust**: Strong memory management and exception handling.
- **Secure**: Bytecode verification and runtime checking.
- **Multi-threaded**: Supports concurrent execution of code.
- **High Performance**: Optimized through Just-In-Time (JIT) compiler.

---

## A Simple Java Program
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Compiling and Executing
1. Save the file as `HelloWorld.java`.
2. Compile: `javac HelloWorld.java`.
3. Run: `java HelloWorld`.

Output:
```
Hello, World!
```

---

## Data Types, Operators, and Expressions
### Data Types
- **Primitive**: `int`, `float`, `char`, `boolean`, etc.
- **Non-Primitive**: Arrays, classes, interfaces.

### Operators
- **Arithmetic**: `+`, `-`, `*`, `/`, `%`.
- **Relational**: `==`, `!=`, `<`, `>`.
- **Logical**: `&&`, `||`, `!`.

### Expressions
- Combine variables, literals, and operators to form valid computations.

### Scope of Variables
- **Local**: Declared within a method or block.
- **Instance**: Declared in a class but outside methods.
- **Static**: Declared with `static` keyword and shared among all instances.

### Type Conversion and Casting
- **Implicit**: Automatic type promotion.
- **Explicit**: Forced conversion using casting.
  ```java
  int num = (int) 10.5; // Explicit casting
  ```

---

## Control Statements
### Branch Control Statements
- **`if-else`**: Decision making.
- **`switch`**: Multi-way branching.

### Iteration Statements
- **Loops**: `for`, `while`, `do-while`.

### Jump Statements
- **`break`**: Exit a loop or switch.
- **`continue`**: Skip the current iteration.
- **`return`**: Exit from a method.

---

## Examples
### Example: `if-else`
```java
int age = 18;
if (age >= 18) {
    System.out.println("Eligible to vote");
} else {
    System.out.println("Not eligible to vote");
}
```

### Example: `for` Loop
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Number: " + i);
}
```

---

Mastering these foundational concepts will give you a strong base to explore advanced Java topics and ace interviews.