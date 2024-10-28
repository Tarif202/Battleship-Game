public class method4 {

    static char[][] board = {
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '.', '.'},
    };

    public static int Q4_Hit(char board[][], int row, char col) {
        int invalidColumn = -2;
        int invalidRow = -1;
        int rowIndex = row - 1;
        int columnIndex = col - 'A';
        int hit = 1;
        int miss = 2;
        int repeatedHit = 3;

        if (rowIndex < 0 || rowIndex > 9) {
            return invalidRow;
        }
        if (col < 'A' || col > 'J') {
            return invalidColumn;
        }

        char test = board[rowIndex][columnIndex];
        if (test == '.') {
            return miss;
        }

        if (test == 'S') {
            return hit;
        }

        if (test == '*') {
            return repeatedHit;
        }

        return 7; // Both row and column are valid
    }

    public static void main(String[] args) {
        System.out.println(Q4_Hit(board, 0, 'A'));
    }
}
