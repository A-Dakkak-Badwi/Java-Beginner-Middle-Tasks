
---

# Alterskategorie (tag03)

A simple Java program that classifies a user’s age into one of four categories:  
1. **Child** (Kind): Ages 0–12  
2. **Teenager** (Teenager): Ages 13–19  
3. **Adult** (Erwachsener): Ages 20–64  
4. **Senior** (Senior): Ages 65 and older  

## How It Works

1. **User Input**  
   - The program uses a **Swing** dialog to prompt the user for an integer age.

2. **Classification**  
   - An `if-else` structure checks the user’s age against the defined ranges:
     - **0–12** => Child (Kind)  
     - **13–19** => Teenager  
     - **20–64** => Adult (Erwachsener)  
     - **65+** => Senior
   - The program then displays the result in a final dialog.

3. **Output**  
   - Shows a message such as “You are a Teenager” (in German: “Du bist ein Teenager”) depending on the age input.

> **Note**: If you notice any discrepancies in categorization logic, you can adjust the `if-else` blocks accordingly to match the intended age ranges.

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher  
- A system capable of running Swing-based GUI applications.

## How to Compile and Run

1. **Clone or download** the file `Alterskategorie.java` into a local folder.
2. **Open a terminal** (or command prompt) in that folder.
3. **Compile** the program:
   ```bash
   javac Alterskategorie.java
   ```
4. **Run** the compiled class:
   ```bash
   java Alterskategorie
   ```
5. **Interaction**:
   - A dialog will appear requesting an integer age (e.g., `25`).
   - A second dialog will display the determined age category.

## Example

- **Input**: `17`  
  **Output**: “Du bist ein Teenager”

- **Input**: `70`  
  **Output**: “Du bist ein Senior” (if the conditions are adjusted correctly to reflect `>= 65` as Senior)

## Contributing

1. **Fork** this repository (if available).  
2. **Create a new branch** (e.g., `feature/age-logic-fix`).  
3. **Commit your changes** (e.g., refine the conditional logic or add new categories).  
4. **Open a Pull Request** describing your modifications.

## License

This project is provided under the [MIT License](LICENSE). You are free to use, modify, and distribute it.

---

Happy Coding!
