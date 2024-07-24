class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        Arrays.fill(dp,1,dp.length,amount+1);
        for(int i=1;i<=amount;i++)
        {
            for(int k : coins)
            {
                if(k <= i)
                {
                    dp[i] = Math.min(dp[i],dp[i-k]+1);
                }
            }
        }
        return dp[amount] == amount+1 ? -1 : dp[amount]; 
    }
}