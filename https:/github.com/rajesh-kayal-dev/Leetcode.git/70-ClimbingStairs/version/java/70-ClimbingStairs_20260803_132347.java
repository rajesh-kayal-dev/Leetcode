// Last updated: 8/3/2026, 1:23:47 PM
1class Solution {
2    public int climbStairs(int n) {
3        
4        int curr = 0, next = 1, next2 = 0;
5
6        for(int i = n - 1; i >= 0; i--){
7            curr = next + next2;
8            next2 = next;
9            next = curr;
10        }
11        
12        return curr;
13        
14    }
15}