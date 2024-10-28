import java.util.StringTokenizer;

public class method5 {

    static char[][] board = {
            {'*', '*', '*', '*', '*', '.', 'S', '*', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '*', '*'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '*', '*', '.', '.', '.', '.', 'S', 'S', 'S'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'S', '*', '.', 'S', 'S', 'S', '.', '.', '.', '.'},
            {'.', '.', '.', '.', 'S', '.', '.', '.', 'S', 'S'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'S', '*', 'S', '.', '.', '.', 'S', 'S', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '*', '*'}
    };

    public static int Q5_CountShips(char board[][], String shiptype, String damagetype) {
        int id1count = 0;
        int id2count = 0;
        int id3count = 0;
        int id4count = 0;
        int hassomething = 0;
        int empty = -3;
        String token2;

        if (!(shiptype.equals("1") || shiptype.equals("2") || shiptype.equals("3") || shiptype.equals("4") ||
              shiptype.equals("Carrier") || shiptype.equals("Battleship") || shiptype.equals("Cruiser") || 
              shiptype.equals("Destroyer"))) {
            return -1;  // invalid shiptype
        } else if (!(damagetype.equals("ALL") || damagetype.equals("Damaged") || damagetype.equals("Undamaged") || 
                     damagetype.equals("Sunk"))) {
            return -2;  // invalid damagetype
        }

        for (int i = 0; i < 10; i++) {
            String row = new String(board[i]);
            StringTokenizer tokenizer9 = new StringTokenizer(row);
            while (tokenizer9.hasMoreTokens()) {
                token2 = tokenizer9.nextToken();
                if (!token2.isEmpty() && !token2.contains("S") && !token2.contains("*") && token2.contains(".")) {
                    hassomething++;
                }
            }
        }

        if (damagetype.equals("Undamaged")) {
            for (int i = 0; i < 10; i++) {
                String row = new String(board[i]);
                StringTokenizer tokenizer = new StringTokenizer(row, ".");
                while (tokenizer.hasMoreTokens()) {
                    String token = tokenizer.nextToken();
                    if (token.equals("SS") && (shiptype.equals("4") || shiptype.equals("Destroyer"))) {
                        id4count++;
                    } else if (token.equals("SSS") && (shiptype.equals("3") || shiptype.equals("Cruiser"))) {
                        id3count++;
                    } else if (token.equals("SSSS") && (shiptype.equals("2") || shiptype.equals("Battleship"))) {
                        id2count++;
                    } else if (token.equals("SSSSS") && (shiptype.equals("1") || shiptype.equals("Carrier"))) {
                        id1count++;
                    }
                }
            }
        }

        if (damagetype.equals("Sunk")) {
            for (int i = 0; i < 10; i++) {
                String row = new String(board[i]);
                StringTokenizer tokenizer2 = new StringTokenizer(row, ".");
                while (tokenizer2.hasMoreTokens()) {
                    String token = tokenizer2.nextToken();
                    if (token.equals("**") && (shiptype.equals("4") || shiptype.equals("Destroyer"))) {
                        id4count++;
                    } else if (token.equals("***") && (shiptype.equals("3") || shiptype.equals("Cruiser"))) {
                        id3count++;
                    } else if (token.equals("****") && (shiptype.equals("2") || shiptype.equals("Battleship"))) {
                        id2count++;
                    } else if (token.equals("*****") && (shiptype.equals("1") || shiptype.equals("Carrier"))) {
                        id1count++;
                    }
                }
            }
        }

        if (damagetype.equals("Damaged")) {
            for (int i = 0; i < 10; i++) {
                String row = new String(board[i]);
                StringTokenizer tokenizer3 = new StringTokenizer(row, ".");
                while (tokenizer3.hasMoreTokens()) {
                    String token = tokenizer3.nextToken();
                    if (token.contains("S") && token.contains("*") && token.length() == 2 && 
                        (shiptype.equals("4") || shiptype.equals("Destroyer"))) {
                        id4count++;
                    } else if (token.contains("S") && token.contains("*") && token.length() == 3 && 
                               (shiptype.equals("3") || shiptype.equals("Cruiser"))) {
                        id3count++;
                    } else if (token.contains("S") && token.contains("*") && token.length() == 4 && 
                               (shiptype.equals("2") || shiptype.equals("Battleship"))) {
                        id2count++;
                    } else if (token.contains("S") && token.contains("*") && token.length() == 5 && 
                               (shiptype.equals("1") || shiptype.equals("Carrier"))) {
                        id1count++;
                    }
                }
            }
        }

        if (damagetype.equals("ALL")) {
            for (int i = 0; i < 10; i++) {
                String row = new String(board[i]);
                StringTokenizer tokenizer4 = new StringTokenizer(row, ".");
                while (tokenizer4.hasMoreTokens()) {
                    String token = tokenizer4.nextToken();
                    if (token.length() == 2 && (shiptype.equals("4") || shiptype.equals("Destroyer"))) {
                        id4count++;
                    } else if (token.length() == 3 && (shiptype.equals("3") || shiptype.equals("Cruiser"))) {
                        id3count++;
                    } else if (token.length() == 4 && (shiptype.equals("2") || shiptype.equals("Battleship"))) {
                        id2count++;
                    } else if (token.length() == 5 && (shiptype.equals("1") || shiptype.equals("Carrier"))) {
                        id1count++;
                    }
                }
            }
        }

        if (hassomething == 10) {
            return empty;
        }

        if (shiptype.equals("4") || shiptype.equals("Destroyer")) {
            return id4count;
        } else if (shiptype.equals("3") || shiptype.equals("Cruiser")) {
            return id3count;
        } else if (shiptype.equals("2") || shiptype.equals("Battleship")) {
            return id2count;
        } else if (shiptype.equals("1") || shiptype.equals("Carrier")) {
            return id1count;
        }

        return 10; // valid board with nothing in it
    }

    public static void main(String[] args) {
        System.out.println(Q5_CountShips(board, "Destroyer", "Sunk"));
    }
}
