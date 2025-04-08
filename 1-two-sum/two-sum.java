class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int sum[]= new int[2];
        for(int i = 0;i<n;i++){
            for(int j = i +1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    sum[0]=i;
                    sum[1]=j;
                    return sum;
                 }
             }
        }
        return new int[]{};
    }
}