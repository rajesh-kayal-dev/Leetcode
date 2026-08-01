// Last updated: 8/1/2026, 9:02:28 AM
1class Solution {
2    private static boolean compare(int[] a,int[] b){
3        for(int i = 0; i < a.length; i++){
4            if(a[i] != b[i]) return false;
5        }
6        return true;
7    }
8    public boolean checkInclusion(String s1, String s2) {
9
10        if(s1.length() > s2.length()) return false;
11
12        int[] freq1 = new int[26];
13        int[] freq2 = new int[26];
14        
15        for(char ch : s1.toCharArray()){
16            freq1[ch - 'a']++;
17        }
18
19        int window = s1.length();
20
21        for(int i = 0; i < s2.length(); i++){
22            freq2[s2.charAt(i) - 'a']++;
23
24            if(i >= window){
25                freq2[s2.charAt(i - window) - 'a']--;
26            }
27
28            if(compare(freq1, freq2)) return true;
29        }
30        
31        return false;
32    }
33}