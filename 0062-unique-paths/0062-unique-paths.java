class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++)  //traverse each row of 1st col
        {
            dp[i][0] = 1;
        }
        for(int j=0;j<n;j++)  //traverse each col of 1st row
        {
            dp[0][j] = 1;
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        //return the last element
        return dp[m-1][n-1];
    }
}