class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 0) return 0;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);

            int case1 = removeLiner(nums, 0 , n -2);
            int case2 = removeLiner(nums, 1 , n - 1);

        return Math.max(case1, case2);

        
    }
    private int removeLiner(int[] nums, int start, int end){
        int prev1 = 0 , prev2 = 0;

        for(int i = start; i <= end; i++){
           int current = Math.max(prev1, prev2 + nums[i]);
           prev2 = prev1;
           prev1 = current;
        }
        return prev1;
    }
}