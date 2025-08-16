# 📘 Basic Java Programs Collection


## 📌 Overview

This repository contains a collection of basic Java programs that cover fundamental programming concepts.
It is designed for beginners learning Java and for quick reference to commonly used algorithms and coding techniques.

------
## 📂 Project Structure

```
📁 basic-java-programs
│
├── Factorial.java              # Calculates factorial of a number (loop-based)
├── Fibonacci.java              # Generates Fibonacci series iteratively
├── FibonacciRecursive.java     # Generates Fibonacci series using recursion
├── Palindrome.java             # Checks if a number/string is a palindrome
├── Primes.java                 # Prints prime numbers in a given range
├── ThreadClass.java            # Demonstrates basic multithreading
├── RootOfEquation.java         # Solves quadratic equations
├── ShortCircuit.java           # Demonstrates short-circuit operators (&&, ||)
├── SumOfDigits.java            # Finds sum of digits of a number
├── Swapping.java               # Swaps two variables (with/without temp variable)
├── StringDemo.java             # Basic String operations
├── TernaryOperation.java       # Uses ternary operator for decision-making
└── TransposeMatrix.java        # Finds transpose of a matrix
```

---

## 🛠 Requirements

* **Java Development Kit (JDK)** 8 or above
* Any Java IDE (Eclipse, IntelliJ IDEA, NetBeans) or text editor with command-line execution

---

## 🚀 How to Run

1. **Clone or Download the Repository**

   ```bash
   git clone https://github.com/yourusername/basic-java-programs.git
   ```

2. **Open Terminal/Command Prompt**
   Navigate to the folder containing the `.java` files.

3. **Compile a Program**

   ```bash
   javac ProgramName.java
   ```

4. **Run the Program**

   ```bash
   java ProgramName
   ```

---

## 📚 Example

**Factorial.java**

```java
public class Factorial {
    public static void main(String[] args) {
        int n = 5, fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
```

**Output:**

```
Factorial of 5 is: 120
```

