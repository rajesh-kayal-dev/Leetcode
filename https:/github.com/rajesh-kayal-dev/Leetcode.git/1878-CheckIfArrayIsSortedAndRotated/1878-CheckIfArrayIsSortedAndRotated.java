// Last updated: 6/15/2026, 9:59:16 AM
class Solution {
    public boolean check(int[] nums) {
        if(nums == null) return false;
        int n = nums.length;
        if(n < 2) return true;
        int drops = 0;

        for(int i = 0; i < n ;i++){
            if(nums[i] > nums[(i + 1) % n]){
                drops++;
                if(drops > 1) return false;
            }
        }
        return true;
    }
}