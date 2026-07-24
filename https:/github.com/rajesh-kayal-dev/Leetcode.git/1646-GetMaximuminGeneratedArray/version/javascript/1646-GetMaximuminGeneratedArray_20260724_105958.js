// Last updated: 7/24/2026, 10:59:58 AM
1/**
2 * @param {number} n
3 * @return {number}
4 */
5var getMaximumGenerated = function(n) {
6
7    if(n == 0 )return 0;
8    let nums = new Array(n + 1).fill(0);
9    nums[0] = 0;
10    nums[1] = 1;
11    let max = 1;
12
13    for(let i = 1;2 * i <= n; i++){
14            nums[2 * i] = nums[i]
15            max = Math.max(max, nums[2 * i]);
16
17        if(2 * i + 1 <= n){
18            nums[2 * i + 1] = nums[i] + nums[i + 1];
19            max = Math.max(max, nums[2 * i + 1]);
20        }
21    }
22
23    return max;
24    
25};