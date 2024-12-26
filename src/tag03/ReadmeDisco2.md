---

# Disco2 (tag03)

A simple Java program that decides whether a person may enter a disco (nightclub) and what perks they get, depending on their responses regarding age, VIP status, and gender.

## Table of Contents

- [Overview](#overview)
- [Logic Breakdown](#logic-breakdown)
- [Prerequisites](#prerequisites)
- [How to Compile and Run](#how-to-compile-and-run)
- [Example Usage](#example-usage)
- [Contributing](#contributing)
- [License](#license)

---

## Overview

This program uses **Swing** dialogs to prompt the user for three pieces of information:

1. **Are you older than 18?** (Yes/No)  
2. **Are you a VIP?** (Yes/No)  
3. **Are you male or female?** (M/W)

Based on these inputs, the program displays a final message about whether the user can enter the disco and what perks (if any) apply—like VIP lounge access or a 15% drink discount on Ladies’ Night.

---

## Logic Breakdown

1. **Age Check**  
   - If the user answers **“nein”** (no) to being over 18, they’re denied entry.

2. **Gender & VIP Checks**  
   - **18+ & VIP & Female (W)**:  
     “Welcome to the disco! Enjoy the VIP Lounge and Ladies’ Night discount (15% off drinks).”
   - **18+ & Not VIP & Female (W)**:  
     “Welcome to the disco! Enjoy Ladies’ Night discount (15% off drinks).”
   - **18+ & VIP & Male (M)**:  
     “Welcome to the disco! Enjoy the VIP Lounge!”
   - **18+ & Not VIP & Male (M)**:  
     “Welcome to the disco!”
   - Otherwise: “Invalid entry” / “Ungültige Angabe.”

---

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher
- Ability to run Swing-based GUI applications (built into most desktop environments)

---

## How to Compile and Run

1. **Clone or download** this repository (or just the `Disco2.java` file).
2. **Open a terminal** (or command prompt) in the same folder.
3. **Compile** the program:
   ```bash
   javac Disco2.java
   ```
4. **Run** the compiled class:
   ```bash
   java Disco2
   ```
5. **Interaction**:
   - A dialog will ask if you are older than 18.  
   - A second dialog will ask if you are a VIP.  
   - A third dialog will ask if you are male (M) or female (W).  
   - A final dialog will display your access details or denial.

---

## Example Usage

1. **First prompt**: “Bist du älter als 18?” → User enters: `ja`  
2. **Second prompt**: “Bist du ein VIP?” → User enters: `ja`  
3. **Third prompt**: “Bist du ein M oder eine W?” → User enters: `W`  

**Result**:  
```
Herzlich Willkommen in der Disco! 
Viel Spaß in der VIP Lounge! Heute ist Ladies' Night. Du bekommst 15% Rabatt auf Getränke.
```

---

## Contributing

1. **Fork** this repository (if applicable).  
2. **Create** a new branch (e.g., `feature/more-discounts`).  
3. **Commit** and push your changes.  
4. **Open a Pull Request** describing your enhancements.

---

## License

This project is offered under the [MIT License](LICENSE). You’re free to use, modify, and distribute it.

---

Happy Coding!
