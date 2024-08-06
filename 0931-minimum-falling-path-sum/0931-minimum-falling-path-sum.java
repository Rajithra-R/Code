class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int dp[][] = new int[n][n];
        
        // Initialize the first row of dp array
        for (int i = 0; i < n; i++) {
            dp[0][i] = matrix[0][i];
        }
        
        // Fill the dp array
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int ld = matrix[i][j] + dp[i-1][j]; // Same column from previous row
                
                if (j - 1 >= 0) {
                    ld = Math.min(ld, matrix[i][j] + dp[i-1][j-1]); // Left diagonal from previous row
                }
                
                if (j + 1 < n) {
                    ld = Math.min(ld, matrix[i][j] + dp[i-1][j+1]); // Right diagonal from previous row
                }
                
                dp[i][j] = ld;
            }
        }
        
        // Find the minimum value in the last row of dp array
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            min = Math.min(min, dp[n-1][j]);
        }
        
        return min;
    }
}