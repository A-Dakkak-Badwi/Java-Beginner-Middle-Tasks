---

# NotenBestanden (tag03)

A simple Java program that determines whether a student’s grade (on a scale of 1 to 6) indicates a passing or failing mark.

## Table of Contents

- [Overview](#overview)
- [Grade Scale](#grade-scale)
- [Prerequisites](#prerequisites)
- [How to Compile and Run](#how-to-compile-and-run)
- [Example Usage](#example-usage)
- [Contributing](#contributing)
- [License](#license)

---

## Overview

1. **User Prompt**  
   - The program uses a `JOptionPane` dialog to ask the user for a grade (`1` to `6`).

2. **Logic**  
   - **Grades 1–4**: Considered “passed” (bestanden).  
   - **Grades 5–6**: Considered “failed” (nicht bestanden).  
   - Any input outside `1–6`: Displays an error message (e.g., “Deine Eingabe ist falsch”).

3. **Output**  
   - Displays a pop-up dialog telling the user if they passed or failed.

---

## Grade Scale

Typical grading in some German contexts:
- **1**: Sehr gut (very good)  
- **2**: Gut (good)  
- **3**: Befriedigend (satisfactory)  
- **4**: Ausreichend (sufficient) — passing  
- **5**: Mangelhaft (poor) — failing  
- **6**: Ungenügend (insufficient) — failing

---

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher  
- Ability to run Swing-based applications (standard on most desktop operating systems)

---

## How to Compile and Run

1. **Clone or download** the repository (or just the `NotenBestanden.java` file).  
2. **Open a terminal** (or command prompt) in the same folder.  
3. **Compile** the code:
   ```bash
   javac NotenBestanden.java
   ```
4. **Run** the compiled class:
   ```bash
   java NotenBestanden
   ```
5. **Interaction**:
   - A dialog will prompt you to enter a grade (`1–6`).
   - Another dialog will display whether you passed or failed, or if the input is invalid.

---

## Example Usage

1. **Input**: `3`  
   - **Output**: “bestanden”  

2. **Input**: `5`  
   - **Output**: “nicht bestanden”  

3. **Input**: `8`  
   - **Output**: “Deine eingabe ist falsch”

---

## Contributing

1. **Fork** this repository (if applicable).  
2. **Create** a new branch (e.g., `feature/change-grade-scale`).  
3. **Commit** your changes (e.g., adding different language support or additional error handling).  
4. **Open a Pull Request** describing your modifications.

---

## License

This project is distributed under the [MIT License](LICENSE). You are free to use, modify, and distribute it.

---

Happy Coding!
