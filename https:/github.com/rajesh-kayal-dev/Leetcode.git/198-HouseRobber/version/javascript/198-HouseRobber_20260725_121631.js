// Last updated: 7/25/2026, 12:16:31 PM
1/**
2 * @param {number[]} nums
3 * @return {number}
4 */
5var rob = function(nums) {
6    let prev1 = 0, prev2 =0, current = 0;
7
8        for(let num of nums){
9            current = Math.max(prev1, prev2 + num);
10            prev2 = prev1;
11            prev1= current;
12        }
13        return current;
14        
15};