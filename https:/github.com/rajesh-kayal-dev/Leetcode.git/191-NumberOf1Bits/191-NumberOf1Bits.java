// Last updated: 6/15/2026, 10:01:33 AM
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1); // Remove the rightmost set bit
            count++;
        }
        return count;
    }
}