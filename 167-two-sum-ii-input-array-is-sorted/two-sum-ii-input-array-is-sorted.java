class Solution {
    public int[] twoSum(int[] n, int target) {
        int left =0;
        int right= n.length-1;

        while(left < right){

            int sum = n[left] + n[right];//current sum

            if(sum == target){
                return new int[]{left +1 , right +1};// 1 based index (we don't need 0 index)
            }else if(sum < target){
                left++;//insrese the by moving forward
            }else{
                right--;
            }
        }
        return new int[]{-1,-1};//if solution not found
    }
}
