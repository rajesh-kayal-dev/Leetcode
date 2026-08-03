class Solution {
    
    private static int ways(int n){
        if(n <= 1) return 1;
        if(n == 2) return 2;
        
        return ways(n - 1) + ways(n - 2) + ways(n - 3);
    }

    static int countWays(int n) {
        
        return ways(n);
    }
}
