// Last updated: 6/15/2026, 10:02:39 AM
/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function(nums) {

    let i = 0;
    let j = 0;
    let k = nums.length -1;
    
    const swap = (nums, i , j)=>{
            let temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
    } 

    while(i <= k){
        if(nums[i] === 0){
            swap(nums, i,j);
            i++;
            j++;
        }else if(nums[i] === 2){
            swap(nums, i, k);
            k--;
        }else{
            i++;
        }
    }
    

};