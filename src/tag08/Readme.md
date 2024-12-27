---

# Mitarbeiter Management and Bonus System

A Java application for managing employee data and calculating bonuses with advanced features like validation, method overloading, and flexible input handling.

---

## Table of Contents

- [Overview](#overview)
- [How It Works](#how-it-works)
  - [Mitarbeiter Class](#mitarbeiter-class)
  - [Mitarbeiter Bonus Class](#mitarbeiter-bonus-class)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [How to Compile and Run](#how-to-compile-and-run)
- [Example Usage](#example-usage)
- [Contributing](#contributing)
- [License](#license)

---

## Overview

This project consists of two main functionalities:
1. **Mitarbeiter Management**:
   - Encapsulates employee data such as ID, name, position, salary, and years of experience.
   - Ensures data integrity with input validation.
2. **Mitarbeiter Bonus System**:
   - Provides overloaded methods to calculate bonuses based on various factors.
   - Allows flexible display of employee information, with or without salary.

---

## How It Works

### Mitarbeiter Class

1. **Attributes**:
   - `mitarbeiterID`: Unique identifier for the employee.
   - `name`: Employee's full name.
   - `position`: Job title.
   - `gehalt`: Salary.
   - `erfahrungsjahre`: Years of professional experience.

2. **Validation**:
   - Ensures all attributes have valid values (e.g., non-negative salary).
   - Assigns default values for invalid inputs (e.g., null or empty strings).

3. **Methods**:
   - Getters and setters for each attribute with validation.
   - `toString`: Provides a formatted string representation of the employee's information.

---

### Mitarbeiter Bonus Class

1. **Additional Features**:
   - **Overloaded Methods**:
     - `berechneBonus()`: Calculates a standard bonus (10% of salary).
     - `berechneBonus(double faktor)`: Calculates a bonus with a custom multiplier.
     - `berechneBonus(double faktor, double sonderzulage)`: Calculates a bonus with a custom multiplier and additional allowance.
   - Flexible information display with the overloaded `zeigeMitarbeiterInfo` method.

2. **Customizable Bonus Calculation**:
   - Default bonus: 10% of the salary.
   - Optional parameters for additional allowances or custom multipliers.

---

## Features

- **Encapsulation**:
  - Private attributes with getter and setter methods.
- **Data Integrity**:
  - Robust input validation ensures meaningful default values.
- **Overloading**:
  - Bonus calculation and data display methods allow flexible usage.
- **User-Friendly Output**:
  - Methods provide clean, structured information display.

---

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher.

---

## How to Compile and Run

1. **Ensure** you have the following files:
   - `Mitarbeiter.java` (Basic employee class)
   - `MitarbeiterTest.java` (Test class for basic employee management)
   - `_10_Mitarbeiter.java` (Advanced employee class with bonus calculations)
   - `_10_MitarbeiterTest.java` (Test class for bonus calculations)
2. **Compile** the Java files:
   ```bash
   javac tag08/mitarbeiter/Mitarbeiter.java tag08/mitarbeiter/MitarbeiterTest.java tag08/mitarbeiter_bonus/_10_Mitarbeiter.java tag08/mitarbeiter_bonus/_10_MitarbeiterTest.java
   ```
3. **Run** the test classes:
   - For basic management:
     ```bash
     java tag08.mitarbeiter.MitarbeiterTest
     ```
   - For bonus calculations:
     ```bash
     java tag08.mitarbeiter_bonus._10_MitarbeiterTest
     ```

---

## Example Usage

### Basic Employee Management

```java
Mitarbeiter mitarbeiter = new Mitarbeiter("EMP001", "John Doe", "Manager", 75000, 10);
System.out.println(mitarbeiter);
```

**Output**:
```
MitarbeiterID:       EMP001
Name:                John Doe
Position:            Manager
Gehalt:              75000.0
Erfahrungsjahre:     10
```

---

### Advanced Bonus Calculation

```java
_10_Mitarbeiter mitarbeiter = new _10_Mitarbeiter("EMP001", "Anna Schmidt", "Entwicklerin", 34535, 5);
System.out.println("Standardbonus: " + mitarbeiter.berechneBonus());
System.out.println("Bonus mit Faktor 0.15: " + mitarbeiter.berechneBonus(0.15));
System.out.println("Bonus mit Faktor 0.15 und Sonderzulage 1000: " + mitarbeiter.berechneBonus(0.15, 1000));
```

**Output**:
```
Standardbonus: 3453.5
Bonus mit Faktor 0.15: 5179.5
Bonus mit Faktor 0.15 und Sonderzulage 1000: 6179.5
```

---

## Contributing

1. **Fork** this repository (if available).  
2. **Create** a new branch (e.g., `feature/add-bonus-method`).  
3. **Commit** your changes.  
4. **Open a Pull Request** describing your improvements.

---

## License

This project is provided under the [MIT License](LICENSE). Feel free to use, modify, and distribute it.

---

Happy Coding!
