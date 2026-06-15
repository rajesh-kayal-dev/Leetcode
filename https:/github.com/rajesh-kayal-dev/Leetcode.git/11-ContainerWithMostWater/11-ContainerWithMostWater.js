// Last updated: 6/15/2026, 10:03:42 AM
/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    let left = 0;
    let right = height.length - 1;
    let maxWater = 0;

    while(left < right){
        let currentHeight = Math.min(height[left], height[right]);
        let currentWidth = right - left;
        let currentArea = currentWidth * currentHeight;
        maxWater = Math.max(maxWater, currentArea);

        if(height[left] < height[right]) left++;
        else right--;
    }
    return maxWater;
};