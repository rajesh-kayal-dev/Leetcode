class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea= 0;
        int n = heights.length;

        for(int i = 0; i <= n; i++){
            int currHeight = (i == n) ? 0: heights[i];

            while(!st.isEmpty() && currHeight < heights[st.peek()]){
                int top = st.pop();
                int height = heights[top];

                int width = st.isEmpty() ? i : i - st.peek() - 1;

                int area = height * width;

                maxArea = Math.max(maxArea, area);
            }
            st.push(i);
        }
        return maxArea;
    }
}