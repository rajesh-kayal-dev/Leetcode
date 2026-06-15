// Last updated: 6/15/2026, 10:02:46 AM
class Solution {
    public void sortColors(int[] nums) {
        int n =nums.length;
        int noOfZeros=0,noOfOnes=0;
        for(int i =0;i<n;i++){
            if (nums[i]==0) noOfZeros++;
            if (nums[i]==1) noOfOnes++;
        }
        for (int i =0;i<n;i++){
            if(i<noOfZeros)
            nums[i]=0;
            else if(i<noOfZeros+noOfOnes)
            nums[i]=1;
            else
            nums[i]=2;
        }
    }
}