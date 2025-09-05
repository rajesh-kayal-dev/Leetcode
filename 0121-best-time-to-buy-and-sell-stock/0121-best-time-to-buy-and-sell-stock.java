class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i= 0; i < prices.length;i++){
            if(prices[i] < minPrice){// price agar minPrice se kam hai to buy price update karo
               minPrice = prices[i];
            }else if(prices[i] - minPrice > maxProfit){  // agar profit zyada hai to maxProfit update karo
                maxProfit = prices[i] - minPrice;
            }
        }
        
        return maxProfit;
    }
}