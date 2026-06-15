// Last updated: 6/15/2026, 10:00:45 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        long i = 1;

        while(i < n){
            i = i *3;
        }
        return i == n;
    }
}