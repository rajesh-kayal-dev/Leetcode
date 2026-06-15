// Last updated: 6/15/2026, 9:59:53 AM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //Liner search
        // int i =0;
        // while(arr[i] < arr[i + 1]){
        //     i++;
        // }
        // return i;

        //binary search

        int low = 0, high = arr.length - 1;

        while(low < high){
            // int mid = (low + high)/2;//overflow
            int mid = low + (high - low)/2;

            if(arr[mid] < arr[mid + 1]){
                low = mid + 1;
            }else{
                high = mid;
            }

        }
        return low;
    }
}