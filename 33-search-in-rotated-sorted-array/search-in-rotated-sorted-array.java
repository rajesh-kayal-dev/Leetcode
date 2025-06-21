class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;

        while(low <= high){
            int mid = low + (high - low) /2;

            if(nums[mid] == target) return mid;

            //seach in sorted left part
            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target < nums[mid]){
                    high = mid - 1; //left side
                }else{
                    low = mid + 1;//right side
                }
            //search in sorted right part
            }else{
                if(nums[mid] < target && target <= nums[high]){
                    low = mid + 1;//right side
                }else{
                    high = mid - 1; //left side
                }
            }
        }
        //target not found then return -1
        return -1;
    }
}