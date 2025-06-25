class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        //move the slow 1 step ,fast 2 step
        do{
            slow= nums[slow];
            fast= nums[nums[fast]];
        }while( slow != fast);

        //find entry point of the cycle(duplicate number)
        slow = nums[0];
        while( slow != fast){
            slow= nums[slow];
            fast= nums[fast];
        }
        return slow;
    }
}