---

# Advanced Mitarbeiter Management System

A Java application to manage employee records with advanced features such as bonus calculations and method overloading for flexible data display. This project includes robust validation mechanisms for employee attributes and multiple ways to compute bonuses.

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

1. **Employee Class (`_10_Mitarbeiter`)**:
   - Encapsulates attributes such as ID, name, position, salary, and years of experience.
   - Includes methods for bonus calculation with multiple options.
   - Provides flexible methods for displaying employee information with or without salary details.

2. **Test Class (`_10_MitarbeiterTest`)**:
   - Demonstrates key functionalities, including bonus calculations and data validation.

---

## How It Works

1. **Employee Attributes**:
   - `mitarbeiterID`: Unique identifier for the employee.
   - `name`: Employee's full name.
   - `position`: Employee's job title.
   - `gehalt` (salary): Employee's salary.
   - `erfahrungsjahre` (experience years): Number of years of professional experience.

2. **Validation**:
   - Ensures attributes like salary and years of experience are non-negative.
   - Assigns default values for invalid inputs (e.g., empty strings or negative numbers).

3. **Method Overloading**:
   - **Bonus Calculation**:
     - `berechneBonus()`: Computes a standard bonus as 10% of the salary.
     - `berechneBonus(double faktor)`: Computes the bonus using a custom factor.
     - `berechneBonus(double faktor, double sonderzulage)`: Computes the bonus with a custom factor and an additional allowance.
   - **Data Display**:
     - `zeigeMitarbeiterInfo()`: Displays all employee details, including salary.
     - `zeigeMitarbeiterInfo(boolean mitGehalt)`: Displays employee details with or without salary, based on the parameter.

---

## Features

- **Encapsulation**:
  - Attributes are private with public getter and setter methods for controlled access.
- **Validation**:
  - Ensures data integrity by preventing invalid values for attributes.
- **Flexible Bonus Calculation**:
  - Supports multiple ways to compute bonuses based on custom business logic.
- **Formatted Output**:
  - Employee information can be displayed with or without salary details.
- **Default Values**:
  - Provides fallback values for invalid inputs, ensuring the program runs smoothly.

---

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher.

---

## How to Compile and Run

1. **Ensure** you have the following files:
   - `_10_Mitarbeiter.java` (Employee class)
   - `_10_MitarbeiterTest.java` (Test class)
2. **Compile** the Java files:
   ```bash
   javac tag08/mitarbeiter_bonus/_10_Mitarbeiter.java tag08/mitarbeiter_bonus/_10_MitarbeiterTest.java
   ```
3. **Run** the test class:
   ```bash
   java tag08.mitarbeiter_bonus._10_MitarbeiterTest
   ```

---

## Example Usage

### Creating an Employee and Displaying Information

```java
_10_Mitarbeiter mitarbeiter = new _10_Mitarbeiter("EMP001", "Anna Schmidt", "Entwicklerin", 34535, 5);
mitarbeiter.zeigeMitarbeiterInfo();
```

**Output**:
```
MitarbeiterID: EMP001
Name: Anna Schmidt
Position: Entwicklerin
Gehalt: 34535.0
Erfahrungsjahre: 5
```

### Calculating Bonuses

```java
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

### Displaying Information Without Salary

```java
mitarbeiter.zeigeMitarbeiterInfo(false);
```

**Output**:
```
MitarbeiterID: EMP001
Name: Anna Schmidt
Position: Entwicklerin
Erfahrungsjahre: 5
```

---

## Contributing

1. **Fork** this repository (if available).  
2. **Create** a new branch (e.g., `feature/add-new-bonus-method`).  
3. **Commit** your changes.  
4. **Open a Pull Request** describing your improvements.

---

## License

This project is provided under the [MIT License](LICENSE). Feel free to use, modify, and distribute it.

---

Happy Coding!
