Battleship Board Game Implementation
                  
Overview:

This project involves the implementation of a Battleship board game in Java. The game board is represented as a 10x10 character array, with specific rules and constraints for ship placement, damage tracking, and board validation.
Board Representation
•	Size: 10 rows by 10 columns.
•	Indices: Rows range from 1 to 10, and columns range from 'A' to 'J'.
•	Java Array Mapping: Position "1A" corresponds to (0,0) in the Java array.

Board Characters
•	. : Open water
•	S : Part of an undamaged ship
•	* : Part of a damaged ship

Ship Status
•	Undamaged Ship: Consists entirely of 'S' characters.
•	Damaged Ship: Contains a mix of 'S' and '*' characters.
•	Sunk Ship: Consists entirely of '*' characters.

Ship Placement Rules
•	Ships are positioned horizontally.
•	Ships are not adjacent to each other horizontally.
Valid ship types and sizes are defined as follows:
