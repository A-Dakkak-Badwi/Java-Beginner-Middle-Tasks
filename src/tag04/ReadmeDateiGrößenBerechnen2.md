---

# DateiGrößenBerechnenErweiterungBeenden (tag04)

An extension of the **DateiGrößenBerechnen** program that repeatedly prompts the user to input and sum file sizes, unless they choose to exit.

## Table of Contents

- [Overview](#overview)
- [How It Works](#how-it-works)
- [Prerequisites](#prerequisites)
- [Setup and Run Instructions](#setup-and-run-instructions)
- [Example Usage](#example-usage)
- [Contributing](#contributing)
- [License](#license)

---

## Overview

This program:
1. Calls the method `DateiGrößenBerechnen.dateiGrossenEingeben()` from the **DateiGrößenBerechnen** class to calculate the total size of multiple files in kilobytes (KB), megabytes (MB), and gigabytes (GB).  
2. After the calculation, it asks the user if they want to **repeat** the process:
   - If the user types `"ja"`, the method is called again.  
   - Otherwise (typing `"nein"` or clicking *Cancel*), the program stops and displays a shutdown message.

It relies on a custom `Tools` class for input/output operations, including:
- **`Tools.textEingeben(...)`** for user input.
- **`Tools.ausgeben(...)`** for displaying output.

---

## How It Works

1. **do-while Loop**  
   - The main method uses a `do-while` loop.  
   - Inside the loop, `DateiGrößenBerechnen.dateiGrossenEingeben()` is called to prompt for file sizes and calculate their total.  
   - The user is then asked if they wish to repeat (`"Möchtest du das Programm wiederholen? ja/ nein"`).

2. **Termination Condition**  
   - If `wiederholen` is `null` (i.e., user canceled) or **not** `"ja"`, the loop ends.  
   - A final message indicates that the program is terminating.

---

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher  
- The following classes/files should be present and correctly referenced in your project:
  - **`DateiGrößenBerechnen`** (from the previous code)  
  - **`Tools`** (custom class providing input/output methods)

---

## Setup and Run Instructions

1. **Ensure** you have:
   - `DateiGrößenBerechnenErweiterungBeenden.java`
   - `DateiGrößenBerechnen.java`
   - `Tools.java`
   in the correct directories according to their package structures (e.g., `tag04` for the first two, and maybe `util` or a similar package for `Tools`).

2. **Compile** the Java files. For example:
   ```bash
   javac tag04/DateiGrößenBerechnenErweiterungBeenden.java tag04/DateiGrößenBerechnen.java util/Tools.java
   ```
3. **Run** the extended program:
   ```bash
   java tag04.DateiGrößenBerechnenErweiterungBeenden
   ```
4. **Interaction**:
   - The program will prompt for the number of files and their sizes (in KB).
   - It will display the total size in KB, MB, and GB.
   - Finally, it asks if you want to repeat the process. Enter `"ja"` to continue, or `"nein"` (or cancel) to exit.

---

## Example Usage

1. **Prompt**: “Gib die Anzahl der Dateien ein:” → User enters `2`.
2. **File sizes**:
   - “Gib die Größe der Datei 0 in KB ein” → `2048`
   - “Gib die Größe der Datei 1 in KB ein” → `1024`
3. **Output** might look like:
   ```
   Die Gesamtgröße der Dateien beträgt :  
    3072.0KB 
    3.00 MB 
    0.00 GB 
   ```
4. **Repeat Prompt**:  
   “Möchtest du das Programm wiederholen? ja/ nein” → Enter `ja` to repeat, or `nein` to end.
5. **End of Program**:  
   If the user chooses `nein` or cancels, the program outputs:
   ```
   Das Programm wird beendet.
   ```

---

## Contributing

1. **Fork** this repository (if available).  
2. **Create** a new branch (e.g., `feature/add-error-handling`).  
3. **Commit** your improvements.  
4. **Open a Pull Request** describing your modifications.

---

## License

This project is provided under the [MIT License](LICENSE). You are free to use, modify, and distribute it.

---

Happy Coding!
