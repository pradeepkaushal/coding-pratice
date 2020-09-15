package practice.algorithm;

public class NQueenProblem {


    public static void main(String[] args) {
        NQueenProblem nQueenProblem = new NQueenProblem();

        nQueenProblem.totalNQueens(4);
    }

    public void print(int[][] board) {
        int length = board.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


    public int totalNQueens(int n) {
        int[][] board = new int[n][n];
        int[] count = new int[1];
        solve(0, board, count);
        return count[0];
    }

    public boolean isValid(int row, int column, int[][] board) {
        //Check horizontally in row
        for (int i = column; i >= 0; i--) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        for (int i = row, j = column; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        for (int i = row, j = column; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public boolean solve(int column, int[][] board, int[] count) {
        if (column == board.length) {
            count[0] += 1;
            return true;
        }
        boolean res = false;
        for (int rowToTry = 0; rowToTry < board.length; rowToTry++) {
            if (isValid(rowToTry, column, board)) {
                board[rowToTry][column] = 1;

                res = solve(column + 1, board, count) || res;

                board[rowToTry][column] = 0;
            }
        }
        return res;

    }

}
