// Last updated: 6/15/2026, 10:01:45 AM
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
		Arrays.sort(nums);
		int count = 1;

    	for (int i = 1; i < n; i++) {
    		if (nums[i] == nums[i-1]) {
    			count++;
    		}else{
    			count=1;
    		}

    		if (count > n/2) {
				return nums[i];
			}	
    	}
    	return nums[n / 2];
    }
}