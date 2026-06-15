// Last updated: 6/15/2026, 9:59:23 AM
class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1_000_000_007;
        long result = 0, prefixSum = 0;
        long odd = 0, even = 1;  

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum % 2 == 0) {
                result = (result + odd) % MOD;
                even++;
            } else {
                result = (result + even) % MOD;
                odd++;
            }
        }

        return (int) result;
    }
}
