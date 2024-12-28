# Konto and Bruch Management System

A Java application for simulating bank account management and performing operations on fractions. It includes advanced features such as overdraft handling for accounts and arithmetic operations for fractions.

---

## Table of Contents

- [Overview](#overview)
- [How It Works](#how-it-works)
  - [Konto Class](#konto-class)
  - [Girokonto Class](#girokonto-class)
  - [Bruch Class](#bruch-class)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [How to Compile and Run](#how-to-compile-and-run)
- [Example Usage](#example-usage)
- [Contributing](#contributing)
- [License](#license)

---

## Overview

This project consists of two main functionalities:
1. **Konto Management**:
   - Simulates basic bank account operations like deposits and withdrawals.
   - Extends functionality with overdraft limits using the `Girokonto` class.
2. **Bruch Management**:
   - Operates on fractions, supporting addition, subtraction, and reduction to simplest form.

---

## How It Works

### Konto Class

1. **Attributes**:
   - `kontonummer`: Unique account number.
   - `kontostand`: Account balance.

2. **Methods**:
   - `einzahlen(double)`: Deposits money into the account.
   - `auszahlen(double)`: Withdraws money if sufficient balance exists.
   - `toString()`: Provides a formatted string representation of the account.

---

### Girokonto Class

1. **Attributes**:
   - Inherits all attributes from `Konto`.
   - Adds `limit`: Overdraft limit for the account.

2. **Methods**:
   - Overrides `auszahlen(double)` to allow withdrawals up to the overdraft limit.
   - Adds getters and setters for overdraft limit.

---

### Bruch Class

1. **Attributes**:
   - `zaehler`: Numerator of the fraction.
   - `nenner`: Denominator of the fraction.

2. **Methods**:
   - `addiere(Bruch)`: Adds two fractions and reduces the result.
   - `subtrahiere(Bruch)`: Subtracts one fraction from another.
   - `kuerzen()`: Reduces the fraction to its simplest form.
   - `equals(Bruch)`: Compares two fractions for equality.
   - `ausgeben()`: Prints the fraction.

---

## Features

### Konto Features
- Encapsulation of account data with getter and setter methods.
- Deposit and withdrawal operations with overdraft limit handling.
- Validation of account details and transactions.
- User-friendly formatted output.

### Bruch Features
- Addition, subtraction, and simplification of fractions.
- Automatic reduction to simplest form.
- Equality comparison of fractions.
- Encapsulation of fraction data with validation.

---

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher.

---

## How to Compile and Run

1. **Ensure** you have the following files:
   - `Konto.java` and `Girokonto.java` for account operations.
   - `Bruch.java` for fraction operations.
   - `KontoTest.java` and `BruchTest.java` for testing.

2. **Compile** the Java files:
   ```bash
   javac tag09/girokonto/Konto.java tag09/girokonto/Girokonto.java tag09/girokonto/KontoTest.java
   javac tag09/bruch/Bruch.java tag09/bruch/BruchTest.java
   ```

3. **Run** the test classes:
   - For account operations:
     ```bash
     java tag09.girokonto.KontoTest
     ```
   - For fraction operations:
     ```bash
     java tag09.bruch.BruchTest
     ```

---

## Example Usage

### Konto System

#### Basic Account Operations
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

#### Overdraft Handling
```java
Girokonto girokonto = new Girokonto("654321", 1000.0, 500.0);
girokonto.auszahlen(1400.0);
girokonto.auszahlen(200.0);
```

**Output**:
```
✅ 1400.00 EUR wurden ausgezahlt. Neuer Kontostand: -400.00 EUR
❌ Auszahlung fehlgeschlagen. Betrag übersteigt das Kreditlimit.
```

---

### Bruch System

#### Fraction Addition
```java
Bruch bruch1 = new Bruch(3, 4);
Bruch bruch2 = new Bruch(1, 6);
Bruch result = bruch1.addiere(bruch2);
result.ausgeben();
```

**Output**:
```
11/12
```

#### Fraction Simplification
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
2. **Create** a new branch (e.g., `feature/overdraft-enhancement`).  
3. **Commit** your changes.  
4. **Open a Pull Request** describing your improvements.

---

## License

This project is provided under the [MIT License](LICENSE). Feel free to use, modify, and distribute it.

---

Happy Coding!
