---

# Tools

A simple utility class providing methods to facilitate user input and output via **Swing** dialogs.

## Overview

The `Tools` class includes three static methods:

1. **`zahlEingeben(String nachricht)`**  
   - Displays an input dialog with a given message (`nachricht`) and returns an integer entered by the user.
   - If the user cancels or closes the dialog, the method returns `0`.

2. **`textEingeben(String nachricht)`**  
   - Displays an input dialog that expects a `String` response.
   - Returns `null` if the user cancels or closes the dialog.

3. **`ausgeben(String nachricht)`**  
   - Displays a message dialog with the given `nachricht`.

---

## How It Works

1. **`zahlEingeben(String nachricht)`**  
   - Internally calls `JOptionPane.showInputDialog(nachricht)` to prompt for user input.
   - Converts the returned `String` to an integer (`Integer.parseInt`).
   - If the returned string is `null` (user pressed Cancel or closed the dialog), the method defaults to `0`.

2. **`textEingeben(String nachricht)`**  
   - Uses `JOptionPane.showInputDialog(nachricht)` and directly returns the user’s input, or `null` if canceled.

3. **`ausgeben(String nachricht)`**  
   - Displays the `nachricht` in a `JOptionPane.showMessageDialog`.

---

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher  
- A GUI environment that supports **Swing** (any typical desktop OS).

---

## How to Use

1. **Include** this file (`Tools.java`) in your project.  
2. **Import** it in your classes where you need it. For example:
   ```java
   import util.Tools;

   public class MyClass {
       public static void main(String[] args) {
           int number = Tools.zahlEingeben("Enter a number:");
           Tools.ausgeben("You entered: " + number);
       }
   }
   ```
3. **Compile** and run as usual:
   ```bash
   javac Tools.java
   javac MyClass.java
   java MyClass
   ```

---

## Example

Here’s a minimal example showing how to use all three methods:

```java
public class ExampleUsage {
    public static void main(String[] args) {
        int age = Tools.zahlEingeben("How old are you?");
        String name = Tools.textEingeben("What is your name?");
        
        String message = "Hello, " + name + "! You are " + age + " years old.";
        Tools.ausgeben(message);
    }
}
```

When you run `ExampleUsage`, you’ll see dialogs asking for your age and name, then a message dialog summarizing your inputs.

---

## Contributing

1. **Fork** the repository (if applicable).  
2. **Create** a branch for your updates (e.g., `feature/error-handling`).  
3. **Commit** and **push** your changes.  
4. **Open a Pull Request** with a description of your improvements.

---

## License

This utility class is provided under the [MIT License](LICENSE). You can freely use and modify it in your own projects.

---

Happy Coding!
