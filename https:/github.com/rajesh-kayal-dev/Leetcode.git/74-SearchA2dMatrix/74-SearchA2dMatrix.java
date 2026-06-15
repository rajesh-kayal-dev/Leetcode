// Last updated: 6/15/2026, 10:02:41 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;//no of row
        int n = matrix[0].length;//no of col

        int low = 0, high = m * n -1;

        while( low <= high){

            int mid = low + (high - low )/2;

            int row = mid / n; //n = 4 mid = 5  -> row = 5/4=1
            int col = mid % n;// n = 4(col) mid = 5 -> col = 5 % 4 = 1

            int midVal = matrix[row][col];

            //binary search

            if(midVal == target){
                return true;
            }else if(midVal < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return false;
    }
}