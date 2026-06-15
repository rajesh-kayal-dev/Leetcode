// Last updated: 6/15/2026, 10:03:11 AM
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    let i =0;
    for(i = 0; i < nums.length; i++){
        if(nums[i] === target){
            return i;
        }else if (nums[i] > target){
            return i;
        }
    }
    return i;
};