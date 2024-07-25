// tabulation

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(obstacleGrid[i][j] == 1)  // if u fing an obstacle just continue
                {
                    continue;
                }
                if(i==0 && j==0) dp[i][j] = 1;
                else
                {
                    int up = 0,left = 0;
                    if(i>0) up = dp[i-1][j];
                    if(j>0) left = dp[i][j-1];
                    dp[i][j] = up + left;
                    
                }
            }
        }
             //return the last element
        return dp[m-1][n-1];
    }
}

/*
space optimization => cur = dp[i] ; prev = d[i-1]
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
       // int dp[][] = new int[m][n];
       int prev[] = new int[n];
        for(int i=0;i<m;i++)
        {
        int cur[] = new int[n];
            for(int j=0;j<n;j++)
            {
                if(obstacleGrid[i][j] == 1)  // if u fing an obstacle just continue
                {
                    continue;
                }
                if(i==0 && j==0) cur[j] = 1;
                else
                {
                    int up = 0,left = 0;
                    if(i>0) up = prev[j];
                    if(j>0) left = cur[j-1];
                    cur[j] = up + left;
                    
                }
            }
            prev = cur;
        }
             //return the last element
        return prev[n-1];
*/