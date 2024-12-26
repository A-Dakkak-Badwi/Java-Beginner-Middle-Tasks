---

# DateiGrößenBerechnen (tag04)

A simple Java program that calculates the total size of multiple files in KB, MB, and GB. It leverages methods from a custom `Tools` utility class to gather user input and display results.

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

1. **User Prompt**: The program asks how many files (e.g., `anzahl`) you want to process.  
2. **File Sizes**: For each file, you input its size in **kilobytes (KB)**.  
3. **Summation**: The program sums all file sizes to compute a total in **KB**.  
4. **Conversions**:  
   - **KB to MB**: `megabyte = gesamtgrosse / 1024.0`  
   - **MB to GB**: `gigabyte = megabyte / 1024.0`
5. **Results**: Finally, it displays the total file size in **KB**, **MB**, and **GB**.

---

## How It Works

- **Tools.zahlEingeben(String prompt)**:  
  A custom method likely used to prompt the user for a numeric input (integer or double).  
- **Tools.ausgeben(String message)**:  
  A custom method to display or print a message to the user.

### Program Flow
1. **dateiGrossenEingeben()**:  
   - Prompts for the number of files (`anzahl`).  
   - Loops over the user’s inputs, summing file sizes in KB.  
   - Converts the total to MB and GB.  
   - Displays the results.

2. **Main Method**:  
   - Simply calls `dateiGrossenEingeben()` to initiate the process.

---

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher
- The **`Tools`** class must be accessible in your project (and presumably contains methods to read user input and output messages).  
- A terminal or IDE that allows running Java applications.

---

## How to Compile and Run

1. **Ensure** you have both `DateiGrößenBerechnen.java` and the custom `Tools` utility (e.g., `Tools.java`) in the same project or folder structure, maintaining correct package references.  
2. **Compile** the code:
   ```bash
   javac tag04/DateiGrößenBerechnen.java util/Tools.java
   ```
   (Adjust the paths or package statements as needed for your folder structure.)
3. **Run** the compiled class:
   ```bash
   java tag04.DateiGrößenBerechnen
   ```
4. **Interaction**:
   - The program prompts you for the **number of files**.
   - For each file, it asks for the file size in **KB**.
   - Displays a final summary with the total size in **KB**, **MB**, and **GB**.

---

## Example Usage

1. **Prompt**: “Gib die Anzahl der Dateien ein:”  
   - User enters `3`.
2. **File sizes**:  
   - “Gib die Größe der Datei 0 in KB ein” → `1024`  
   - “Gib die Größe der Datei 1 in KB ein” → `512`  
   - “Gib die Größe der Datei 2 in KB ein” → `2048`
3. **Calculation**:  
   - Total in KB: `1024 + 512 + 2048 = 3584 KB`  
   - Total in MB: `3584 / 1024 ≈ 3.50 MB`  
   - Total in GB: `3.50 / 1024 ≈ 0.00 GB` (since 3.50 MB is still much less than 1 GB)
4. **Output** (example):  
   ```
   Die Gesamtgröße der Dateien beträgt :  
    3584.0KB 
    3.50 MB 
    0.00 GB 
   ```

---

## Contributing

1. **Fork** this repository (if available).  
2. **Create** a new branch for your changes (e.g., `feature/handle-file-sizes-in-bytes`).  
3. **Commit** your adjustments (e.g., adding validations, handling fractional KB inputs, etc.).  
4. **Open a Pull Request** explaining your modifications.

---

## License

This project is distributed under the [MIT License](LICENSE). You’re free to use, modify, and share it.

---

Happy Coding!
