// Last updated: 8/3/2026, 11:17:25 AM
1class Solution {
2    public int fib(int n) {
3
4        //basecase
5        if(n <= 1) return n;
6
7       int[] dp = new int[n + 1];
8
9
10        dp[0] = 0;
11        dp[1] = 1;
12
13
14        for(int i = 2; i <= n; i++){
15            dp[i] = dp[i-1] + dp[i-2];
16        }
17
18        return dp[n];
19    }
20}