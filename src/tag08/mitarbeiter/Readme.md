---

# Mitarbeiter Management System

A Java application to manage employee records. The application includes features for creating, updating, and validating employee information such as ID, name, position, salary, and years of experience.

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

1. **Mitarbeiter Class**:
   - Represents an employee with attributes for ID, name, position, salary, and years of experience.
   - Includes constructors for creating employees with default or custom values.
   - Implements validation to ensure that values such as salary and years of experience are non-negative.

2. **MitarbeiterTest Class**:
   - Provides test cases to demonstrate and validate the functionality of the `Mitarbeiter` class.
   - Includes interactive input validation and data manipulation scenarios.

---

## How It Works

1. **Mitarbeiter Class**:
   - Attributes:
     - `mitarbeiterID`: A unique identifier for the employee.
     - `name`: The employee's name.
     - `position`: The employee's position or job title.
     - `gehalt` (salary): The employee's salary.
     - `erfahrungsjahre` (experience years): The employee's years of professional experience.
   - Methods:
     - **Setters**: Allow updating each attribute with validation.
     - **Getters**: Provide access to the current values of attributes.
     - **toString**: Formats and displays all employee information.

2. **MitarbeiterTest Class**:
   - **Test Cases**:
     - Demonstrates the creation of employees with valid and invalid data.
     - Shows how to update attributes and validate inputs.
   - **Interactive Input Validation**:
     - Prompts the user for ID, name, position, salary, and years of experience.
     - Ensures all inputs are valid before creating an employee object.

---

## Features

- **Encapsulation**:
  - Private attributes with getter and setter methods for controlled access.
- **Input Validation**:
  - Ensures attributes like salary and experience are non-negative.
  - Provides default values for invalid inputs.
- **Flexible Initialization**:
  - Default and parameterized constructors for creating employees.
- **Formatted Output**:
  - `toString` method for clean and structured display of employee information.

---

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher.
- A **`Tools`** utility class for user input and output (if interactive tests are used).

---

## How to Compile and Run

1. **Ensure** you have the following files:
   - `Mitarbeiter.java` (Employee class)
   - `MitarbeiterTest.java` (Test class)
2. **Compile** the Java files:
   ```bash
   javac tag08/mitarbeiter/Mitarbeiter.java tag08/mitarbeiter/MitarbeiterTest.java
   ```
3. **Run** the test class:
   ```bash
   java tag08.mitarbeiter.MitarbeiterTest
   ```

---

## Example Usage

### Test 1: Creating Employees

```java
Mitarbeiter mitarbeiter1 = new Mitarbeiter();
System.out.println(mitarbeiter1);

Mitarbeiter mitarbeiter2 = new Mitarbeiter("1234", "Max Mustermann", "Entwickler", 75000.0, 5);
System.out.println(mitarbeiter2);
```

**Output**:
```
MitarbeiterID:               Unbekannt
Name:                        Unbekannt
Position:                    Unbekannt
Gehalt:                      0.00
Erfahrungsjahre:             0

MitarbeiterID:               1234
Name:                        Max Mustermann
Position:                    Entwickler
Gehalt:                      75000.00
Erfahrungsjahre:             5
```

### Test 2: Invalid Data Handling

```java
Mitarbeiter mitarbeiter3 = new Mitarbeiter(null, "", "Designer", -50000.0, -2);
System.out.println(mitarbeiter3);
```

**Output**:
```
❤️'MitarbeiterID'            **❤ darf nicht leer oder null sein. Standardwert 'Unbekannt' wird verwendet.
❤️'Name'                     **❤ darf nicht leer oder null sein. Standardwert 'Unbekannt' wird verwendet.
❤️'Gehalt'                   **❤ darf nicht leer, null oder negativ sein. Standardwert 0.0 wird verwendet.
❤️'Erfahrungsjahre'          **❤ dürfen nicht leer, null oder negativ sein. Standardwert 0 wird verwendet.
MitarbeiterID:               Unbekannt
Name:                        Unbekannt
Position:                    Designer
Gehalt:                      0.00
Erfahrungsjahre:             0
```

### Test 3: Interactive Input Validation

Run the interactive test method `test2()` in `MitarbeiterTest`. Follow the prompts to enter valid data for a new employee.

---

## Contributing

1. **Fork** this repository (if available).  
2. **Create** a new branch (e.g., `feature/add-validation`).  
3. **Commit** your changes.  
4. **Open a Pull Request** describing your improvements.

---

## License

This project is provided under the [MIT License](LICENSE). Feel free to use, modify, and distribute it.

---

Happy Coding!
