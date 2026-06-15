// Last updated: 6/15/2026, 10:03:03 AM
class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int [] leftMax = new int[n]; 
        int [] rightMax = new int[n]; 

        //fill left max
        leftMax[0]=height[0];
        for(int i =1;i < n;i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }

        //fill right max
        rightMax[n -1] = height[n - 1];
        for(int i = n - 2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }

        //calculate total trapping water

        int maxWater=0;
        for(int i = 0;i < n;i++){
            int water = Math.min(leftMax[i],rightMax[i]) - height[i];
            if(water > 0){
                maxWater +=water;
            }
        }
        return maxWater;
    }
}