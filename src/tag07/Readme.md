---

# Geometry Applications: Rechteck (Rectangle) and Kreis (Circle)

This project consists of two Java applications for working with geometric shapes: rectangles and circles. Each application allows for creating, modifying, and calculating properties of the respective shapes.

---

## Table of Contents

- [Overview](#overview)
- [How It Works](#how-it-works)
  - [Rechteck (Rectangle)](#rechteck-rectangle)
  - [Kreis (Circle)](#kreis-circle)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [How to Compile and Run](#how-to-compile-and-run)
- [Example Usage](#example-usage)
  - [Rechteck](#rechteck-example)
  - [Kreis](#kreis-example)
- [Contributing](#contributing)
- [License](#license)

---

## Overview

The project contains two core components:

1. **Rechteck**:
   - Models a rectangle with attributes for length and width.
   - Provides methods to calculate properties such as area, perimeter, and diagonal length.
   - Includes functionality for resizing dimensions interactively.

2. **Kreis**:
   - Models a circle with an attribute for radius.
   - Provides methods to calculate properties such as circumference and area.
   - Allows setting the radius based on the circumference or area.

---

## How It Works

### Rechteck (Rectangle)

1. **Attributes**:
   - `laenge` (length): The longer side of the rectangle.
   - `breite` (width): The shorter side of the rectangle.
2. **Methods**:
   - Calculate area (`getFlaeche`), perimeter (`getUmfang`), and diagonal (`getDiagonale`).
   - Modify dimensions using methods like `laengeVergroessern` and `breiteVerkleinern`.
   - Display rectangle properties with a custom `toString` method.

### Kreis (Circle)

1. **Attributes**:
   - `radius`: The radius of the circle.
2. **Methods**:
   - Calculate circumference (`getUmfang`) and area (`getFläche`).
   - Set radius based on circumference (`setRadiusByUmfang`) or area (`setRadiusByFlaeche`).
   - Display circle properties with a custom `toString` method.

---

## Features

- **Encapsulation**:
  - Attributes are private, with getter and setter methods for controlled access.
- **Dynamic Resizing**:
  - Both applications allow modification of dimensions or radius.
- **Formatted Output**:
  - Custom `toString` methods display properties in a user-friendly format.
- **Validation**:
  - `Rechteck` ensures that the longer side is always designated as the length.

---

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher.
- A **`Tools`** utility class for user input and output.

---

## How to Compile and Run

1. **Ensure** you have the following files:
   - `Rechteck.java` (Rectangle class)
   - `RechteckTest.java` (Test class for rectangles)
   - `Kreis.java` (Circle class)
   - `KreisTest.java` (Test class for circles)
2. **Compile** the Java files:
   ```bash
   javac tag07/rechteck/Rechteck.java tag07/rechteck/RechteckTest.java tag07/kreis/Kreis.java tag07/kreis/KreisTest.java
   ```
3. **Run** the test classes:
   - For rectangles:
     ```bash
     java tag07.rechteck.RechteckTest
     ```
   - For circles:
     ```bash
     java tag07.kreis.KreisTest
     ```

---

## Example Usage

### Rechteck Example

1. **Input**:
   - Length: `10.0`
   - Width: `5.0`
2. **Operations**:
   - Calculate area, perimeter, and diagonal.
   - Increase length by `2.0` and decrease width by `1.0`.
3. **Output**:
   ```
   Lange Seite:           10.00
   Kurze Seite:            5.00
   Fläche:                50.00
   Umfang:                30.00
   Diagonale:             11.18
   Länge nach Vergrößern: 12.00
   Breite nach Verkleinern: 4.00
   ```

### Kreis Example

1. **Input**:
   - Radius: `7.0`
2. **Operations**:
   - Calculate circumference and area.
   - Adjust radius based on circumference or area.
3. **Output**:
   ```
   Der Radius beträgt:           7.00
   Der Umfang beträgt:          43.98
   Die Fläche beträgt:          153.94
   ```

---

## Contributing

1. **Fork** this repository (if available).  
2. **Create** a new branch (e.g., `feature/add-method`).  
3. **Commit** your changes.  
4. **Open a Pull Request** describing your improvements.

---

## License

This project is provided under the [MIT License](LICENSE). Feel free to use, modify, and distribute it.

---

Happy Coding!
