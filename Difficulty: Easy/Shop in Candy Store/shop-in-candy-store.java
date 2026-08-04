class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        
          Arrays.sort(prices);
        
        
        int min_amount = 0, max_amount = 0;
        
         
        
        int i = 0, n = prices.length -1;
        
        while(i <= n){
            min_amount += prices[i];
            i++;
            n -=k;
        }
        
         i = prices.length -1;
         n = 0;
        
        while(i >= n){
            max_amount += prices[i];
            i--;
            n +=k;
        }
        
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(min_amount);
        result.add(max_amount);
        
        
        
        return result;
    }
}
