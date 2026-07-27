// Last updated: 7/27/2026, 11:09:51 AM
1class Solution {
2    public int climbStairs(int n) {
3        if(n <= 2) return n;
4        int first = 1;
5        int second = 2;
6
7        for(int i = 3; i <= n; i++){
8            int current = first + second;
9            first = second;
10            second = current;
11        }
12
13       return second; 
14    }
15}