// Last updated: 6/15/2026, 10:01:41 AM
/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
     let ans = nums[0];
    let count = 1;

    for (let i = 1; i < nums.length; i++) {
        if (count === 0) {
            ans = nums[i];
            count = 1;
        } else if (ans === nums[i]) {
            count++;
        } else {
            count--;
        }
    }

    return ans;
};