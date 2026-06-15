// Last updated: 6/15/2026, 10:02:14 AM
class Solution {
    public int maxProfit(int[] prices) {

        int min_price=prices[0], profit=0;

        for(int i = 0; i <prices.length;i++){
            if(prices[i] < min_price){
                min_price= prices[i];
            }else{
                profit= Math.max(profit, prices[i]- min_price);
            }
        }
        return profit;
        
    }
}