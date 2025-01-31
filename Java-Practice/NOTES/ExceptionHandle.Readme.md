# Exception Handling in Java

## **Introduction**
Exception handling in Java is a mechanism to handle runtime errors, ensuring the normal flow of a program. Exceptions are unexpected events or conditions that disrupt the execution of a program, such as division by zero, invalid input, or accessing an array out of bounds.

Java provides a robust exception handling framework to deal with such issues gracefully, rather than abruptly terminating the program.

---

## **Key Concepts**

### **What is an Exception?**
An exception is an event that occurs during the execution of a program, disrupting its normal flow. It is an object representing an error condition or an unexpected situation.

### **Types of Exceptions**
1. **Checked Exceptions**:
   - Exceptions that are checked at compile-time.
   - Example: `IOException`, `SQLException`.

2. **Unchecked Exceptions**:
   - Exceptions that occur at runtime.
   - Example: `ArithmeticException`, `NullPointerException`.

3. **Errors**:
   - Serious problems that cannot be handled by the program.
   - Example: `OutOfMemoryError`, `StackOverflowError`.

---

## **Hierarchy of Exceptions**
The exception classes in Java are organized as follows:

```
Throwable
  |-- Error
  |-- Exception
       |-- RuntimeException
```

### **Commonly Used Exceptions**
| Exception                | Description                         |
|--------------------------|-------------------------------------|
| `ArithmeticException`    | Thrown when an arithmetic operation goes wrong. |
| `ArrayIndexOutOfBoundsException` | Thrown when accessing an invalid array index. |
| `NullPointerException`   | Thrown when accessing a null object reference. |
| `IOException`            | Thrown for Input/Output operations. |
| `ClassNotFoundException` | Thrown when a class is not found. |

---

## **Keywords in Exception Handling**

1. **`try`**:
   Contains the code that might throw an exception.

2. **`catch`**:
   Handles the exception thrown by the `try` block.

3. **`finally`**:
   A block that always executes, used to clean up resources.

4. **`throw`**:
   Used to explicitly throw an exception.

5. **`throws`**:
   Declares exceptions that a method can throw.

---

## **Basic Structure of Exception Handling**
```java
try {
    // Code that might throw an exception
} catch (ExceptionType e) {
    // Handle the exception
} finally {
    // Cleanup code (always executed)
}
```

---

## **Examples**

### **1. Try-Catch Example**
```java
public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```
**Output**:
```
Error: / by zero
```

---

### **2. Try-Catch-Finally Example**
```java
public class FinallyExample {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]); // Accessing invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
```
**Output**:
```
Exception caught: java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
Finally block executed.
```

---

### **3. Throw Example**
```java
public class ThrowExample {
    public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
```
**Output**:
```
Caught Exception: Age must be 18 or above.
```

---

### **4. Throws Example**
```java
import java.io.*;

public class ThrowsExample {
    public static void readFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("nonexistentfile.txt"));
        System.out.println(reader.readLine());
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
```
**Output**:
```
File not found: nonexistentfile.txt (No such file or directory)
```

---

### **5. Multiple Catch Blocks**
```java
public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught.");
        } catch (Exception e) {
            System.out.println("General Exception caught.");
        }
    }
}
```
**Output**:
```
NullPointerException caught.
```

---

## **Best Practices for Exception Handling**
1. Catch specific exceptions instead of using a general `Exception`.
2. Always clean up resources in the `finally` block or use try-with-resources.
3. Log exceptions instead of suppressing them silently.
4. Avoid overusing checked exceptions; only use them when necessary.
5. Validate user inputs to prevent exceptions.

---

## **Key Points**
1. **Exceptions vs Errors**: Exceptions are recoverable; errors are not.
2. **Checked vs Unchecked Exceptions**: Checked exceptions are handled during compilation, whereas unchecked exceptions occur at runtime.
3. **`finally` Block**: Always executes, even if no exception is thrown.
4. **Custom Exceptions**: You can define your own exceptions by extending the `Exception` class.

### **Example of a Custom Exception**
```java
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            throw new CustomException("This is a custom exception.");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
```
**Output**:
```
This is a custom exception.
```

---

Feel free to explore exception handling further by using advanced concepts like chained exceptions, rethrowing exceptions, or integrating them into larger projects!
