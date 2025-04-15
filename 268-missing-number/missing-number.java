class Solution {
    public int missingNumber(int[] nums) {
        //[0,1,3,4,5]
        int n = nums.length; //5
        int sum= 0;
        for(int i =0;i<n;i++){
            sum +=nums[i]; //13
        }
        int expectedSum = n*(n+1)/2; //15
        int missingNum = expectedSum - sum;//15- 13= 2
        return missingNum; //2
    }
}