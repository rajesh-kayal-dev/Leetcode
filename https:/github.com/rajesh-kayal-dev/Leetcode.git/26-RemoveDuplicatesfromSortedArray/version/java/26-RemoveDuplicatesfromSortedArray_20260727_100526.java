// Last updated: 7/27/2026, 10:05:26 AM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int n = nums.length;
4        int i = 0, j = 1;
5
6        while(j < n){
7            if (nums[i] != nums[j]){
8                nums[i+1] = nums[j];
9                i++;
10            }
11            j++;
12        }
13        
14        return i + 1;
15    }
16}