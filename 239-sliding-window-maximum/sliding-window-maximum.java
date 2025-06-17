class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return new int[0];

        Deque<Integer> dq = new ArrayDeque<>(); // Store indexes
        int[] result = new int[n - k + 1]; // Final output array
        int ri = 0; // index for result array

        for (int i = 0; i < n; i++) {

            // Remove elements from front if they are out of window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst(); // pop front
            }

            // Remove elements from back which are smaller than current element
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast(); // pop back
            }

            dq.offerLast(i); // push current index

            // Once we have the first window, start recording max
            if (i >= k - 1) {
                result[ri++] = nums[dq.peekFirst()]; // max of current window
            }
        }

        return result;
    }
}
