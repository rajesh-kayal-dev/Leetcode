// Last updated: 6/15/2026, 10:03:37 AM
class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length -1;
        int maxwater=0;

        while(left < right){
            int minHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int area = minHeight * width;
            maxwater= Math.max(maxwater, area);

            if(height[left] < height[right]) left++;
            else right--;
        }

        return maxwater;
    }
}