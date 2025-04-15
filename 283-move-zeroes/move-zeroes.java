class Solution {
    public void moveZeroes(int[] nums) {
        int nZero=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] != 0){ //coz array first index can be zero so we not apply arr[i]==0
                if(i !=nZero){ //if current i is not nonzero means its zero so find zero
                int temp = nums[i];//zero mila to non zero mai pass kar do
                nums[i]=nums[nZero];
                nums[nZero]=temp;
            }
            nZero++;// Agla non-zero element next position pe aayega
            }
           
        }
    }
}