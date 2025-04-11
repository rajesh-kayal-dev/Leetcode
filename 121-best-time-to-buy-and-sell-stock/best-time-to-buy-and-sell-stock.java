class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int MaxProfit=0;

        for(int i =0;i<prices.length;i++){
            if(prices[i] < buy){//stock ka price agar buying price se kam ho
                buy=prices[i];//new stock buy karlo
            }
            int profit = prices[i] - buy;//stock price - buying price = profit
            if(profit > MaxProfit){//agar profit jada huya Max Profit se
                MaxProfit = profit;//profit ko Max Profit banado
            }
        }
        return MaxProfit;
        
    }
}