// Last updated: 6/15/2026, 10:02:45 AM
class Solution {
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }

        int first = 1;
        int second = 2;

        for(int i = 3; i <= n; i++){
            int current = first + second;

            first = second;
            second = current;
        }
        return second;
    }
}