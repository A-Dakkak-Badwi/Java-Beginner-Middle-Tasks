---

# Zahlenreihenfolge (tag05)

A small Java program that asks the user for three integers and displays them in ascending order. Originally intended as an exercise for logical comparisons and `if-else` structures without using advanced data structures—though this code also demonstrates sorting with Java’s built-in `List`.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Implementation Approaches](#implementation-approaches)
  - [1. If-Else Sorting](#1-if-else-sorting)
  - [2. List Sorting with `Arrays.asList`](#2-list-sorting-with-arraysaslist)
- [Prerequisites](#prerequisites)
- [How to Compile and Run](#how-to-compile-and-run)
- [Example Usage](#example-usage)
- [Contributing](#contributing)
- [License](#license)

---

## Overview

1. **User Prompt**:  
   - The program asks the user to input three integers via the `Tools.zahlEingeben` method.
2. **Sorting**:  
   - By default, the code uses a `List<Integer>` and `zahlen.sort(Comparator.naturalOrder())` to sort the numbers in ascending order.
   - There is also an optional method `sortierungMitIfElse`, which demonstrates how to sort three numbers via plain `if-else` statements (uncomment the call to use it).
3. **Output**:  
   - The three numbers are then displayed in ascending order.

---

## Features

- **Basic Input**: Uses a `Tools` utility class to handle numeric input.  
- **Two Sorting Approaches**:
  1. **If-Else** statements (no arrays/lists).
  2. **List Sorting** with Java’s built-in sort methods.
- **User-Friendly Output**: Displays the final sorted numbers in a dialog (via `Tools.ausgeben`).

---

## Implementation Approaches

### 1. If-Else Sorting

```java
private static void sortierungMitIfElse(int zahl1, int zahl2, int zahl3) {
    // ...
}
```
- Compares each of the three numbers in multiple `if-else` blocks.
- Identifies the smallest, middle, and largest values, then prints them in ascending order.
- This demonstrates basic conditional logic without using arrays or collections.

### 2. List Sorting with `Arrays.asList`

```java
List<Integer> zahlen = Arrays.asList(zahl1, zahl2, zahl3);
zahlen.sort(Comparator.naturalOrder());
Tools.ausgeben("Die Zahlen in aufsteigender Reihenfolge:\n" + zahlen);
```
- Converts the three integers into a `List<Integer>`.
- Uses the built-in `sort` method with a `Comparator.naturalOrder()` to sort the list.
- Displays the sorted list in one step.

---

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher  
- A utility class `Tools` (with methods `zahlEingeben`, `textEingeben`, and `ausgeben`), which must be in the project.

---

## How to Compile and Run

1. **Ensure** you have:
   - `Zahlenreihenfolge.java`
   - `Tools.java` (the utility class)
   in the correct directory structure matching their package declarations (e.g., `tag05.Zahlenreihenfolge` and `util.Tools`).
2. **Open** a terminal or command prompt in your source directory.
3. **Compile**:
   ```bash
   javac tag05/Zahlenreihenfolge.java util/Tools.java
   ```
   (Adjust paths as needed for your project layout.)
4. **Run**:
   ```bash
   java tag05.Zahlenreihenfolge
   ```
5. **User Interaction**:
   - The program prompts for three integers.
   - Outputs them in ascending order.

#### Using the If-Else Method
- Open `Zahlenreihenfolge.java`.
- In `main`, comment out the `List` sorting section and **uncomment** the call to `sortierungMitIfElse`:
  ```java
  // sortierungMitIfElse(zahl1, zahl2, zahl3);
  ```
  becomes
  ```java
  sortierungMitIfElse(zahl1, zahl2, zahl3);
  ```
- Recompile and rerun.

---

## Example Usage

1. **Prompts**:
   - “Bitte Geben Sie Die erste Zahl ein” → Enter `40`
   - “Bitte Geben Sie Die zweite Zahl ein” → Enter `10`
   - “Bitte Geben Sie Die dritte Zahl ein” → Enter `25`
2. **Result**:  
   - The program displays `10, 25, 40` in ascending order (the exact output depends on which sorting approach is used).

---

## Contributing

1. **Fork** this repository (if available).  
2. **Create** a new branch (e.g., `feature/expand-sorting`).
3. **Commit** your changes (e.g., error handling for non-integer inputs).
4. **Open a Pull Request** describing your modifications.

---

## License

This project is provided under the [MIT License](LICENSE). You are free to use, modify, and share it.

---

Happy Coding!
