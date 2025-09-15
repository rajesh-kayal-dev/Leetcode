class Solution {
    public boolean check(int[] nums) {
        if(nums == null) return false;
        int n = nums.length;

        if(n <= 2) return true;

        int drop=0;
        for(int i = 0;i < n;i++){
            if(nums[i] > nums[(i + 1) % n]){
                drop++;
                if(drop > 1) return false;
            }
        }
        return true;
        
    }
}