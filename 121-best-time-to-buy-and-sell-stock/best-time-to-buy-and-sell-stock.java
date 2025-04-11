class Solution {
    public int maxProfit(int[] arr) {
        int buy= Integer.MAX_VALUE;
        int MaxProfit=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] < buy){
                buy = arr[i];//new stock buy karlo
            }
            int profit=arr[i] - buy; //stock price - buying price = profit
            if(profit > MaxProfit){
                MaxProfit=profit;
            }
        }
        return MaxProfit;
    }
}