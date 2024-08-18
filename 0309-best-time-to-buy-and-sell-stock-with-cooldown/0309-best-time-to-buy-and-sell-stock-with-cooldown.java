// cooldown - buy and sell then the next sudden day u cannot buy another .... 
// cannot buy the next day after sell and hence sell condition can be i+2
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][] = new int[n+2][2]; // n+2 - since dealing with index +2
        int i = 0;
        if(i == n) return 0;
      //  if(dp[i][buy] != -1) return dp[i][buy];
         for(i = n - 1; i >= 0; i--) {
            for(int buy = 0; buy <= 1; buy++) {
                if(buy == 1)
                {
                    dp[i][buy] = Math.max(-prices[i] + dp[i+1][0] , 0 + dp[i+1][1]);
                }
                else // sell
                {
                    dp[i][buy] = Math.max(prices[i] + dp[i+2][1] , 0 + dp[i+1][0] );// if i is 1st day then i+2 to buy the third day
                    // only change from code 2 is i+2
                }
            }
         }
        return dp[0][1];
    }
}

/*
u can reduce the inner for loop because buy =1 in one case and buy =0 in next case once u buy then u sell and hance modified loop is 
            for(i = n - 1; i >= 0; i--) {
            
                    dp[i][buy] = Math.max(-prices[i] + dp[i+1][0] , 0 + dp[i+1][1]);
                
                
                    dp[i][buy] = Math.max(prices[i] + dp[i+2][1] , 0 + dp[i+1][0] );// if i is 1st day then i+2 to buy the third day
         }

*/