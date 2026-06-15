// Last updated: 6/15/2026, 10:03:25 AM
/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
        if (nums.length === 0) return 0;
    let j = 1;
    for(i= 0; i < nums.length-1; i++){
        if(nums[i] !== nums[i +1]){
            nums[j] = nums[i+1];
            j++;
        }
    }
    return j;
};