// Last updated: 6/15/2026, 10:01:48 AM
class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length -1;

        while(low < high){
            int mid = low + (high - low) /2;

            //if mid element > rightmost element then min at the right half
            if(nums[mid] > nums[high]){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return nums[low]; //or nums[high] or at the min point
    }
}