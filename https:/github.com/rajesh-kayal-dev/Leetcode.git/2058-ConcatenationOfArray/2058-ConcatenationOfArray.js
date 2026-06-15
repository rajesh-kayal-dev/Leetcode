// Last updated: 6/15/2026, 9:59:07 AM
/**
 * @param {number[]} nums
 * @return {number[]}
 */
var getConcatenation = function(nums) {

    let ans = [2 * nums.length];

    for(let i = 0; i < nums.length; i++){
        ans[i] = nums[i];
        ans[i + nums.length] = nums[i];
    }
    return ans;
};