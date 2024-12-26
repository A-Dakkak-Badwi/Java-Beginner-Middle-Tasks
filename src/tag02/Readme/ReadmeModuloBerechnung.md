---

# ModuloBerechnung (tag02)

A simple Java program that prompts the user for two integers and calculates the remainder (modulo operation) when the first integer is divided by the second.

## Table of Contents
- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [How to Compile and Run](#how-to-compile-and-run)
- [Example Usage](#example-usage)
- [Contributing](#contributing)
- [License](#license)

---

## Overview
This program:
1. Asks the user to input two integers via **Swing** dialog boxes.
2. Converts the inputs from `String` to `int`.
3. Uses the modulo operator (`%`) to calculate the remainder of the division.
4. Displays the result in a final dialog box.

**Key Concepts**:
- **Modulo Operator**: `a % b` returns the remainder when `a` is divided by `b`.
- **Swing Dialogs**: `JOptionPane` is used to gather user input and display the result in a simple pop-up window.

---

## Prerequisites
- **Java Development Kit (JDK)** 8 or higher
- A system that supports Swing-based GUI applications.

---

## How to Compile and Run
1. **Clone or download** the repository containing `ModuloBerechnung.java`.
2. **Open a terminal** (or command prompt) in the same directory as the `.java` file.
3. **Compile** the code:
   ```bash
   javac ModuloBerechnung.java
   ```
4. **Run** the compiled class:
   ```bash
   java ModuloBerechnung
   ```
5. **User Interaction**:
   - The program will prompt for the **first integer**.
   - Then it will prompt for the **second integer**.
   - Finally, it will display a dialog showing the remainder of the first integer divided by the second.

---

## Example Usage
1. **First Prompt**: User enters `17`.
2. **Second Prompt**: User enters `5`.
3. **Calculation**: \( 17 \% 5 = 2 \).
4. **Result Dialog**:
   ```
   Der Rest der Division von 17 durch 5 beträgt 2
   ```

---

## Contributing
1. **Fork** this repository (if available).  
2. **Create** a new branch (e.g., `feature/gui-improvements`).  
3. **Commit** your changes (e.g., additional validation checks).  
4. **Open a Pull Request** describing your modifications.

---

## License
This project is provided under the [MIT License](LICENSE). You are free to use, modify, and distribute it.

---

Happy Coding!
