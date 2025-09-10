class Solution {
    public boolean isAnagram(String s, String t) {
        // Step 1: If lengths differ, not an anagram
        if (s.length() != t.length()) return false;

        // Step 2: Count character frequencies
        int[] count = new int[26]; // for lowercase letters only

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // Step 3: Check if all counts are zero
        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }
}
