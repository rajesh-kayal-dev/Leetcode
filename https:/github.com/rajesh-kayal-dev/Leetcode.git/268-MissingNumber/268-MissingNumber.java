// Last updated: 6/15/2026, 10:00:57 AM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int xor1 = 0;
        for (int i = 0; i <= n; i++) { // includes 'n'
            xor1 ^= i;
        }

        int xor2 = 0;
        for (int num : nums) {
            xor2 ^= num;
        }

        return xor1 ^ xor2; // The missing number
    }
}
