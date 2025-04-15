class Solution {
    public void moveZeroes(int[] nums) {
        int nZero = 0; // Pointer to track position for next non-zero element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) { // Agar current element zero nahi hai
                if (i != nZero) { // Agar current index aur target index alag hai, tabhi swap karna hai
                    // Swap current non-zero element to the correct position
                    int temp = nums[i];
                    nums[i] = nums[nZero];
                    nums[nZero] = temp;
                }
                nZero++; // Agla non-zero element next position pe aayega
            }
        }
    }
}
