---

# Konto Management System

A Java application to simulate a bank account management system. The system supports basic operations such as deposits, withdrawals, and managing account limits.

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

1. **Konto Class**:
   - Represents a general bank account with a balance and account number.
   - Provides methods for deposits, withdrawals, and balance management.

2. **Girokonto Class**:
   - Extends `Konto` to include an overdraft limit.
   - Overrides withdrawal logic to respect the overdraft limit.

3. **KontoTest Class**:
   - Demonstrates the functionality of `Konto` and `Girokonto` with test cases.

---

## How It Works

1. **Konto Class**:
   - Attributes:
     - `kontonummer`: The unique account number.
     - `kontostand`: The current account balance.
   - Methods:
     - `einzahlen(double)`: Deposits a positive amount into the account.
     - `auszahlen(double)`: Withdraws an amount if the balance is sufficient.
     - `toString()`: Returns a formatted string representation of the account.

2. **Girokonto Class**:
   - Attributes:
     - `limit`: The overdraft limit for the account.
   - Methods:
     - Overrides `auszahlen(double)` to allow withdrawals up to the overdraft limit.
     - Includes getter and setter for the overdraft limit.

3. **KontoTest Class**:
   - Test Cases:
     - Demonstrates basic account operations such as deposits and withdrawals.
     - Includes edge cases like invalid inputs and overdraft limit testing.

---

## Features

- **Account Operations**:
  - Deposit and withdraw money while maintaining account balance integrity.
- **Overdraft Management**:
  - `Girokonto` allows withdrawals beyond balance up to a specified limit.
- **Encapsulation**:
  - Private attributes with controlled access through getter and setter methods.
- **Formatted Output**:
  - User-friendly display of account details and transaction results.
- **Error Handling**:
  - Validates inputs and handles invalid scenarios gracefully.

---

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher.

---

## How to Compile and Run

1. **Ensure** you have the following files:
   - `Konto.java` (Base account class)
   - `Girokonto.java` (Overdraft account class)
   - `KontoTest.java` (Test class)
2. **Compile** the Java files:
   ```bash
   javac tag09/girokonto/Konto.java tag09/girokonto/Girokonto.java tag09/girokonto/KontoTest.java
   ```
3. **Run** the test class:
   ```bash
   java tag09.girokonto.KontoTest
   ```

---

## Example Usage

### Test 1: Creating Accounts

```java
Konto konto = new Konto("0000000001", 1000.0);
System.out.println(konto);
```

**Output**:
```
KontoNr.:        0000000001
Kontostand:      1000.00 EUR
```

### Test 2: Deposit and Withdraw

```java
konto.einzahlen(500.0);
konto.auszahlen(750.0);
System.out.println(konto);
```

**Output**:
```
✅ 500.00 EUR wurden eingezahlt. Neuer Kontostand: 1500.00 EUR
✅ 750.00 EUR wurden ausgezahlt. Neuer Kontostand: 750.00 EUR
KontoNr.:        0000000001
Kontostand:      750.00 EUR
```

### Test 3: Overdraft with `Girokonto`

```java
Girokonto girokonto = new Girokonto("0000000002", 1000.0, 500.0);
girokonto.auszahlen(1400.0); // Allowed due to overdraft limit
girokonto.auszahlen(200.0);  // Exceeds limit
```

**Output**:
```
✅ 1400.00 EUR wurden ausgezahlt. Neuer Kontostand: -400.00 EUR
❌ Auszahlung fehlgeschlagen. Betrag übersteigt das Kreditlimit.
```

---

## Contributing

1. **Fork** this repository (if available).  
2. **Create** a new branch (e.g., `feature/add-interest`).  
3. **Commit** your changes.  
4. **Open a Pull Request** describing your improvements.

---

## License

This project is provided under the [MIT License](LICENSE). Feel free to use, modify, and distribute it.

---

Happy Coding!
