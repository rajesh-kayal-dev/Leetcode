// Last updated: 7/25/2026, 10:13:51 AM
/**
 * @param {number} n
 * @return {number}
 */
var getMaximumGenerated = function(n) {

    if(n == 0 )return 0;
    let nums = new Array(n + 1).fill(0);
    nums[0] = 0;
    nums[1] = 1;
    let max = 1;

    for(let i = 1;2 * i <= n; i++){
            nums[2 * i] = nums[i]
            max = Math.max(max, nums[2 * i]);

        if(2 * i + 1 <= n){
            nums[2 * i + 1] = nums[i] + nums[i + 1];
            max = Math.max(max, nums[2 * i + 1]);
        }
    }

    return max;
    
};