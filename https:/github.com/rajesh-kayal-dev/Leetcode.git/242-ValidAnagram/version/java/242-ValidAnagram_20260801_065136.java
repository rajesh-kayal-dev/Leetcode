// Last updated: 8/1/2026, 6:51:36 AM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length() != t.length()) return false;
4
5        char[] str1 = s.toCharArray();  
6        char[] str2 = t.toCharArray();  
7
8        Arrays.sort(str1);
9        Arrays.sort(str2);
10
11        return Arrays.equals(str1, str2);
12    }
13}