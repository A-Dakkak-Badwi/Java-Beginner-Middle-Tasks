---

# ConvertTemperatur (Tag 01)

A simple Java program that uses **Swing** dialogs to convert a temperature from Fahrenheit to Celsius.

## How It Works

1. **User Prompt**  
   - The program displays a dialog box asking the user to input a temperature in Fahrenheit.
2. **Conversion**  
   - The input value (in Fahrenheit) is converted to Celsius using the formula:
     \[
     \text{Celsius} = \frac{5}{9} \times (\text{Fahrenheit} - 32)
     \]
3. **Result**  
   - A second dialog box displays the converted temperature in Celsius.

## Requirements

- **Java Development Kit (JDK)** 8 or higher  
- A system supporting Swing-based GUI applications (any typical desktop environment should suffice)

## How to Compile and Run

1. **Clone** or **download** this repository, then navigate to the folder containing `ConvertTemperatur.java`.
2. **Compile** the Java file:
   ```bash
   javac ConvertTemperatur.java
   ```
3. **Run** the compiled class:
   ```bash
   java ConvertTemperatur
   ```
4. **Interaction**:
   - A Swing dialog box appears, asking for a temperature in Fahrenheit (e.g., `98.6`).
   - After clicking **OK**, another dialog box shows the equivalent temperature in Celsius.

## Example

- **Input**: `98.6` (degrees Fahrenheit)  
- **Output Dialog**:  
  ```
  98.6 degree Fahrenheit is equal to 37.0 in Celsius
  ```

## Contributing

1. **Fork** the repository on GitHub.  
2. **Create** a new branch (e.g., `feature/add-other-units`).  
3. **Implement** your changes or additional features (for instance, conversion to Kelvin).  
4. **Open a Pull Request** explaining your changes.

## License

This project is provided under the [MIT License](LICENSE). Feel free to use, modify, and distribute it as needed.

---

Happy Coding!
