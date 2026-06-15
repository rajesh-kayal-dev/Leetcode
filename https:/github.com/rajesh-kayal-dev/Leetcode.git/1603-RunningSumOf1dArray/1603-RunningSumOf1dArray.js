// Last updated: 6/15/2026, 9:59:26 AM
/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function(nums) {


    for(let i = 1; i < nums.length; i++){
        nums[i]= nums[i] + nums[i-1];
    }
    return nums;
    
};