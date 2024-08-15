class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int max = 0;
        int profit = 0;
        for(int i=1;i<n;i++)
        {
            profit = prices[i] - buy;  // p = sp - cp
            max = Math.max(max,profit);  // update max_profit
            buy = Math.min(buy,prices[i]);  // buy whenever a low comes 
        }
        return max;
    }
}