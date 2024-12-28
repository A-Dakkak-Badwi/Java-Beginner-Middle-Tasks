---

# Bruch Management System

A Java application to manage and operate on fractions (Bruch in German). The application supports creation, addition, subtraction, reduction, and comparison of fractions.

---

## Table of Contents

- [Overview](#overview)
- [How It Works](#how-it-works)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [How to Compile and Run](#how-to-compile-and-run)
- [Example Usage](#example-usage)
- [Contributing](#contributing)
- [License](#license)

---

## Overview

1. **Bruch Class**:
   - Represents a fraction with a numerator (`zaehler`) and denominator (`nenner`).
   - Includes constructors for creating fractions with default or custom values.
   - Provides methods for arithmetic operations, reduction, and validation.

2. **BruchTest Class**:
   - Demonstrates and tests the functionality of the `Bruch` class, including addition, subtraction, and display operations.

---

## How It Works

1. **Bruch Class**:
   - Attributes:
     - `zaehler`: The numerator of the fraction.
     - `nenner`: The denominator of the fraction.
   - Methods:
     - **Arithmetic Operations**:
       - `addiere(Bruch)`: Adds two fractions.
       - `subtrahiere(Bruch)`: Subtracts one fraction from another.
     - **Reduction**:
       - `kuerzen()`: Reduces the fraction to its simplest form.
     - **Comparison**:
       - `equals(Bruch)`: Compares two fractions for equality after reduction.
     - **Other Utilities**:
       - `dezimalwert()`: Returns the decimal value of the fraction.
       - `bruchToString()`: Converts the fraction to a string format (`zaehler/nenner`).
       - `ausgeben()`: Prints the fraction in its current form.

2. **BruchTest Class**:
   - **Test Cases**:
     - Demonstrates the creation of fractions.
     - Performs addition and subtraction.
     - Outputs results in reduced form.

---

## Features

- **Encapsulation**:
  - Private attributes with getter and setter methods for controlled access.
- **Arithmetic Operations**:
  - Add and subtract fractions, automatically reducing the results.
- **Reduction**:
  - Automatically simplifies fractions where possible.
- **Comparison**:
  - Checks for equality of fractions after simplification.
- **Formatted Output**:
  - Prints fractions in readable `zaehler/nenner` format.

---

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher.

---

## How to Compile and Run

1. **Ensure** you have the following files:
   - `Bruch.java` (Fraction class)
   - `BruchTest.java` (Test class)
2. **Compile** the Java files:
   ```bash
   javac tag09/bruch/Bruch.java tag09/bruch/BruchTest.java
   ```
3. **Run** the test class:
   ```bash
   java tag09.bruch.BruchTest
   ```

---

## Example Usage

### Test 1: Creating and Adding Fractions

```java
Bruch bruch = new Bruch(3, 4);
Bruch bruch2 = new Bruch(1, 6);
Bruch ergebnis = bruch.addiere(bruch2);
ergebnis.ausgeben();
```

**Output**:
```
11/12
```

### Test 2: Subtracting Fractions

```java
Bruch ergebnis = bruch.subtrahiere(bruch2);
ergebnis.ausgeben();
```

**Output**:
```
5/12
```

### Test 3: Reduction and Comparison

```java
Bruch bruch3 = new Bruch(6, 8);
bruch3.gekuerztAusgeben();
System.out.println(bruch.equals(bruch3));
```

**Output**:
```
3/4
true
```

---

## Contributing

1. **Fork** this repository (if available).  
2. **Create** a new branch (e.g., `feature/add-operation`).  
3. **Commit** your changes.  
4. **Open a Pull Request** describing your improvements.

---

## License

This project is provided under the [MIT License](LICENSE). Feel free to use, modify, and distribute it.

---

Happy Coding!
