class Solution {
    public List<List<String>> solveNQueens(int n) {
         List<List<String>> res = new ArrayList<>();

        // Initialize the board with empty cells represented by '.'
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        // Arrays to keep track of attacks on rows and diagonals
        int[] leftRow = new int[n];
        int[] upDiagonal = new int[2 * n - 1];
        int[] lowDiagonal = new int[2 * n - 1];

        // Start solving the problem from the first column
        solve(0, board, res, leftRow, upDiagonal, lowDiagonal);

        return res;
    }

    private static void solve(int col, char[][] board, List<List<String>> res, int[] leftRow, int[] upDiagonal, int[] lowDiagonal) {
        // If all queens are placed, add the board to the result
        if (col == board.length) {
            res.add(construct(board));
            return;
        }

        // Try placing a queen in each row of the current column
        for (int row = 0; row < board.length; row++) {
            // Check if it's safe to place the queen
            if (leftRow[row] == 0 && lowDiagonal[row + col] == 0 && upDiagonal[board.length - 1 + col - row] == 0) {
                // Place the queen
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowDiagonal[row + col] = 1;
                upDiagonal[board.length - 1 + col - row] = 1;

                // Recur to place the rest of the queens
                solve(col + 1, board, res, leftRow, upDiagonal, lowDiagonal);

                // Backtrack and remove the queen
                board[row][col] = '.';
                leftRow[row] = 0;
                lowDiagonal[row + col] = 0;
                upDiagonal[board.length - 1 + col - row] = 0;
            }
        }
    }

    // Construct the board configuration to a list of strings
    private static List<String> construct(char[][] board) {
        List<String> res = new LinkedList<>();
        for (int i = 0; i < board.length; i++) {
            res.add(new String(board[i]));
        }
        return res;
    }
}