// Last updated: 6/15/2026, 10:01:20 AM
/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    const set = new Set();

    for(const n of nums){
        if(set.has(n)) return true;
        set.add(n);
    }
    return false;
};