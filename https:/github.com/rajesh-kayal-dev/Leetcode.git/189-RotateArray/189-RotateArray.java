// Last updated: 6/15/2026, 10:01:36 AM
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        reverse(nums, 0, n-1); //reverse whole
        reverse(nums, 0, k-1); //reverse first by k
        reverse(nums, k, n-1); //reverse last of k;
    }
    private static void reverse(int[] nums, int i, int j){
        
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] =temp;
            i++;
            j--;
        }
    }
}