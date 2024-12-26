---

# Durchschnittliche Niederschlagsmenge (tag02)

A simple Java program that prompts the user for precipitation data (rainfall) for the months of April, May, and June, calculates the average precipitation, and then displays the results in a dialog box.

## Table of Contents
1. [Overview](#overview)
2. [Features](#features)
3. [Prerequisites](#prerequisites)
4. [How to Compile and Run](#how-to-compile-and-run)
5. [Example Usage](#example-usage)
6. [Contributing](#contributing)
7. [License](#license)

---

## Overview
This program:
- Asks the user to input the precipitation amounts (in liters per square meter, for example) for April, May, and June.
- Calculates the **average** precipitation across the three months.
- Displays each month’s input and the overall average in a Swing dialog.

### Why Use Double?
Because precipitation values often include decimals (e.g., 12.75 liters/m²), the `double` data type is more appropriate than `int`.

---

## Features
- **User Input via Dialogs**: Uses `JOptionPane` for a simple graphical input experience.
- **Calculation**: Sums and averages the three user inputs.
- **Formatted Output**: Shows two decimal places for each precipitation value and the calculated average.

---

## Prerequisites
- **Java Development Kit (JDK)** 8 or higher
- A system that supports Swing-based GUI applications (most desktop platforms).

---

## How to Compile and Run
1. **Clone or download** the repository containing `DurchschnittlicheNiederschlagsmenge.java`.
2. **Open a terminal or command prompt** in the same directory as the `.java` file.
3. **Compile** the code:
   ```bash
   javac DurchschnittlicheNiederschlagsmenge.java
   ```
4. **Run** the compiled class:
   ```bash
   java DurchschnittlicheNiederschlagsmenge
   ```
5. **Interaction**:
   - Three input dialogs will appear in sequence:
     1. “Bitte geben Sie Niederschlag April ein”
     2. “Bitte geben Sie Niederschlag Mai ein”
     3. “Bitte geben Sie Niederschlag Juni ein”
   - After entering the values, a final dialog displays the results.

---

## Example Usage

1. **First Dialog** (April): `50`
2. **Second Dialog** (May): `42.5`
3. **Third Dialog** (June): `60`

The program calculates:
- April: 50 l/qm  
- May: 42.50 l/qm  
- June: 60.00 l/qm  
- **Average**: \(\frac{50 + 42.5 + 60}{3} = 50.83\) l/qm

A final dialog displays:
```
Die Niederschlagsmenge für April ist: 50.00 l/qm
Die Niederschlagsmenge für Mai ist: 42.50 l/qm
Die Niederschlagsmenge für Juni ist: 60.00 l/qm

Die durchschnittliche Niederschlagsmenge ist: 50.83 l/qm
```

---

## Contributing
1. **Fork** the repository (if applicable).  
2. **Create a new branch** for your changes (e.g., `feature/metric-improvements`).  
3. **Commit** your modifications.  
4. **Open a Pull Request** describing your changes and proposed improvements.

---

## License
This project is provided under the [MIT License](LICENSE). Feel free to use, modify, and distribute it as you see fit.

---

Happy Coding!
