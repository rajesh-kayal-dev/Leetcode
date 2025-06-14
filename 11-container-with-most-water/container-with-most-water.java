class Solution {
    public int maxArea(int[] heights) {
        int left = 0; ///1
        int right = heights.length -1; //7
        int maxWater = 0;
        while(left < right){
            //min height
            int h = Math.min(heights[left],heights[right]);
            //width
            int w = right - left; //6
            //area
            int area = h * w ; //6*6=36

            //update maxWater
            maxWater= Math.max(maxWater, area);

            //move the pointer to smaller height
            if(heights[left] < heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
}
