class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int index[]= new int[2];
        for(int i = 0;i<n;i++){//
            for(int j = i +1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    index[0]=i;
                    index[1]=j;
                    return index;
                 }
             }
        }
        return new int[]{};
    }
}