---

# Kreis (Circle) Calculator

A simple Java program for performing calculations related to circles. This includes determining the radius, circumference, and area of a circle, with options to set these values interactively or through preset inputs.

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

1. **Interactive Circle Calculations**  
   - The program can create circles with default or specified radii.
   - It computes circle properties such as:
     - **Radius**
     - **Circumference**
     - **Area**
2. **Multiple Methods for Input**  
   - Preset values in the test class.
   - Interactive user input via utility tools (`Tools` class).
3. **Flexible Radius Setting**  
   - Based on either the circumference or area provided by the user.

---

## How It Works

1. **Input**  
   - Users can input radius, circumference, or area values using the `Tools` utility class.
   - Hardcoded tests showcase class functionality for quick debugging.

2. **Circle Class (`Kreis`)**  
   - Encapsulates circle properties and provides:
     - Methods to calculate circumference and area.
     - Setters to adjust radius based on circumference or area.
   - Implements a custom `toString` for formatted output.

3. **Test Class (`KreisTest`)**  
   - Contains multiple tests:
     - **Test 1**: Demonstrates object creation and default behavior.
     - **Test 2**: Uses user input for interactive testing.
     - **Test 3**: Calculates radius based on circumference and area.

---

## Features

- **Encapsulation**: All circle properties are private and accessed via methods.
- **Custom Constructors**:
  - Default constructor initializes radius to `0.0`.
  - Parameterized constructor allows specifying the radius.
- **Formatted Display**: `toString` method outputs circle details in a user-friendly way.
- **Dynamic Radius Calculation**:
  - Radius can be adjusted based on circumference or area.

---

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher.
- A **`Tools`** class in the project (for user input and output).

---

## How to Compile and Run

1. **Ensure** you have:
   - `Kreis.java` (the circle class)
   - `KreisTest.java` (the test class)
   - `Tools.java` (the utility class)
   in the correct directories matching their package declarations.
2. **Compile** the Java files:
   ```bash
   javac tag07/kreis/Kreis.java tag07/kreis/KreisTest.java util/Tools.java
   ```
3. **Run** the main test class:
   ```bash
   java tag07.kreis.KreisTest
   ```

---

## Example Usage

1. **Outputs**:
   - After setting the radius using a circumference:
     ```
     ___________________Kreis_________________
     ***************************************
     Eingegebener Umfang:            31.42
     Der Radius beträgt:             5.00
     Der Umfang beträgt:             31.42
     Die Fläche beträgt:             78.54
     ***************************************
     ```
   - After setting the radius using an area:
     ```
     ___________________Kreis_________________
     ***************************************
     Eingegebene Fläche:             78.54
     Der Radius beträgt:             5.00
     Der Umfang beträgt:             31.42
     Die Fläche beträgt:             78.54
     ***************************************
     ```

2. **Tests**:
   - Test the class with preset values.
   - Use user input for interactive calculations.

---

## Contributing

1. **Fork** this repository (if available).  
2. **Create** a new branch (e.g., `feature/more-tests`).  
3. **Commit** your changes.  
4. **Open a Pull Request** describing your improvements.

---

## License

This project is provided under the [MIT License](LICENSE). Feel free to use, modify, and distribute it.

---

Happy Coding!
