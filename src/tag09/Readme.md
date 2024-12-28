
---

# Konto and Bruch Management System

A Java application that combines two systems: 
1. A **Konto Management System** for simulating bank account operations. 
2. A **Bruch Management System** for performing operations on fractions.

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

1. **Konto Management**:
   - Includes base `Konto` (account) and `Girokonto` (checking account with overdraft) classes.
   - Manages deposits, withdrawals, and overdraft limits.
   - Demonstrated through `KontoTest`.

2. **Bruch Management**:
   - Provides arithmetic operations and reduction for fractions.
   - Includes `Bruch` (fraction) class and `BruchTest` for testing.

---

## How It Works

### **Konto System**

1. **Konto Class**:
   - Attributes:
     - `kontonummer`: Unique account number.
     - `kontostand`: Current account balance.
   - Methods:
     - `einzahlen(double)`: Deposits a positive amount.
     - `auszahlen(double)`: Withdraws money if conditions are met.
     - `toString()`: Returns a formatted string representation.

2. **Girokonto Class**:
   - Extends `Konto` and adds:
     - `limit`: Overdraft limit.
     - Enhanced withdrawal logic to allow overdraft.

3. **KontoTest Class**:
   - Demonstrates the functionality through examples:
     - Deposit and withdrawal operations.
     - Overdraft handling.

### **Bruch System**

1. **Bruch Class**:
   - Attributes:
     - `zaehler`: Numerator.
     - `nenner`: Denominator.
   - Methods:
     - `addiere(Bruch)`: Adds two fractions.
     - `subtrahiere(Bruch)`: Subtracts fractions.
     - `kuerzen()`: Reduces the fraction to its simplest form.
     - `equals(Bruch)`: Compares two fractions.

2. **BruchTest Class**:
   - Demonstrates:
     - Creation of fractions.
     - Addition, subtraction, and reduction.

---

## Features

### Konto Management Features:
- **Account Operations**:
  - Deposit and withdraw funds.
  - Overdraft handling for `Girokonto`.
- **Encapsulation**:
  - Private attributes with getter and setter methods.
- **Formatted Output**:
  - User-friendly transaction and account details.

### Bruch Management Features:
- **Arithmetic Operations**:
  - Addition and subtraction of fractions.
- **Reduction**:
  - Automatic simplification of results.
- **Comparison**:
  - Equality checks after reduction.

---

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher.

---

## How to Compile and Run

1. **Ensure you have the following files**:
   - `Konto.java` and `Girokonto.java` (for Konto System)
   - `KontoTest.java` (for Konto Testing)
   - `Bruch.java` (for Fractions)
   - `BruchTest.java` (for Fraction Testing)

2. **Compile** the Java files:
   ```bash
   javac tag09/girokonto/Konto.java tag09/girokonto/Girokonto.java tag09/girokonto/KontoTest.java
   javac tag09/bruch/Bruch.java tag09/bruch/BruchTest.java
   ```

3. **Run** the test classes:
   - For Konto System:
     ```bash
     java tag09.girokonto.KontoTest
     ```
   - For Bruch System:
     ```bash
     java tag09.bruch.BruchTest
     ```

---

## Example Usage

### Konto System

#### Test 1: Basic Account Operations
```java
Konto konto = new Konto("123456", 1000.0);
konto.einzahlen(500.0);
konto.auszahlen(300.0);
System.out.println(konto);
```

**Output**:
```
✅ 500.00 EUR wurden eingezahlt. Neuer Kontostand: 1500.00 EUR
✅ 300.00 EUR wurden ausgezahlt. Neuer Kontostand: 1200.00 EUR
KontoNr.:        123456
Kontostand:      1200.00 EUR
```

#### Test 2: Overdraft Limit
```java
Girokonto girokonto = new Girokonto("654321", 1000.0, 500.0);
girokonto.auszahlen(1400.0); // Allowed due to overdraft limit
girokonto.auszahlen(200.0);  // Exceeds overdraft
```

**Output**:
```
✅ 1400.00 EUR wurden ausgezahlt. Neuer Kontostand: -400.00 EUR
❌ Auszahlung fehlgeschlagen. Betrag übersteigt das Kreditlimit.
```

### Bruch System

#### Test 1: Addition
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

#### Test 2: Reduction
```java
Bruch bruch = new Bruch(6, 8);
bruch.gekuerztAusgeben();
```

**Output**:
```
3/4
```

---

## Contributing

1. **Fork** this repository.  
2. **Create** a new branch (e.g., `feature/overdraft-enhancements`).  
3. **Commit** your changes.  
4. **Open a Pull Request** describing your improvements.

---

## License

This project is provided under the [MIT License](LICENSE). Feel free to use, modify, and distribute it.

---

Happy Coding!
