/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    
    let n = nums.length;
    let result = [];

    // Calculate prefixes and store in result array
    let prefixProduct = 1;
    for (let i = 0; i < n; i++) {
        result[i] = prefixProduct;
        prefixProduct *= nums[i];
    }
    
    // Calculate suffixes and multiply with existing prefixes in the result array
    let suffixProduct = 1;
    for (let i = n - 1; i >= 0; i--) {
        result[i] *= suffixProduct;
        suffixProduct *= nums[i];
    }

    return result;
};