
---

# KB2MB2B (tag03)

A simple Java program that converts a given size in **kilobytes (KB)** to:
1. **Megabytes (MB)**  
2. **Bytes (B)**  

It uses **Swing** dialogs to gather user input and display the results.

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
   - A dialog asks the user for a file size in **KB** (must be a positive number).

2. **Conversion**  
   - **Kilobytes to Megabytes**:
     \[
     \text{MB} = \frac{\text{KB}}{1024}
     \]
   - **Kilobytes to Bytes**:
     \[
     \text{B} = \text{KB} \times 1024
     \]

3. **Validation**  
   - If the user enters `0` or a negative number, the program prompts them again until a positive number is provided.

4. **Result Display**  
   - A final dialog displays the converted size in both MB and bytes, formatted to two decimal places.

---

## Prerequisites
- **Java Development Kit (JDK)** 8 or higher  
- Ability to run Swing-based GUI applications.

---

## How to Compile and Run
1. **Clone or download** this repository (or just the `KB2MB2B.java` file).
2. **Open a terminal** (or command prompt) in the same folder.
3. **Compile** the code:
   ```bash
   javac KB2MB2B.java
   ```
4. **Run** the compiled class:
   ```bash
   java KB2MB2B
   ```
5. **Interaction**:
   - A dialog appears, prompting for a size in KB (e.g., `1024`).
   - If the input is `<= 0`, you’ll be prompted again.
   - A final dialog displays the size in MB and bytes.

---

## Example Usage

1. **User inputs**: `1024` KB  
2. **Calculation**:
   - `MB = 1024 / 1024 = 1.00 MB`  
   - `Bytes = 1024 * 1024 = 1048576.00 Bytes`
3. **Output dialog**:
   ```
   1024.0 KB entsprechen 1.00 MB und 1048576.00 Bytes
   ```

---

## Contributing
1. **Fork** this repository (if applicable).  
2. **Create** a new branch (e.g., `feature/add-other-units`).  
3. **Commit** your changes (such as additional unit conversions or UI refinements).  
4. **Open a Pull Request** describing your modifications.

---

## License
This project is provided under the [MIT License](LICENSE). You’re free to use, modify, and distribute it.

---

Happy Coding!
