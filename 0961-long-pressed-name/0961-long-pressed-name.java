class Solution {
    public boolean isLongPressedName(String s1, String s2) {
        int i = 0, j = 0;

        while (j < s2.length()) {
            if (i < s1.length() && s1.charAt(i) == s2.charAt(j)) {
                // characters match, move both
                i++;
                j++;
            } else if (j > 0 && s2.charAt(j) == s2.charAt(j - 1)) {
                // current char in s2 is long-pressed version of previous
                j++;
            } else {
                return false;
            }
        }

        // if we matched all chars in s1, it's valid
        return i == s1.length();
    }
}
