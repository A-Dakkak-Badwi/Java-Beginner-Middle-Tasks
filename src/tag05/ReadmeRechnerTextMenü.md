---

# RechnerTextMenü (tag05)

A simple text-based calculator that prompts the user to select from multiple operations—addition, subtraction, multiplication, or division—until they choose to exit. The program uses a custom `Tools` utility class for user input and output.

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

1. **User Prompt**  
   - The program repeatedly asks the user for two integers (`zahl1` and `zahl2`).
2. **Operation Selection**  
   - A text menu is displayed with the following options:
     1. Addition  
     2. Subtraction  
     3. Multiplication  
     4. Division  
     5. Exit  
3. **Result Display**  
   - After the user selects an operation, the result is shown via a dialog (using `Tools.ausgeben`).
4. **Repetition**  
   - The user can continue performing calculations or choose to exit by typing “nein.”

---

## How It Works

1. **Input**  
   - The program uses `Tools.zahlEingeben(String prompt)` to collect integer inputs.
   - It also uses `Tools.textEingeben(String prompt)` to ask if the user wants to repeat the process (`ja`/`nein`).

2. **Switch-Case Structure**  
   - Each case corresponds to a basic arithmetic operation:
     - **Addition**: `zahl1 + zahl2`
     - **Subtraction**: `zahl1 - zahl2`
     - **Multiplication**: `zahl1 * zahl2`
     - **Division**: `zahl1 / zahl2` (with zero-check)
     - **Exit**: Ends the program with a message (“Das programm wird beendet”).
   - An invalid selection triggers an error message (“Ungültige Optionen...”).

3. **Looping**  
   - The `do-while` loop runs until the user chooses to stop by typing “nein” at the end prompt.

---

## Features

- **Intuitive Text Menu**: The user can select operations using numbers (1–5).  
- **Error Handling**:  
  - Division by zero check: Displays an error if `zahl2` equals `0`.  
  - Default case in the switch for unrecognized operation choices.  
- **Repeat or Exit**: Prompts the user to continue or end after each calculation.

---

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher  
- A **`Tools`** class in the project (with methods `zahlEingeben`, `textEingeben`, and `ausgeben`).

---

## How to Compile and Run

1. **Ensure** you have:
   - `RechnerTextMenü.java` (this file)
   - `Tools.java` (the utility class)  
   in the correct directories matching their package declarations.
2. **Compile** the Java files:
   ```bash
   javac tag05/RechnerTextMenü.java util/Tools.java
   ```
3. **Run** the main class:
   ```bash
   java tag05.RechnerTextMenü
   ```
4. **User Interaction**:
   - Enter the first integer when prompted.
   - Enter the second integer when prompted.
   - Select an operation from the menu (1–5).
   - See the result in a dialog, and choose whether to repeat or quit.

---

## Example Usage

1. **Prompts**:
   - First integer: `10`
   - Second integer: `2`
   - Menu:
     ```
     1: Addition
     2: Substraktion
     3: Multipikation
     4: Division
     5: Beenden
     ```
   - Choose `4` for division.
2. **Result**:
   - “Ergebnis der Division ist: 5”
3. **Repeat?**  
   - If you enter `ja`, the program restarts.
   - If you enter `nein` or click cancel, the program ends with “Das Programm wird beendet.”

---

## Contributing

1. **Fork** this repository (if available).  
2. **Create** a new branch (e.g., `feature/more-operations`).  
3. **Commit** your changes.  
4. **Open a Pull Request** describing your enhancements.

---

## License

This project is provided under the [MIT License](LICENSE). You’re free to use, modify, and distribute it.

---

Happy Coding!
