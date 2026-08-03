// Last updated: 8/3/2026, 1:20:33 PM
1class Solution {
2    public int climbStairs(int n) {
3        
4        int[] dp = new int[n + 2];
5        dp[n]= 1;
6        dp[n + 1] = 0;
7
8        for(int i = n - 1; i >= 0; i--){
9            dp[i] = dp[i+1] + dp[i + 2];
10        }
11        
12        return dp[0];
13        
14    }
15}