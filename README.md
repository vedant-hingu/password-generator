#  Java Password Generator

A simple console-based Java program that allows users to generate different types of passwords based on various criteria. This tool is designed to be user-friendly and interactive, offering multiple options for personalized or randomly generated secure passwords.

---

##  Features

1. **Random Password (Custom Length)**
   - Includes uppercase letters, lowercase letters, numbers, and symbols.
   - User-defined password length.

2. **Name + Birth Year Password**
   - Uses the user's name (converted to uppercase) and birth year.
   - Format: `NAME_YEAR`

3. **4-Digit Random Number**
   - Generates a 4-digit numeric password.
   - Leading zeros are preserved.

4. **6-Digit Random Number**
   - Generates a 6-digit numeric password.
   - Leading zeros are preserved.

5. **Surname + Birth Date Password**
   - Combines the user's surname and full birthdate.
   - Format: `SURNAME_DDMMYYYY`

6. **Exit Option**
   - Allows the user to safely exit the password generator.

---

##  How It Works

1. When the program starts, a welcome message is displayed.
2. The user is prompted to choose from the available password generation options.
3. Based on the input:
   - The program asks for any required information (e.g., name, year, birthdate).
   - A password is generated accordingly and displayed with formatting.
4. The process repeats until the user selects the **Exit** option.

---

##  Use Case Examples

| Option | Input Example | Generated Password |
|--------|----------------|--------------------|
| 1. Random | Length: 8     | `@r5A*fL9`         |
| 2. Name+Year | Name: Alice, Year: 2001 | `ALICE_2001` |
| 3. Random 4-digit | _N/A_ | `0743` |
| 4. Random 6-digit | _N/A_ | `983251` |
| 5. Surname+Date | Surname: Khan, DOB: 01012000 | `KHAN_01012000` |

---

##  Requirements

- Java JDK 8 or above
- Terminal/IDE to run the compiled `.java` file

---

##  How to Run

1. Compile the Java file:
   ```bash
   javac <file_name>.java
    ```
2. Run the java file
   ```bash
   java main
   ```
