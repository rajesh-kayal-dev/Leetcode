// Last updated: 6/15/2026, 10:03:50 AM
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let map = new Map();

    for(let i = 0; i<nums.length;i++){
       let complement =  target - nums[i];
       if(map.has(complement)) {
        return [map.get(complement), i];
       }
       
       map.set(nums[i], i);
    }
    return [];
};