---

# GeradeZahlen (tag03)

A simple Java program that determines whether a user-provided integer is even or odd.

## Table of Contents
- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [How to Compile and Run](#how-to-compile-and-run)
- [Example Usage](#example-usage)
- [Contributing](#contributing)
- [License](#license)

---

## Overview
1. **User Prompt**  
   - The program uses a **Swing** dialog to ask the user to enter an integer.
2. **Check Even or Odd**  
   - It checks if the integer is divisible by 2.
   - If there is no remainder (`% 2 == 0`), the number is even. Otherwise, it is odd.
3. **Display Result**  
   - A final dialog informs the user whether the integer is even or odd.

---

## Prerequisites
- **Java Development Kit (JDK)** 8 or higher  
- A system that can run Swing-based GUI applications (most desktop OS’s).

---

## How to Compile and Run
1. **Clone or download** this repository (or just the `GeradeZahlen.java` file).
2. **Open a terminal** (or command prompt) in the same directory.
3. **Compile** the program:
   ```bash
   javac GeradeZahlen.java
   ```
4. **Run** the compiled class:
   ```bash
   java GeradeZahlen
   ```
5. **Interaction**:
   - A dialog appears, prompting you to enter an integer (e.g., `10`).
   - Another dialog reports if `10` is even or odd.

---

## Example Usage
1. **Prompt**: User enters `7`.
2. **Calculation**:
   - `7 % 2` equals `1`, which is not `0`.
3. **Result**:
   - A dialog reads: “7 ist eine ungerade Zahl.”

---

## Contributing
1. **Fork** this repository (if applicable).  
2. **Create** a new branch (e.g., `feature/refactor-ui`).  
3. **Commit** your improvements.  
4. **Open a Pull Request** describing your changes.

---

## License
This project is provided under the [MIT License](LICENSE). You’re free to use, modify, and distribute it.

---

Happy Coding!
