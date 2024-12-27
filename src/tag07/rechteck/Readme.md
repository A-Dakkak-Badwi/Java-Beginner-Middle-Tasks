---

# Rechteck (Rectangle) Calculator

A Java program for working with rectangles. It includes methods for calculating rectangle properties, modifying dimensions, and providing formatted outputs for easy understanding.

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

1. **Rectangle Properties**  
   - The `Rechteck` class models a rectangle with:
     - **Length** (`laenge`)
     - **Width** (`breite`)
   - Provides methods to calculate:
     - **Area**
     - **Perimeter**
     - **Diagonal**
   - Allows increasing or decreasing dimensions interactively.

2. **Test Class**  
   - `RechteckTest` demonstrates usage and tests:
     - Creation of rectangles with default and user-defined dimensions.
     - Property calculations and dimension modification.

---

## How It Works

1. **Rectangle Class (`Rechteck`)**  
   - Models the properties of a rectangle.
   - Validates dimensions, ensuring that the longer side is always designated as the "length."

2. **Methods Provided**  
   - Calculation methods:
     - `getFlaeche()`: Returns the area.
     - `getUmfang()`: Returns the perimeter.
     - `getDiagonale()`: Returns the diagonal length.
   - Modification methods:
     - `laengeVergroessern(double laenge)`: Increases the length.
     - `breiteVergroessern(double breite)`: Increases the width.
     - `laengeVerkleinern(double laenge)`: Decreases the length.
     - `breiteVerkleinern(double breite)`: Decreases the width.
   - Input methods for both default and interactive use.

3. **Test Class (`RechteckTest`)**  
   - Demonstrates features of the `Rechteck` class through:
     - Predefined tests with hardcoded dimensions.
     - Interactive input for dimensions and actions via the `Tools` utility class.

---

## Features

- **Encapsulation**:
  - Private attributes for length and width, with public getter and setter methods.
- **Dynamic Rectangle Creation**:
  - Default constructor initializes dimensions to `0.0`.
  - Parameterized constructor initializes dimensions with user-provided values.
- **Flexible Resizing**:
  - Methods to increase or decrease dimensions.
- **Validation**:
  - Ensures that the longer side is always assigned as the "length."
- **Formatted Output**:
  - Custom `toString` for easy readability of rectangle properties.

---

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher.
- A **`Tools`** class in the project (for user input and output).

---

## How to Compile and Run

1. **Ensure** you have:
   - `Rechteck.java` (the rectangle class)
   - `RechteckTest.java` (the test class)
   - `Tools.java` (the utility class)
   in the correct directories matching their package declarations.
2. **Compile** the Java files:
   ```bash
   javac tag07/rechteck/Rechteck.java tag07/rechteck/RechteckTest.java util/Tools.java
   ```
3. **Run** the main test class:
   ```bash
   java tag07.rechteck.RechteckTest
   ```

---

## Example Usage

1. **Outputs**:
   - A rectangle with length `10.15` and width `5.55`:
     ```
     Lange Seite:           10.15
     Kurze Seite:            5.55
     Fläche:                56.32
     Umfang:                31.40
     Diagonale:             11.52
     Hinweis:               Lange Seite ist 10.15, kurze Seite ist 5.55
     ```
   - After increasing the length and decreasing the width:
     ```
     Neue Länge:           15.15
     Neue Breite:           3.55
     ```

2. **Tests**:
   - Test 1: Create and display rectangles with default and hardcoded dimensions.
   - Test 2: Use user input to create and modify a rectangle interactively.

---

## Contributing

1. **Fork** this repository (if available).  
2. **Create** a new branch (e.g., `feature/add-new-method`).  
3. **Commit** your changes.  
4. **Open a Pull Request** describing your improvements.

---

## License

This project is provided under the [MIT License](LICENSE). Feel free to use, modify, and distribute it.

---

Happy Coding!
