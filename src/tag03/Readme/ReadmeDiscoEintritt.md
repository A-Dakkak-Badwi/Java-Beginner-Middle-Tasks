---

# DiscoEintritt (tag03)

A simple Java program that uses **Swing** dialogs to decide whether a user can enter a disco (nightclub). It also checks for VIP status, Ladies’ Night discounts, and more.

## Table of Contents
- [Overview](#overview)
- [Logic Breakdown](#logic-breakdown)
- [Prerequisites](#prerequisites)
- [How to Compile and Run](#how-to-compile-and-run)
- [Example Workflow](#example-workflow)
- [Contributing](#contributing)
- [License](#license)

---

## Overview
This program:
1. Asks the user if they are **at least 18** years old.  
   - If **no** (under 18), they cannot enter the disco.  
   - If **yes** (18 or older), further checks are made:
2. Checks if the user is a **VIP**.
3. Checks if the user is **female** (since it’s Ladies’ Night).  
4. Displays different messages based on these inputs—such as VIP access, Ladies’ Night discounts, or normal admission offers.

All dialog messages are currently in German to reflect the local context (e.g., “Ja/Nein” prompts, “Du kommst nicht rein,” etc.). You can adapt the text to another language if needed.

---

## Logic Breakdown

1. **Age Check**  
   - **Prompt**: “Bist du mindestens 18? Ja / Nein”  
   - **Under 18**: The user is denied entry (`"Du kommst nicht rein"`).  
   - **18 or older**: Proceed to next checks.

2. **VIP Check**  
   - **Prompt**: “Sind Sie ein VIP? Ja / Nein”  
   - If **yes**, user gets a VIP welcome message.

3. **Gender Check (Ladies’ Night)**  
   - **Prompt**: “Sind Sie eine Frau? Ja / Nein”  
   - If **yes**, user gets a message about Ladies’ Night and a potential discount.

4. **Final Output**  
   - If the user is 18+, VIP, and female, they get special messages about VIP access and a 15% discount on drinks.  
   - Otherwise, if the user is 18+ but not VIP or not female, they get normal offers.  
   - The program closes with a welcome or refusal message.

---

## Prerequisites
- **Java Development Kit (JDK)** 8 or higher  
- Ability to run Swing-based GUI applications (common on most desktop environments).

---

## How to Compile and Run
1. **Clone or download** this repository (or just the `DiscoEintritt.java` file).
2. **Open a terminal** (or command prompt) in the same folder.
3. **Compile** the Java file:
   ```bash
   javac DiscoEintritt.java
   ```
4. **Run** the compiled class:
   ```bash
   java DiscoEintritt
   ```
5. **User Interaction**:
   - The program will ask:
     1. “Bist du mindestens 18? Ja / Nein”  
     2. If “Ja,” then “Sind Sie ein VIP? Ja / Nein”  
     3. Then “Sind Sie eine Frau? Ja / Nein”  
   - The final dialogs display access rights and any discounts.

---

## Example Workflow
1. **User enters**: “Ja” for the 18+ prompt  
2. **User enters**: “Ja” for VIP status  
3. **User enters**: “Ja” for female  
4. **Program outputs**:
   - VIP welcome message  
   - Ladies’ Night discount message (15% off drinks)  
   - Overall greeting: “Herzlich wilkommen in der Disco! Viel Spaß in der Ladies Night ...” 

If the user selects “Nein” for being 18+, the program simply states they can’t enter.

---

## Contributing
1. **Fork** this repository (if available).  
2. **Create** a new branch (e.g., `feature/change-ladies-night-discount`).  
3. **Commit** your changes or improvements.  
4. **Open a Pull Request** explaining your modifications.

---

## License
This project is provided under the [MIT License](LICENSE). You are free to use, modify, and distribute it.

---

Happy Coding!
