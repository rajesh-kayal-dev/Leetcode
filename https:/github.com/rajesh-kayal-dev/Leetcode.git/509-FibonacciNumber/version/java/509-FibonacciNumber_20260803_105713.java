// Last updated: 8/3/2026, 10:57:13 AM
1class Solution {
2    public int fib(int n) {
3
4       int[] dp = new int[n + 1];
5
6       Arrays.fill(dp, -1); //initial value
7
8       return solve(n, dp);
9    }
10    private static int solve(int n , int[] dp){
11
12        //basecase
13        if(n <= 1) return n;
14
15        //already calculate
16        if(dp[n] != -1) return dp[n];
17
18        return dp[n] = solve(n -1,dp) + solve(n - 2, dp);
19    }
20}