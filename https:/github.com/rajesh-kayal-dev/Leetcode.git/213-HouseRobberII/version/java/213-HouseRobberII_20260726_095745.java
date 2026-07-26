// Last updated: 7/26/2026, 9:57:45 AM
1class Solution {
2    public int rob(int[] nums) {
3        int n = nums.length;
4        if(n == 1) return nums[0];
5
6        int fisrtSkip[] = new int[n-1];
7        int lastSkip[] = new int[n-1];
8
9        for(int i = 0; i < n-1; i++){
10             fisrtSkip[i] = nums[i + 1];
11             lastSkip[i] = nums[i];
12        }
13        
14        int res1= robberHelper(fisrtSkip);
15        int res2 =robberHelper(lastSkip);
16
17        return Math.max(res1, res2);
18
19    }
20
21    private static int robberHelper(int[] nums){
22        int prev1 = 0;
23        int prev2 = 0;
24
25        for(int num : nums){
26           int current = Math.max(prev1 , prev2 + num);
27            prev2 = prev1;
28            prev1 = current;
29        }
30
31        return prev1;
32    }
33}