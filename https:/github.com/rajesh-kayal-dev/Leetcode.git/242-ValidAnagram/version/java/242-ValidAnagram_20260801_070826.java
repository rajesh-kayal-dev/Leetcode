// Last updated: 8/1/2026, 7:08:26 AM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3
4        if(s.length() != t.length()) return false;
5        
6        int[] freq = new int[26];
7
8        for(int i = 0; i < s.length(); i++){
9            freq[s.charAt(i) - 'a']++;
10            freq[t.charAt(i) - 'a']--;
11        }
12        
13        for(int count : freq){
14            if(count != 0) return false;
15        }
16        
17        return true;
18    }
19}