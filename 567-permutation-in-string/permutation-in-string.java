class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        // Pehla window (length of s1) ka count build karo
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        // Check if first window matches
        if (Arrays.equals(s1Count, s2Count)) return true;

        // Sliding window s1.length() ke baad se chalu karo
        for (int i = s1.length(); i < s2.length(); i++) {
            s2Count[s2.charAt(i) - 'a']++; // new char add
            s2Count[s2.charAt(i - s1.length()) - 'a']--; // old char remove

            if (Arrays.equals(s1Count, s2Count)) return true;
        }

        return false;
    }
}
