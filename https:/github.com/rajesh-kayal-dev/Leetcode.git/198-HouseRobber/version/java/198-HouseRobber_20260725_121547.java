// Last updated: 7/25/2026, 12:15:47 PM
1class Solution {
2    public int rob(int[] nums) {
3        int prev1 = 0, prev2 =0, current = 0;
4
5        for(int num : nums){
6            current = Math.max(prev1, prev2 + num);
7            prev2 = prev1;
8            prev1= current;
9        }
10        return current;
11        
12    }
13}