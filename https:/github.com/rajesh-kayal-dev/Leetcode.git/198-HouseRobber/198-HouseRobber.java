// Last updated: 6/15/2026, 10:01:32 AM
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 1) return nums[0];

        if(n == 2) return Math.max(nums[0] , nums[1]);

        int first = nums[0];
        int second = Math.max(nums[0] , nums[1]);

        for(int i = 2; i < n ;i++){
            int current = Math.max(second, first + nums[i]);
            first = second;
            second = current;
        }

        return second;
    }
}