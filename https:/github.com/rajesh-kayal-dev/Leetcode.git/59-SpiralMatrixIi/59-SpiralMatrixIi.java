// Last updated: 6/15/2026, 10:02:51 AM
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int val = 1;

        while (top <= bottom && left <= right) {
            // Left → Right
            for (int j = left; j <= right; j++) {
                matrix[top][j] = val++;
            }
            top++;  // Move top boundary down

            // Top → Bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = val++;
            }
            right--;  // Move right boundary left

            if (top <= bottom) {
                // Right → Left
                for (int j = right; j >= left; j--) {
                    matrix[bottom][j] = val++;
                }
                bottom--;  // Move bottom boundary up
            }

            if (left <= right) {
                // Bottom → Top
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = val++;
                }
                left++;  // Move left boundary right
            }
        }
        return matrix;
    }
}
