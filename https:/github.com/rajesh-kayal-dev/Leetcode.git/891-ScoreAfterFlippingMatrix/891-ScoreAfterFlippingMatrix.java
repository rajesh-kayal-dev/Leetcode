// Last updated: 6/15/2026, 9:59:49 AM
class Solution {
    public int matrixScore(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        
        // Flip rows if the first element is 0
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) { // Flip the row
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] == 0) arr[i][j] = 1;
                    else arr[i][j] = 0;
                }
            }
        }

        // Flip columns where the number of 0s is greater than the number of 1s
        for (int j = 1; j < n; j++) { 
            int zeros = 0, ones = 0;
            
            // Count zeros and ones in the column
            for (int i = 0; i < m; i++) { 
                if (arr[i][j] == 0) zeros++;
                else ones++;
            }
            
            // Flip column if 0s are more than 1s
            if (zeros > ones) {
                for (int i = 0; i < m; i++) {
                    if (arr[i][j] == 0) arr[i][j] = 1;
                    else arr[i][j] = 0;
                }
            }
        }

        // Calculate the score
        int score = 0;
        int fact = 1;

        for (int j = n - 1; j >= 0; j--) {
            for (int i = 0; i < m; i++) {
                score += (arr[i][j] * fact);
            }
            fact *= 2; 
        }

        return score;
    }
}
