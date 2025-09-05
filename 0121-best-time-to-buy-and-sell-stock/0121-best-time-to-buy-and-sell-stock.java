class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i= 0; i < prices.length;i++){
            if(prices[i] < minPrice){//price agar min price se kam hai to stock buy karo
               minPrice = prices[i];
            }else if(prices[i] - minPrice > maxProfit){ //if price jada hai phichla prfit se sell karo
                maxProfit = prices[i] - minPrice;
            }
        }
        
        return maxProfit;
    }
}