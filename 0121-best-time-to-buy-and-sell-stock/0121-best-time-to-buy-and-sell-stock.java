class Solution {
    public int maxProfit(int[] prices) {
        int buy_price = prices[0];
        int max_profit = 0;
        int cur_profit;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i] < buy_price)
            {
                buy_price = prices[i];
            }
            else
            {
                cur_profit = prices[i] - buy_price;
                max_profit = Math.max(max_profit,cur_profit);
            }
        }
        return max_profit;
    }
}