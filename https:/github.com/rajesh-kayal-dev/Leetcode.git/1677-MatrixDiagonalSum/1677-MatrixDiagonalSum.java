// Last updated: 6/15/2026, 9:59:19 AM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        int n = mat.length;
        for(int i = 0; i<n;i++){
            sum += mat[i][i];
            sum += mat[i][n-i-1];
        }
        if(n%2 != 0){
            sum -= mat[n/2][n/2];
        }
        return sum;
    }
}