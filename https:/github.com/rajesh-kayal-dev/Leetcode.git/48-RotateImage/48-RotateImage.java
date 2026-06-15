// Last updated: 6/15/2026, 10:02:58 AM
class Solution {
    public void rotate(int[][] matrix) {
        swap(matrix);
        transpose(matrix);
    }

    public void swap(int[][] matrix) {
        int start =0;
        int end = matrix.length-1;

        while(start < end){
            int[] temp = matrix[start];
            matrix[start]=matrix[end];
            matrix[end]=temp;
            start++;
            end--;
        }
        
    }
    public void transpose(int[][] matrix) {
        for(int i = 0; i<matrix.length -1; i++){
            for(int j =i+1; j<matrix.length; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }

}