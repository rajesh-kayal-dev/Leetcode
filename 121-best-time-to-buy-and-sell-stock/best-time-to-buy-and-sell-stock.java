class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // ab tak ka sabse chhota price
        int maxProfit = 0; // ab tak ka maximum profit

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // naye lowest price par buy karo
            } else {
                int profit = price - minPrice; // current sell price - best buy price
                maxProfit = Math.max(maxProfit, profit); // max profit update karo
            }
        }

        return maxProfit;
    }
}
