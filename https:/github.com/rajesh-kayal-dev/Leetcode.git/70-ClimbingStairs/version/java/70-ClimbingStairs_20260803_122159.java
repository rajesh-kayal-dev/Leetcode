// Last updated: 8/3/2026, 12:21:59 PM
1class Solution {
2    public int climbStairs(int n) {
3        int[] dp = new int[n + 1];
4
5        Arrays.fill(dp, -1);
6
7        return count(0, n, dp);
8    }
9
10    private static int count(int i, int n, int[] dp){
11        if(i == n) return 1;
12
13        if(i >= n) return 0;
14
15        if(dp[i] != -1) return dp[i];
16
17        return dp[i] = count(i +1, n, dp) + count(i + 2, n, dp);
18    }
19}