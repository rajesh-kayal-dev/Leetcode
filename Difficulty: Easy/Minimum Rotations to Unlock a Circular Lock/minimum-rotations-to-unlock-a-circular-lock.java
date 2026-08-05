class Solution {
    public int rotationCount(int r, int d) {
        
        int ans = 0;
        
        while(r > 0 || d > 0){
            
        int first = r%10;
        int second = d%10;
            
            int diff = Math.abs(first - second);
            
            
            ans += Math.min(diff, 10 - diff);
            
            r/=10;
            d/=10;
            
            
        }
        return ans;
        
    }
}