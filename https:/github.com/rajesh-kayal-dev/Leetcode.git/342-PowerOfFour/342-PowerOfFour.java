// Last updated: 6/15/2026, 10:00:42 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        for (long i = 1; i <= n; i *= 4) {
            if (i == n) {
                return true;
            }
        }
        
        return false;
    }
}