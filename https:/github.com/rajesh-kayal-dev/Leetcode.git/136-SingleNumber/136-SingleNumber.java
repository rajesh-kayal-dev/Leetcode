// Last updated: 6/15/2026, 10:02:02 AM
class Solution {
    public int singleNumber(int[] nums) {

        int result = 0;

        for(int num : nums){
            result ^= num;
        }
        return result;
        
    }
}