package practice.algorithm;

public class Sudoku {

    public static void main(String[] args) {
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};


        Sudoku sudoku = new Sudoku();
        sudoku.solveSudoku(board);
        sudoku.print(board);


    }

    public void print(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isSafe(int row, int column, char val, char[][] board) {
        int length = board.length;
        //Check column
        for (int i = 0; i < length; i++) {
            if (board[i][column] == val) {
                return false;
            }
        }

        //Check row
        for (int i = 0; i < length; i++) {
            if (board[row][i] == val) {
                return false;
            }
        }

        int startRow = row - (row % (int) Math.sqrt(length));
        int startColumn = column - (column % (int) Math.sqrt(length));
        //Check box
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startColumn; j < startColumn + 3; j++) {
                if (board[i][j] == val) {
                    return false;
                }
            }
        }

        return true;
    }

    public void solveSudoku(char[][] board) {
        sudokuSolver(board);
    }


    public boolean sudokuSolver(char[][] board) {
        //Find the blank location
        int length = board.length;
        int row = -1;
        int column = -1;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (board[i][j] == '.') {
                    row = i;
                    column = j;
                }
            }
        }

        if (row == -1 && column == -1) {
            return true;
        }
        for (int val = 1; val <= length; val++) {

            if (isSafe(row, column, (char) (val + 48), board)) {

                board[row][column] = (char) (val + 48);


                if (sudokuSolver(board)) {
                    return true;
                }
                //BackTrack
                board[row][column] = '.';
            }
        }

        return false;
    }
}
