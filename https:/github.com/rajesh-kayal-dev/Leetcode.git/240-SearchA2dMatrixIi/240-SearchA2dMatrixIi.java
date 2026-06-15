// Last updated: 6/15/2026, 10:01:00 AM
class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length, n = arr[0].length;
        int i =0,j = n -1;
        while(i<m && j>=0){
            if(arr[i][j]== target) return true;
            else if(arr[i][j] > target){//go left
            j--;
            }else{ //go right
                i++;
            }
        }
        return false;
    }
}