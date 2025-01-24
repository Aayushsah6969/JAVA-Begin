# Package in Java

## **Introduction**
A **package** in Java is a namespace used to group related classes, interfaces, and sub-packages. Think of it as a folder in a file system that organizes Java files. Packages help manage and avoid class name conflicts, control access, and make it easier to maintain the project.

### **Types of Packages**:
1. **Built-in Packages**: Provided by Java (e.g., `java.util`, `java.io`, `java.sql`).
2. **User-defined Packages**: Created by developers to organize their own classes and interfaces.

---

## **Why Use Packages?**
1. **Organization**: Groups related classes and interfaces together.
2. **Name Conflict Avoidance**: Prevents naming conflicts by providing a namespace.
3. **Access Protection**: Provides access control via `public`, `protected`, etc.
4. **Reusability**: Makes it easier to reuse classes in multiple applications.

---

## **How to Create and Use a Package**

### **Syntax**
1. **Creating a Package**:
   ```java
   package packageName;

   public class ClassName {
       // Class code
   }
   ```
   
2. **Compiling a Package**:
   ```bash
   javac -d . ClassName.java
   ```
   The `-d` flag specifies the directory where the package will be created.

3. **Using a Package**:
   - Import the package using:
     ```java
     import packageName.ClassName;
     ```
   - Or use the fully qualified name without importing:
     ```java
     packageName.ClassName obj = new packageName.ClassName();
     ```

---

## **Example of Creating and Using a Package**

### **Step 1: Create a Package**
```java
package mypackage;

public class MyClass {
    public void displayMessage() {
        System.out.println("This is a message from MyClass in mypackage.");
    }
}
```

### **Step 2: Compile the Package**
Run the following command to compile:
```bash
javac -d . MyClass.java
```
This will create a folder named `mypackage` containing `MyClass.class`.

### **Step 3: Use the Package**
```java
import mypackage.MyClass;

public class Test {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.displayMessage();
    }
}
```

Compile and run the program:
```bash
javac Test.java
java Test
```
Output:
```
This is a message from MyClass in mypackage.
```

---

## **Built-in Packages in Java**

### Commonly Used Packages:
1. **`java.lang`** (Automatically imported): Provides classes like `Math`, `String`, `Object`, etc.
2. **`java.util`**: Contains utility classes like `ArrayList`, `HashMap`, `Scanner`, etc.
3. **`java.io`**: Provides input and output classes like `File`, `BufferedReader`, etc.
4. **`java.sql`**: Provides classes for database operations.

Example:
```java
import java.util.ArrayList;

public class BuiltInPackageExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Packages");

        for (String item : list) {
            System.out.println(item);
        }
    }
}
```
Output:
```
Java
Packages
```

---

## **Access Modifiers and Packages**
| Modifier      | Same Class | Same Package | Subclass (Different Package) | Other Packages |
|---------------|------------|--------------|------------------------------|----------------|
| `public`      | Yes        | Yes          | Yes                          | Yes            |
| `protected`   | Yes        | Yes          | Yes                          | No             |
| (default)     | Yes        | Yes          | No                           | No             |
| `private`     | Yes        | No           | No                           | No             |

---

## **Sub-Packages**
A package can contain other packages, known as sub-packages. For example:
```java
package mypackage.subpackage;

public class SubClass {
    public void show() {
        System.out.println("This is a subclass in a subpackage.");
    }
}
```

To use it:
```java
import mypackage.subpackage.SubClass;

public class SubPackageExample {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.show();
    }
}
```

---

## **Tips and Notes**
1. Always place the `package` declaration at the top of your Java file, before any `import` statements.
2. Use meaningful names for packages to indicate their purpose (e.g., `com.companyname.module`).
3. The package structure must match the directory structure in your file system.
4. Keep related classes in the same package to improve project organization.
5. Use sub-packages to further categorize classes (e.g., `java.util.stream`).

---

## **Key Points**
- A Java package is a way of organizing related classes and interfaces.
- Packages help resolve name conflicts and improve code maintainability.
- Built-in packages like `java.util` and `java.io` are commonly used.
- User-defined packages allow developers to create their own organized structure.
- Access modifiers control the visibility of classes, methods, and fields across packages.

---

Feel free to explore packages further by combining them with other OOP concepts, such as inheritance and polymorphism! 😊
