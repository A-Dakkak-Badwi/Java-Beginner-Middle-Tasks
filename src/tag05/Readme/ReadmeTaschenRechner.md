---

# TaschenRechner (tag05)

A simple **calculator** program written in Java. It uses **Swing** dialogs to interact with the user, allowing them to perform basic arithmetic operations (addition, subtraction, multiplication, and division) on two numbers. The user can repeat calculations until they choose to exit.

## Table of Contents

1. [Overview](#overview)  
2. [Features](#features)  
3. [Prerequisites](#prerequisites)  
4. [How to Compile and Run](#how-to-compile-and-run)  
5. [Example Usage](#example-usage)  
6. [Possible Improvements](#possible-improvements)  
7. [Contributing](#contributing)  
8. [License](#license)

---

## Overview

1. **User Input**  
   - Two floating-point numbers (`float`) are requested.  
   - The user is then asked to select an arithmetic operation from a menu (1–5).

2. **Operations**  
   - **Addition**: (1)  
   - **Subtraction**: (2)  
   - **Multiplication**: (3)  
   - **Division**: (4) (with a check to avoid division by zero)  
   - **Exit**: (5)

3. **Error Handling**  
   - The program catches **NumberFormatException** if the user inputs an invalid number (e.g., a non-numeric string).  
   - If the user tries to divide by zero, a message appears instead of crashing.

4. **Repeating**  
   - After each operation, the user can choose to **repeat** (“ja”) or **quit**.

---

## Features

- **Interactive Dialogs**: Uses `JOptionPane` for all user interactions.  
- **Looping Logic**: Runs in a `do-while` loop until the user opts to exit.  
- **Input Validation**:  
  - Ensures division by zero is not performed.  
  - Catches invalid numeric inputs.  
- **Multiple Operations**: Four basic arithmetic operations, plus an option to exit directly from the menu.

---

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher  
- A system or IDE that supports **Swing**-based GUI applications (standard on most desktop environments).

---

## How to Compile and Run

1. **Clone or download** the file `TaschenRechner.java` into your local folder or Java project.
2. **Open a terminal** (or command prompt) in that folder (or use your IDE).
3. **Compile**:
   ```bash
   javac TaschenRechner.java
   ```
4. **Run**:
   ```bash
   java TaschenRechner
   ```
5. **Interaction**:
   - Enter the first number.
   - Enter the second number.
   - Choose an operation (1–5).
   - View the result.
   - Decide whether to run another calculation or quit.

---

## Example Usage

1. **Prompt**: “Gib die erste Zahl ein:” → User enters `12`
2. **Prompt**: “Gib die zweite Zahl ein:” → User enters `4`
3. **Operation Menu**:  
   ```
   1: Addition
   2: Subtraktion
   3: Multiplikation
   4: Division
   5: Beenden
   ```
   → User enters `4` (Division).
4. **Result**:  
   - A dialog shows “Ergebnis: 3.0”
5. **Repeat**:
   - Prompt: “Möchtest du das Programm wiederholen? (ja/nein)”
   - Enter `ja` to continue, or `nein` to exit.

---

## Possible Improvements

- **Additional Operations**: Exponentiation, modulus, or other advanced math functions.  
- **Internationalization**: Using resource bundles for different languages.  
- **GUI Expansion**: Instead of dialogs, a full Swing GUI with buttons, text fields, etc.  
- **Validation**: More robust checks for invalid inputs or empty strings.

---

## Contributing

1. **Fork** this repository (if available).  
2. **Create** a new branch (e.g., `feature/advanced-operations`).  
3. **Commit** your changes.  
4. **Open a Pull Request** detailing your modifications.

---

## License

This project is offered under the [MIT License](LICENSE). Feel free to use, modify, and distribute it.

---

Happy Coding!
