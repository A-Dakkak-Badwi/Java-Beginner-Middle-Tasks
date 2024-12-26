---

# Rabatt (tag03)

A simple Java program that calculates a discount based on the user’s age. If the user is under 18, they get a 20% discount. Otherwise, they get a 10% discount.

## Table of Contents
- [Overview](#overview)
- [Discount Logic](#discount-logic)
- [Prerequisites](#prerequisites)
- [How to Compile and Run](#how-to-compile-and-run)
- [Example Usage](#example-usage)
- [Contributing](#contributing)
- [License](#license)

---

## Overview

1. **User Input**  
   - The program uses `JOptionPane` to prompt the user for:
     - Their **age** (an integer)
     - The **price** of a product (a floating-point number)
2. **Calculation**  
   - Determines the discount based on the user’s age.
   - Computes the **final price** after applying the discount.
3. **Output**  
   - Displays both the **discount percentage** and the **final price** in pop-up dialogs.

---

## Discount Logic

- **Under 18**: 20% discount  
- **18 or older**: 10% discount  

The relevant code:
```java
double rabatt = (alter < 18) ? 0.20 : 0.10;
```

---

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher  
- Ability to run Swing-based GUI applications (standard on most desktop operating systems)

---

## How to Compile and Run

1. **Clone or download** this repository (or just the `Rabatt.java` file).
2. **Open a terminal** (or command prompt) in that folder.
3. **Compile** the file:
   ```bash
   javac Rabatt.java
   ```
4. **Run** the compiled class:
   ```bash
   java Rabatt
   ```
5. **Interaction**:
   - A dialog asks for your age.  
   - A second dialog asks for the product price.  
   - Finally, two dialogs display your discount percentage and the final price after discount.

---

## Example Usage

1. **Input**:  
   - Age: `17`  
   - Price: `100.0`
2. **Discount Calculation**:  
   - Age < 18 → 20% discount  
   - 20% of 100.0 = 20.0  
   - Final price = 100.0 - 20.0 = 80.0
3. **Output**:
   - First dialog: “Du erhältst einen Rabatt von 20.0%.”  
   - Second dialog: “Der Endpreis nach Anwendung des Rabatts beträgt: 80.0 Euro”

---

## Contributing

1. **Fork** this repository (if available).  
2. **Create** a new branch (e.g., `feature/different-age-discounts`).  
3. **Commit** your changes.  
4. **Open a Pull Request** and describe your modifications.

---

## License

This project is distributed under the [MIT License](LICENSE). You’re free to use, modify, and share it.

---

Happy Coding!
