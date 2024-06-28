class Solution {
    public int maxProfit(int[] prices) {
        int buy_price = prices[0];
        int b_profit = 0;
        int profit=0;
        for(int i=0;i<prices.length;i++)
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
    }
}