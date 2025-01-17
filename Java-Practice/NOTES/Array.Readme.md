# Arrays in Java

## Definition
An **array** is a collection of elements of the same data type stored at contiguous memory locations. Arrays are fixed in size, meaning you cannot change their size once they are created.

## Syntax
### Declaring an Array
```java
// Declare an array
int[] arr;

// Create and initialize an array
arr = new int[5];

// Combined declaration and initialization
int[] arr = {1, 2, 3, 4, 5};
```

### Accessing Elements
Array elements are accessed using their index (starting from 0).
```java
int[] arr = {10, 20, 30};
System.out.println(arr[1]); // Output: 20
```

### Updating Elements
```java
arr[1] = 50;
System.out.println(arr[1]); // Output: 50
```

---

## Types of Arrays
1. **Single-Dimensional Arrays**:
   ```java
   int[] arr = new int[3];
   arr[0] = 10;
   arr[1] = 20;
   arr[2] = 30;
   ```

2. **Multi-Dimensional Arrays**:
   - Example: 2D Array
     ```java
     int[][] matrix = {
         {1, 2, 3},
         {4, 5, 6},
         {7, 8, 9}
     };
     System.out.println(matrix[1][2]); // Output: 6
     ```

---

## Common Operations

### Traversing an Array
Using a `for` loop:
```java
int[] arr = {10, 20, 30};
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```
Using an enhanced `for` loop:
```java
for (int num : arr) {
    System.out.println(num);
}
```

### Sorting an Array
Using the `Arrays.sort()` method:
```java
import java.util.Arrays;

int[] arr = {30, 10, 20};
Arrays.sort(arr);
System.out.println(Arrays.toString(arr)); // Output: [10, 20, 30]
```

### Searching in an Array
Using the `Arrays.binarySearch()` method (array must be sorted):
```java
int[] arr = {10, 20, 30};
int index = Arrays.binarySearch(arr, 20);
System.out.println(index); // Output: 1
```

### Copying an Array
Using the `Arrays.copyOf()` method:
```java
int[] arr = {10, 20, 30};
int[] newArr = Arrays.copyOf(arr, arr.length);
System.out.println(Arrays.toString(newArr));
```

### Filling an Array
Using the `Arrays.fill()` method:
```java
int[] arr = new int[5];
Arrays.fill(arr, 42);
System.out.println(Arrays.toString(arr)); // Output: [42, 42, 42, 42, 42]
```

### Comparing Arrays
Using the `Arrays.equals()` method:
```java
int[] arr1 = {10, 20, 30};
int[] arr2 = {10, 20, 30};
System.out.println(Arrays.equals(arr1, arr2)); // Output: true
```

---

## Library Functions in `java.util.Arrays`

| Method               | Description                                      |
|----------------------|--------------------------------------------------|
| `Arrays.toString()`  | Converts array to a string for easy printing.    |
| `Arrays.sort()`      | Sorts the array in ascending order.              |
| `Arrays.binarySearch()` | Searches for a value in a sorted array.          |
| `Arrays.copyOf()`    | Copies an array to a new array.                  |
| `Arrays.fill()`      | Fills the array with a specific value.           |
| `Arrays.equals()`    | Compares two arrays for equality.                |
| `Arrays.stream()`    | Creates a stream from the array.                 |

---

## Working Scenarios
1. **Fixed Size**:
   Arrays are ideal when the size is known beforehand.
   ```java
   int[] fixedArr = new int[10];
   ```

2. **Efficient Access**:
   Direct access to elements via their index.
   ```java
   System.out.println(arr[2]); // Accesses the 3rd element
   ```

3. **Multi-Dimensional Data**:
   Useful for matrices or grids.
   ```java
   int[][] grid = new int[3][3];
   ```

---

## Non-Working Scenarios
1. **Dynamic Size**:
   Arrays cannot grow or shrink after creation. Use `ArrayList` instead for dynamic resizing.
   ```java
   ArrayList<Integer> list = new ArrayList<>();
   list.add(10);
   ```

2. **Primitive vs. Object**:
   Arrays of primitives differ from arrays of objects (e.g., `String[]` vs. `int[]`).

3. **Negative Indexing**:
   Accessing with negative indices is not allowed.
   ```java
   arr[-1]; // Error: ArrayIndexOutOfBoundsException
   ```

---

## Examples
### Reverse an Array
```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr)); // Output: [5, 4, 3, 2, 1]
    }
}
```

### Find the Maximum Element
```java
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 50, 20, 80, 30};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum: " + max);
    }
}
```

---

Arrays are a fundamental part of Java programming. Understanding their operations, limitations, and best practices will help you write efficient and clean code.
