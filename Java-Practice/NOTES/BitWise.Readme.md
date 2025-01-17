# Bitwise Manipulation in Java

Bitwise manipulation allows you to directly work with the binary representation of numbers. This is a powerful tool for optimizing performance and solving certain problems efficiently.

## Common Bitwise Operators

| Operator | Symbol | Description                                   |
|----------|--------|-----------------------------------------------|
| AND      | `&`    | Returns 1 if both bits are 1, otherwise 0     |
| OR       | `|`    | Returns 1 if at least one bit is 1           |
| XOR      | `^`    | Returns 1 if bits are different, otherwise 0 |
| NOT      | `~`    | Inverts the bits                             |
| Left Shift | `<<` | Shifts bits to the left, filling with 0       |
| Right Shift | `>>` | Shifts bits to the right, preserving the sign |
| Unsigned Right Shift | `>>>` | Shifts bits to the right, filling with 0 |

### Example Table for Operators
Suppose we have two numbers:
- `a = 5` (binary: `0101`)
- `b = 3` (binary: `0011`)

| Operation | Binary Result | Decimal Result |
|-----------|----------------|----------------|
| `a & b`   | `0001`        | `1`            |
| `a | b`   | `0111`        | `7`            |
| `a ^ b`   | `0110`        | `6`            |
| `~a`      | `...11111010` | `-6`           |
| `a << 1`  | `1010`        | `10`           |
| `a >> 1`  | `0010`        | `2`            |
| `a >>> 1` | `0010`        | `2`            |

## Important Concepts

### Checking if a Number is Odd or Even
- **Odd:** The last bit is `1`.
- **Even:** The last bit is `0`.
- Code Example:
  ```java
  int num = 5;
  if ((num & 1) == 1) {
      System.out.println("Odd");
  } else {
      System.out.println("Even");
  }
  ```

### Swapping Two Numbers Without a Temporary Variable
- Code Example:
  ```java
  int a = 5, b = 3;
  a = a ^ b; // Step 1
  b = a ^ b; // Step 2
  a = a ^ b; // Step 3
  System.out.println("a: " + a + ", b: " + b);
  ```

### Checking if a Specific Bit is Set
- To check if the `i-th` bit is set:
  ```java
  int num = 5; // binary: 0101
  int i = 2;   // check the 2nd bit (count starts from 0)
  if ((num & (1 << i)) != 0) {
      System.out.println("Bit is set");
  } else {
      System.out.println("Bit is not set");
  }
  ```

### Setting a Specific Bit
- To set the `i-th` bit:
  ```java
  int num = 5; // binary: 0101
  int i = 1;   // set the 1st bit
  num = num | (1 << i);
  System.out.println(num); // Output: 7 (binary: 0111)
  ```

### Clearing a Specific Bit
- To clear the `i-th` bit:
  ```java
  int num = 5; // binary: 0101
  int i = 0;   // clear the 0th bit
  num = num & ~(1 << i);
  System.out.println(num); // Output: 4 (binary: 0100)
  ```

### Toggling a Specific Bit
- To toggle the `i-th` bit:
  ```java
  int num = 5; // binary: 0101
  int i = 2;   // toggle the 2nd bit
  num = num ^ (1 << i);
  System.out.println(num); // Output: 1 (binary: 0001)
  ```

## Applications
- Efficient algorithms in competitive programming.
- Optimizing memory usage.
- Cryptography and low-level hardware programming.

---
Happy coding with Bitwise Manipulation in Java!
