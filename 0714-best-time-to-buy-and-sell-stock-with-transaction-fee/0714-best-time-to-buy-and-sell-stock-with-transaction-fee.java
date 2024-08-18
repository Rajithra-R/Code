class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int dp[][] = new int[n+1][2]; // n+2 - since dealing with index +2
        int i = 0;
        if(i == n) return 0;
         for(i = n - 1; i >= 0; i--) {
            for(int buy = 0; buy <= 1; buy++) {
                if(buy == 1)
                {
                    dp[i][buy] = Math.max(-prices[i] + dp[i+1][0] , 0 + dp[i+1][1]);
                }
                else // sell
                {
                    dp[i][buy] = Math.max(prices[i] - fee + dp[i+1][1] , 0 + dp[i+1][0] );// if i is 1st day then i+2 to buy the third day
                }
            }
         }
        return dp[0][1];
    }
}