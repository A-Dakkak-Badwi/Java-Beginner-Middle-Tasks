---

# Tools

A simple Java utility class providing methods for user input and output via **Swing** dialogs. It supports integer and floating-point (double) inputs, as well as text prompts.

## Table of Contents

1. [Overview](#overview)  
2. [Methods](#methods)  
   - [1. `zahlEingeben(String nachricht)`](#1-zahleingebenstring-nachricht)  
   - [2. `kommazahlEingeben(String nachricht)`](#2-kommazahleingebenstring-nachricht)  
   - [3. `zahlEingeben(String nachricht, Function<String, Number> parseFunktion)`](#3-zahleingebenstring-nachricht-functionstring-number-parsefunktion)  
   - [4. `textEingeben(String nachricht)`](#4-texteingebenstring-nachricht)  
   - [5. `ausgeben(String nachricht)`](#5-ausgebenstring-nachricht)  
3. [How to Use](#how-to-use)  
4. [Example](#example)  
5. [Error Handling](#error-handling)  
6. [Contributing](#contributing)  
7. [License](#license)

---

## Overview

The `Tools` class offers a set of static methods to:

- Prompt the user for numerical or textual input.
- Perform basic validation (e.g., ensuring valid integers/doubles).
- Display messages in pop-up dialogs.
- Convert local numeric formats (e.g., comma for decimals) to a standard dot-based (`.`) format before parsing.

All interaction happens via the Java **Swing** library (`JOptionPane`).

---

## Methods

### 1. `zahlEingeben(String nachricht)`
```java
public static int zahlEingeben(String nachricht)
```
- **Purpose**: Prompt the user for an integer (`int`) value.
- **Behavior**:  
  - Displays a dialog box with the message `nachricht`.  
  - Repeats if the user inputs a non-integer or clicks “OK” without a valid integer.
  - If the user clicks “Cancel”, the program shows “Das Programm wird beendet.” and calls `System.exit(0)`.

### 2. `kommazahlEingeben(String nachricht)`
```java
public static double kommazahlEingeben(String nachricht)
```
- **Purpose**: Prompt the user for a floating-point (`double`) value.
- **Behavior**:  
  - Similar to `zahlEingeben(String)`, but parses the input as a double instead of an int.
  - Accepts both dot (`.`) and comma (`,”) decimal separators, converting commas to dots.

### 3. `zahlEingeben(String nachricht, Function<String, Number> parseFunktion)`
```java
public static Number zahlEingeben(String nachricht, Function<String, Number> parseFunktion)
```
- **Purpose**: A more generalized version for reading numbers, allowing a custom parse function.
- **Behavior**:  
  - Takes a `String` prompt and a function (`String -> Number`), for example `Integer::parseInt` or `Double::parseDouble`.
  - Repeats the input dialog until the user enters a valid number (or cancels).
  - If the user cancels, the program exits.

### 4. `textEingeben(String nachricht)`
```java
public static String textEingeben(String nachricht)
```
- **Purpose**: Prompt the user for a `String` input (text).
- **Behavior**:  
  - Displays a dialog with the `nachricht`.  
  - Returns the user’s input, or an empty string (`""`) if the user clicks “Cancel” or provides a blank input.

### 5. `ausgeben(String nachricht)`
```java
public static void ausgeben(String nachricht)
```
- **Purpose**: Display a message dialog with the given `nachricht`.
- **Behavior**:  
  - Uses `JOptionPane.showMessageDialog(null, nachricht);` to show a simple pop-up.

---

## How to Use

1. **Include** `Tools.java` in your project under the correct package (`util` by default).
2. **Import** the class in any file where you need input/output, for example:
   ```java
   import util.Tools;

   public class MyClass {
       public static void main(String[] args) {
           int number = Tools.zahlEingeben("Enter an integer:");
           Tools.ausgeben("You entered: " + number);
       }
   }
   ```
3. **Compile and Run** your Java program as usual:
   ```bash
   javac util/Tools.java MyClass.java
   java MyClass
   ```

---

## Example

```java
import util.Tools;

public class ExampleUsage {
    public static void main(String[] args) {
        // Prompt for an integer
        int age = Tools.zahlEingeben("Please enter your age:");

        // Prompt for a floating-point number
        double price = Tools.kommazahlEingeben("Please enter the price:");

        // Prompt for text
        String name = Tools.textEingeben("What is your name?");

        // Display final message
        String message = "Hello, " + name + "! You are " + age + " years old, and you have " + price + " dollars.";
        Tools.ausgeben(message);
    }
}
```

1. If the user cancels any numeric input dialog, the program ends with a message:  
   **“Das Programm wird beendet.”**  
2. If the user enters something like “12,5” for the price, the class automatically converts it to `12.5`.

---

## Error Handling

- **Invalid Number**: If the user inputs an invalid number (e.g., letters instead of digits), the `zahlEingeben` or `kommazahlEingeben` method will show the prompt again, appending an error message.
- **Cancel Button**: Clicking “Cancel” in any numeric input dialog triggers a graceful exit by calling `System.exit(0)` with a final message.
- **Text Input**: For `textEingeben`, if the user cancels or leaves the input blank, it returns an empty string (`""`). You can decide how to handle that in your application logic.

---

## Contributing

1. **Fork** this repository (if available).  
2. **Create** a branch for your changes (e.g., `feature/add-new-method`).  
3. **Commit** your changes (e.g., improved validation, additional features).  
4. **Open a Pull Request** describing your modifications.

---

## License

This project is provided under the [MIT License](LICENSE). You’re free to use, modify, and distribute it.

---

Happy Coding!
