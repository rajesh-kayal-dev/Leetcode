// Last updated: 6/15/2026, 9:59:13 AM
class Solution {
    public int[] getConcatenation(int[] nums) {

        int ans[] = new int [ 2 * nums.length];

        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

        return ans;
        
    }
}