// Last updated: 7/25/2026, 10:14:31 AM
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var topKFrequent = function(nums, k) {
   //count frequescy
   //sort decending order
   //return top k
    let count = {};

    for(let num of nums){
        count[num] = (count[num] || 0 ) + 1; //count frequency of word
    }

   return Object.entries(count) //coveting object into array for sort operation
            .sort((a,b)=> b[1] - a[1]) //sort decending order
            .slice(0, k) //for pick top k values 
            .map((item) => Number(item[0])) //return result into  array of value
};