// Last updated: 8/1/2026, 11:59:51 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashSet<Character> set = new HashSet<>();
4
5        int left = 0, right = 0, maxLength = 0;
6
7        while( right != s.length()){
8
9            char ch = s.charAt(right);
10
11            if(!set.contains(ch)){
12                set.add(ch);
13                maxLength = Math.max(maxLength, right - left +1);
14                right++;
15            }else{
16                set.remove(s.charAt(left));
17                left++;
18            }
19        }
20        return maxLength;
21        
22    }
23}