// Last updated: 6/15/2026, 10:02:37 AM
class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        // Step 1: Create frequency map of characters in t
        int[] tFreq = new int[128];  // ASCII size
        for (char c : t.toCharArray()) {
            tFreq[c]++;
        }

        // Step 2: Sliding window pointers
        int left = 0, right = 0;
        int count = 0; // how many t characters matched
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        int[] windowFreq = new int[128];

        while (right < s.length()) {
            char rChar = s.charAt(right);
            windowFreq[rChar]++;

            // if character is needed and not extra, count it
            if (tFreq[rChar] > 0 && windowFreq[rChar] <= tFreq[rChar]) {
                count++;
            }

            // when all t chars matched
            while (count == t.length()) {
                // update result if smaller window found
                if ((right - left + 1) < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char lChar = s.charAt(left);
                windowFreq[lChar]--;

                // if removing this char breaks a match
                if (tFreq[lChar] > 0 && windowFreq[lChar] < tFreq[lChar]) {
                    count--;
                }

                left++; // shrink window
            }

            right++; // expand window
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
