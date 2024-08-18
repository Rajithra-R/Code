class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][] = new int[n+1][2]; 
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
                    dp[i][buy] = Math.max(prices[i] + dp[i+1][1] , 0 + dp[i+1][0] );// if i is 1st day then i+2 to buy the third day
                }
            }
         }
        return dp[0][1];
    }
}


/*
int buy_price = prices[0];
        int profit=0;
        int b_profit = 0;
        for(int i=1;i<prices.length;i++)
        {
        if(prices[i] <= buy_price)   //updating the buy price
        {
            buy_price = prices[i];
        }
        else   // calculating the profit
        {
            profit = prices[i] - buy_price;
            b_profit += profit;
            buy_price = prices[i]; // buy on the same day
        }
        }
        return b_profit;
*/