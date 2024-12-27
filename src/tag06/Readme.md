---

# Benutzerkonto mit Profil (User Account with Profile)

A Java program to manage user accounts and their associated profiles. The program allows the creation, activation, deactivation, and validation of user accounts, as well as associating user profiles containing personal information.

---

## Table of Contents

- [Overview](#overview)
- [How It Works](#how-it-works)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [How to Compile and Run](#how-to-compile-and-run)
- [Example Usage](#example-usage)
- [Contributing](#contributing)
- [License](#license)

---

## Overview

1. **Classes**:
   - **`Benutzerkonto` (User Account)**:
     - Represents a user account with properties such as username, email, and status (active/inactive).
     - Contains a reference to a `Profil` object.
   - **`Profil` (Profile)**:
     - Stores personal user information such as first name, last name, and date of birth.
2. **Test Classes**:
   - **`ProfilTest`** and **`Aufgabe1`**:
     - Demonstrate the functionality of creating, managing, and testing user accounts and profiles.

---

## How It Works

1. **Benutzerkonto**:
   - Attributes:
     - `benutzername`: The username.
     - `email`: The user's email address.
     - `aktiv`: A boolean indicating whether the account is active.
     - `profil`: A reference to a `Profil` object storing user details.
   - Methods:
     - `kontoAktivieren()`, `kontoDeaktivieren()`: Toggle account status.
     - `validiereBenutzernameUndEmail(String, String)`: Validates username and email.
     - `speichereProfil(Profil)`: Associates a profile with the account.
     - `zeigeStatus()`: Displays account details and profile information.

2. **Profil**:
   - Attributes:
     - `vorname`: First name.
     - `nachname`: Last name.
     - `geburtsdatum`: Date of birth.
   - Methods:
     - `zeigeProfil()`: Displays profile information.

3. **Testing**:
   - `ProfilTest` demonstrates creating an account, assigning a profile, and displaying the status.
   - `Aufgabe1` tests account activation, deactivation, and validation.

---

## Features

- **Encapsulation**:
  - Attributes like username, email, and profile are private to their classes.
- **Dynamic Account Management**:
  - Accounts can be activated or deactivated.
  - Email can be updated.
- **Profile Integration**:
  - Each account can store a user profile with personal details.
- **Validation**:
  - Verify account credentials through username and email.
- **Formatted Output**:
  - Custom methods display account and profile details in a user-friendly format.

---

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher.
- A **`Tools`** class in the project (for user input and output, if applicable).

---

## How to Compile and Run

1. **Ensure** you have:
   - `Benutzerkonto.java` (User Account class)
   - `Profil.java` (Profile class)
   - `ProfilTest.java` (Test class for profiles)
   - `Aufgabe1.java` (Test class for accounts)
   in the correct directories matching their package declarations.
2. **Compile** the Java files:
   ```bash
   javac tag06/Benutzerkonto.java tag06/Profil.java tag06/ProfilTest.java tag06/Aufgabe1.java
   ```
3. **Run** the test classes:
   ```bash
   java tag06.ProfilTest
   ```
   or
   ```bash
   java tag06.Aufgabe1
   ```

---

## Example Usage

1. **Creating a Profile and Account**:
   ```java
   Profil profil = new Profil("Ayse", "Yilmaz", "16.10.1960");
   Benutzerkonto konto = new Benutzerkonto("ayse123", "ayse@gmail.com");
   konto.speichereProfil(profil);
   konto.zeigeStatus();
   ```
   **Output**:
   ```
   Benutzerkonto **********
   Benutzername: ayse123
   Email: ayse@gmail.com
   Aktiv: Nein
   Profil **********
   Vorname: Ayse
   Nachname: Yilmaz
   Geburtsdatum: 16.10.1960
   ```

2. **Activating and Deactivating an Account**:
   ```java
   konto.kontoAktivieren();
   konto.zeigeStatus();
   konto.kontoDeaktivieren();
   konto.zeigeStatus();
   ```
   **Output**:
   ```
   Konto von ayse123 wurde aktiviert.
   ...
   Konto von ayse123 wurde deaktiviert.
   ```

3. **Validating Credentials**:
   ```java
   boolean isValid = konto.validiereBenutzernameUndEmail("ayse123", "ayse@gmail.com");
   System.out.println("Validation result: " + isValid);
   ```
   **Output**:
   ```
   Validation result: true
   ```

---

## Contributing

1. **Fork** this repository (if available).  
2. **Create** a new branch (e.g., `feature/add-validation-method`).  
3. **Commit** your changes.  
4. **Open a Pull Request** describing your improvements.

---

## License

This project is provided under the [MIT License](LICENSE). Feel free to use, modify, and distribute it.

---

Happy Coding!
