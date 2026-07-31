// Last updated: 7/31/2026, 9:53:00 AM
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int k = 0;
4
5        for(int i = 0 ; i < nums.length; i++){
6            if(nums[i] != val){
7                nums[k++] = nums[i];
8            }
9        }
10        return k;
11    }
12}