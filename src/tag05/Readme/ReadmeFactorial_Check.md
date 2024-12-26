---

# Factorial Check (tag05)

A Java program that verifies whether a user-entered number is a **factorial number** (e.g., 1, 2, 6, 24, 120, etc.).

## What Is a Factorial Number?

The **factorial** of a natural number \(n\) is defined as:
\[
n! = n \times (n - 1) \times (n - 2) \times \dots \times 2 \times 1
\]

Examples:
- \(1! = 1\)
- \(2! = 2\)
- \(3! = 6\)
- \(4! = 24\)
- \(5! = 120\)

A **factorial number** is any number that can be written as \(n!\) for some integer \(n\). For instance, 6, 24, and 120 are all factorial numbers because they are \(3!\), \(4!\), and \(5!\) respectively.

---

## How It Works

1. **Input**  
   - The program prompts the user for a positive integer (\(\geq 1\)).  
   - If the user enters a number less than 1, it displays an error message.

2. **Checking Algorithm**  
   - The program uses a loop that tries to repeatedly divide the input by increasing divisors (starting from 2).  
   - Each time the current value (stored in `zähler`) is evenly divisible by the divisor (`teiler`), it divides `zähler` by that divisor and increments the divisor by 1.  
   - At the end of the loop:
     - If `zähler` is **1**, it indicates the original number was successfully broken down into a product of consecutive integers—hence, it’s a factorial number.
     - If `zähler` remains above **1**, the original number is **not** a factorial number.

3. **Output**  
   - **Positive case**: “Der zahl eine fakultät zahl” (in English: “The number is a factorial number”).  
   - **Negative case**: “Der zahl ist keine fakultät zahl” (in English: “The number is not a factorial number”).  
   - **Invalid input**: If the number is `< 1`, it displays “Fakultätrn Sind immer >=1 ” (typo aside, it means “Factorials are always >= 1”).

---

## Requirements

- **Java Development Kit (JDK)** 8 or higher  
- A terminal or IDE to run this Java program.

---

## Compilation and Execution

1. **Download or create** the `Fakultät.java` file in your Java project.
2. **Compile** (in a terminal or IDE):
   ```bash
   javac Fakultät.java
   ```
3. **Run**:
   ```bash
   java Fakultät
   ```
4. **Interaction**:
   - When prompted, enter a positive integer (\(\geq 1\)).
   - The program will state whether the number is a factorial number or not.

---

## Example

- **Input**: `24`
- **Process**:  
  - `24 % 2 == 0` → divide by 2 → new value is 12 → increment divisor to 3  
  - `12 % 3 == 0` → divide by 3 → new value is 4 → increment divisor to 4  
  - `4 % 4 == 0` → divide by 4 → new value is 1 → increment divisor to 5  
  - Now `zähler` is 1, so the original number (24) is a factorial number (specifically, `4!`).
- **Output**: “Der zahl eine fakultät zahl” (i.e., “The number is a factorial number.”)

---

## Possible Improvements

- **Language & Output**: You might want to correct or refine the output strings (e.g., use English prompts and messages).  
- **Negative Inputs**: Currently, it prints an error for any input < 1. You could enhance it to request input again or handle invalid inputs differently.  
- **Performance**: Very large inputs could slow down the division loop. You might want to add a break condition if the product overshoots a certain range.

---

## License

This project is under the [MIT License](LICENSE). You are free to use, modify, and distribute it.

---

Happy Coding!
