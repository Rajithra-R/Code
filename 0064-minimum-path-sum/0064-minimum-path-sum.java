// tabulation - storing the values in dp array

class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n= grid[0].length;
      //  int dp[][] = new int[m][n];
        int prev[] = new int[n];
        for(int i=0;i<m;i++)
        {
            int cur[] = new int[n];
            for(int j=0;j<n;j++)
            {
                if(i == 0 && j == 0) cur[j] = grid[0][0];
                else
                {
                    int up = Integer.MAX_VALUE;
                    int left = Integer.MAX_VALUE;
                    if(i>0) up = grid[i][j] + prev[j];
                    if(j>0) left = grid[i][j] + cur[j-1];
                    cur[j] = Math.min(up,left);
                }
            }
            prev = cur;
        }
        return prev[n-1];
    }
}
/*
SPACE OPTIMIZATION => cur = dp[i] ; prev = dp[i-1]
        int m = grid.length;
        int n= grid[0].length;
      //  int dp[][] = new int[m][n];
        int prev[] = new int[n];
        for(int i=0;i<m;i++)
        {
            int cur[] = new cur[n];
            for(int j=0;j<n;j++)
            {
                if(i == 0 && j == 0) cur[j] = grid[0][0];
                else
                {
                    int up = Integer.MAX_VALUE;
                    int left = Integer.MAX_VALUE;
                    if(i>0) up = grid[i][j] + prev[j];
                    if(j>0) left = grid[i][j] + cur[j-1];
                    cur[j] = Math.min(up,left);
                }
            }
            prev = cur;
        }
        return prev[n-1];
*/