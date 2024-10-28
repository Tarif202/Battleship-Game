**Battleship Game Utility Methods - Java Coursework (CS1702 Introductory Programming):**

This repository contains a series of Java utility methods developed as part of an academic assessment for the CS1702 Introductory Programming module. The task focused on implementing key components of the classic game Battleships that could support a complete game application. These methods were designed to handle critical board operations and ship management within a 10x10 grid format, adhering to the game’s classic rules and unique constraints.

**Project Overview:**

The project provides methods that allow for:

•	Board Validation: Ensuring that the board is correctly formatted and contains only valid characters (e.g., '.', 'S', '*').
•	Ship Tracking: Counting, checking, and verifying the status of various ship types on the board (undamaged, damaged, or sunk).
•	Attack Handling: Processing attack coordinates and returning results such as "hit", "miss", or "repeat hit" based on game rules.
•	Dynamic Ship Counting: Counting ships based on type, damage level, and other parameters.
Each method is rigorously tested and validated to handle edge cases, including incorrect board size, invalid characters, and unexpected input parameters.

**Key Features:**
1.	Valid Board Square: Verifies if a given character represents a valid square on the board.
2.	Valid Board: Validates the board’s size, presence of only accepted characters, and structural integrity.
3.	Number of Sunk Ships: Counts and returns the number of ships that have been completely destroyed.
4.	Hit Detection: Identifies the result of an attack on the board at specified coordinates, including checks for invalid rows and columns.
5.	Ship Count Based on Status: Returns the number of ships by type and damage status (e.g., undamaged, damaged, sunk, or all).
These functions contribute to a robust framework that would support the core mechanics of a Battleship game while enforcing clear game rules.

**Structure:**

Each method is designed as a public static method, allowing for straightforward testing and integration into a larger Battleship game framework. Parameters, return types, and error handling are implemented according to the course requirements, enabling rigorous testing for null inputs, incorrect sizes, and invalid characters.

**Usage:**

Each function operates independently, making it possible to use the individual methods as needed. Integration into a full game environment would involve creating a main game loop and managing the game state across two players’ boards.

**About:**

This project was developed as part of an assessment for CS1702 Introductory Programming, earning an A* grade. The solution has been thoroughly tested against various edge cases and validated through automated testing frameworks to ensure consistency and accuracy


