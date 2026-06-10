package Recursion;

public class NQueens {

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        int solutions = queens(board, 0);
        System.out.println("Total solutions: " + solutions);
    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false; // backtrack
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        // Check vertical
        for (int i = 0; i < row; i++) {
            if (board[i][col]) return false;
        }

        // Check left diagonal
        for (int i = 1; row - i >= 0 && col - i >= 0; i++) {
            if (board[row - i][col - i]) return false;
        }

        // Check right diagonal
        for (int i = 1; row - i >= 0 && col + i < board.length; i++) {
            if (board[row - i][col + i]) return false;
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean ele : row) {
                System.out.print(ele ? "Q " : ". ");
            }
            System.out.println();
        }
    }
}
