
---

# RectangleCalculation (Tag 01)

A simple Java program that uses **Swing** dialogs to:
1. Prompt the user for the rectangle’s length and width.  
2. Ask for a unit of measurement (e.g., “cm” or “m”).  
3. Calculate the rectangle’s perimeter and area.  

Finally, it displays the results in a dialog box.

## How It Works

1. **User Input**  
   - The program opens a series of input dialogs:
     - First dialog: asks for the rectangle’s **length** (integer).
     - Second dialog: asks for the rectangle’s **width** (integer).
     - Third dialog: asks for the **unit of measurement** (e.g., “cm” or “m”).

2. **Calculation**  
   - **Perimeter** (`Umfang` in the code) is calculated by:
     \[
     P = 2 \times \text{length} + 2 \times \text{width}
     \]
   - **Area** (`Fläche` in the code) is calculated by:
     \[
     A = \text{length} \times \text{width}
     \]

3. **Display Results**  
   - A final dialog box shows:
     - The input values for length and width (with their chosen unit)
     - The calculated perimeter
     - The calculated area

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher  
- A system that can run Swing-based GUI applications (most desktop environments support this)

## How to Compile and Run

1. **Clone or download** this repository, or at least the `RechteckBerechnung.java` file, onto your local system.  
2. **Open a terminal** (or command prompt) in the same directory as the Java file.  
3. **Compile** the program:
   ```bash
   javac RechteckBerechnung.java
   ```
4. **Run** the compiled class:
   ```bash
   java RechteckBerechnung
   ```
5. **Interaction**:
   - A dialog prompts you to enter the rectangle’s length (e.g., `10`).
   - A second dialog prompts you to enter the rectangle’s width (e.g., `5`).
   - A third dialog prompts you to enter the unit of measurement (e.g., `cm`).
   - A summary dialog shows you the calculated perimeter and area.

## Example

For example, if you enter:
- **Length**: `10`
- **Width**: `5`
- **Unit**: `cm`

The program calculates:
- **Perimeter**: \( 2 × 10 + 2 × 5 = 30 \)
- **Area**: \( 10 × 5 = 50 \)

Then it displays a dialog box with:
```
The entered length is: 10cm
The entered width is: 5cm

The perimeter is: 30cm
The area is: 50cm
```

## Contributing

1. **Fork** this repository (if applicable).  
2. **Create** a new branch (e.g., `feature/other-shapes`).  
3. **Implement** your changes (e.g., adding calculations for triangles or circles).  
4. **Open a Pull Request** and describe your modifications.

## License

This project is provided under the [MIT License](LICENSE). You are free to use, modify, and distribute it.

---

Happy Coding!
