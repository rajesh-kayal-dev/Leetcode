// Last updated: 6/15/2026, 10:02:08 AM
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // Sabhi numbers ko HashSet mein daal do (O(1))

        for(int num : nums){
            set.add(num);
        }
        //check all numbers 

        int maxLen = 0;
        for(int num : set){

        // Agar num-1 set mein nahi hai to ye sequence ka start ho sakta hai

        if(!set.contains(num - 1)){
            int length =0;
            // Jab tak agla number milta rahe, count badhao
            while(set.contains(num + length)){
                length++;
            }
            
                maxLen = Math.max(maxLen,length);
            }
        }
        return maxLen;
    }
}
