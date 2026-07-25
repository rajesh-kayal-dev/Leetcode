// Last updated: 7/25/2026, 12:17:38 PM
1/**
2 * @param {number[]} nums
3 * @return {number}
4 */
5var rob = function(nums) {
6    if(nums.length === 1) return nums[0];
7    let prev1 = 0, prev2 =0, current = 0;
8
9        for(let num of nums){
10            current = Math.max(prev1, prev2 + num);
11            prev2 = prev1;
12            prev1= current;
13        }
14        return current;
15        
16};