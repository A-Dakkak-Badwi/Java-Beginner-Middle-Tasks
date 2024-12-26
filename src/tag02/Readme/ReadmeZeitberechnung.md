---

# Zeitberechnung (tag02)

A simple Java program that converts a given time in **milliseconds** to a more human-readable format, including years, days, hours, minutes, seconds, and remaining milliseconds.

## Table of Contents
- [Overview](#overview)
- [How It Works](#how-it-works)
- [Prerequisites](#prerequisites)
- [How to Compile and Run](#how-to-compile-and-run)
- [Example Usage](#example-usage)
- [Contributing](#contributing)
- [License](#license)

---

## Overview
This program:
1. Prompts the user to enter a time value (in milliseconds) via a **Swing** dialog.
2. Converts the given milliseconds into:
   - **Years**
   - **Days**
   - **Hours**
   - **Minutes**
   - **Seconds**
   - **Remaining Milliseconds**
3. Displays the results in a final dialog box.

---

## How It Works
1. **User Input**  
   - A dialog box appears asking for a millisecond value.

2. **Parsing and Conversion**  
   - The program reads the input (as a `String`), converts it to a `long`, and performs several modulo (`%`) and division operations to break down the milliseconds into different time units.

3. **Output**  
   - The final dialog box shows a detailed breakdown of the input in years, days, hours, minutes, seconds, and leftover milliseconds.

---

## Prerequisites
- **Java Development Kit (JDK)** 8 or higher
- A system that supports running Swing-based GUI programs (most desktop environments do).

---

## How to Compile and Run
1. **Clone** or **download** the repository containing `Zeitberechnung.java`.
2. **Open a terminal** (or command prompt) in the folder where the file is located.
3. **Compile** the program:
   ```bash
   javac Zeitberechnung.java
   ```
4. **Run** the compiled class:
   ```bash
   java Zeitberechnung
   ```
5. **Interaction**:
   - A dialog prompts for the time in milliseconds.
   - After entering the value, a final dialog displays the converted time units.

---

## Example Usage
1. **Prompt**: Suppose you enter `1000000000` (one billion) for the milliseconds.
2. **Calculation**:
   - Convert `1000000000` ms to seconds, minutes, hours, days, years, etc.
3. **Result** (example):
   ```
   1000000000 Millisekunden entsprechen: 
   0 Jahren 11 Tagen 13 Stunden 46 minuten 40 Sekunden und 0
   ```
   (Exact output may vary based on the code’s calculations.)

---

## Contributing
1. **Fork** this repository (if available).  
2. **Create** a new branch for your changes (e.g., `feature/add-weeks`).  
3. **Implement** your modifications (e.g., additional formats or UI enhancements).  
4. **Open a Pull Request** describing your changes.

---

## License
This project is provided under the [MIT License](LICENSE). Feel free to modify and distribute it.

---

Happy Coding!
