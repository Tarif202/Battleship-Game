public class method2 {

    static char[][] board = {
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'S', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', 'S', 'S', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', 'S', 'S', 'S'}
    };

    public static int Q2_ValidBoard(char board[][]) {
        boolean sizeallgoodmyman = true;
        if (board == null) {
            sizeallgoodmyman = false;
            return -1;
        }

        if (board.length != 10) {
            sizeallgoodmyman = false;
            return -2;
        }

        for (int i = 0; i < 10; i++) {
            if (board[i].length != 10) {
                sizeallgoodmyman = false;
                return -2;
            }
        }

        boolean validSquare = false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                char box = board[i][j];
                if (!(box == 'S' || box == '*' || box == '.') && (sizeallgoodmyman == true)) {
                    return -3;
                } else {
                    validSquare = true;
                }
            }
        }

        if (validSquare == true) {
            return 1; // board is valid
        }
        return 91; // default value
    }

    public static void main(String[] args) {
        System.out.println(Q2_ValidBoard(board));
    }

}
