// Last updated: 7/27/2026, 10:43:54 AM
1class Solution {
2    public int search(int[] nums, int target) {
3        for(int i = 0; i < nums.length; i++ ){
4            if(nums[i] == target){
5                return i;
6            }
7        }
8        return - 1;
9    }
10}