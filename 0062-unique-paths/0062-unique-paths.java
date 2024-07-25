// tabulation
class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
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


// space optimizition
/*
use variables => prev,cur   => cur = dp[i] & prev = dp[i-1]
int prev[] = new int[n];
prev = {0};
for(int i=0;i<m;i++)
{
   int cur[] = new int[n];
   cur = {0};
   for(int j=0;j<n;j++)
     {
     if(i==0 && j==0) cur[j] = 1;
                else
                {
                    int up = 0,left = 0;
                    if(i>0) up = prev[j];
                    if(j>0) left = cur[j-1];
                    dp[i][j] = up + left;
                }
        }
        prev = cur;
}
return prev[n-1];
*/
    