// Last updated: 6/15/2026, 10:01:08 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
        long i =1;
        while(i < n){
            i =i * 2;
        }
        return i == n ? true : false;
    }
}