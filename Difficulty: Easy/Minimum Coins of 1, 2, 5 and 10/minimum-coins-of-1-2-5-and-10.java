class Solution {
    public int findMin(int n) {
       int count = 0;
       
       int[] denomnation = {1, 2, 5, 10};
       
       for(int i = denomnation.length - 1; i >= 0;i--){
           count += n / denomnation[i];
           n = n % denomnation[i];
       }
        
        return count;
        
    }
}
