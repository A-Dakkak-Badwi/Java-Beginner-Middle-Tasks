
---

# ASCIICalculator (Tag 01)

A simple Java program that demonstrates how to:
1. Prompt the user for input using **Swing** dialogs.
2. Convert characters to their corresponding **ASCII** values.
3. Calculate the sum of the ASCII values of two entered characters.

## How It Works

1. **First Input**:  
   - The program asks the user for a single character.
   - It converts that character into its ASCII value.
   - It displays the result in a dialog box.

2. **Second Input**:  
   - The program then asks for another single character.
   - It converts that character into its ASCII value as well.

3. **Sum of ASCII Values**:  
   - The program calculates the sum of the two ASCII values.
   - Finally, it displays the sum in a dialog box.

## Requirements

- **Java Development Kit (JDK)** 8 or higher
- A system capable of running Swing-based GUI applications (usually any typical desktop environment).

## How to Compile and Run

1. **Clone** or **download** this repository, then navigate to the folder containing `ASCIICalculator.java`.
2. **Compile** the Java file using the command:
   ```bash
   javac ASCIICalculator.java
   ```
3. **Run** the compiled class:
   ```bash
   java ASCIICalculator
   ```
4. **Interaction**:
   - A dialog box will appear asking you to input a single character.  
   - Enter a character (e.g., `A`) and press **OK**.  
   - You’ll then see another dialog to input a second character.  
   - After you enter the second character (e.g., `b`), you’ll see the sum of their ASCII values in a final dialog box.

## Example

Suppose the user inputs:
- First character: `A` (ASCII value **65**)
- Second character: `b` (ASCII value **98**)

The program will show:
- **First message**:  
  `Der ASCII-Wert von A ist 65`
- **Second message** (sum):  
  `Die summe der ASCII-wert von A und b ist: 163`

## Contributing

1. **Fork** the project on GitHub.
2. **Create a new branch** (e.g., `feature/improvements`).
3. **Implement** your changes or improvements.
4. **Submit a Pull Request** explaining your modifications.

## License

This project is provided under the [MIT License](LICENSE). Feel free to use, modify, and distribute it.

---

Happy Coding!
