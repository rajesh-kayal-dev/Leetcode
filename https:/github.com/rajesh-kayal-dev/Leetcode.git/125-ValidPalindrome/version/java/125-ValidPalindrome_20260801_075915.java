// Last updated: 8/1/2026, 7:59:15 AM
1class Solution {
2    private static char lowerCase(char ch){
3        if(ch >= 'A' && ch <= 'Z'){
4            return (char)(ch + 32); // 97 -> a
5        }
6        return ch;
7    }
8    private static boolean isAlphaNumaric(char ch){
9        if(ch >= 'a' && ch <= 'z') return true;
10        if(ch >= 'A' && ch <= 'Z') return true;
11        if(ch >= '0' && ch <= '9') return true;
12        return false;
13    }
14    public boolean isPalindrome(String s) {
15        int left = 0 , right = s.length() -1;
16
17        while(left < right){
18
19            //skip all alphanumaric character
20           while(left < right && !isAlphaNumaric(s.charAt(left))) {
21            left++;
22           }
23           while(left < right && !isAlphaNumaric(s.charAt(right))){
24            right--;
25           } 
26
27            //cmopare lowercase
28            if(lowerCase(s.charAt(left)) != lowerCase(s.charAt(right))) return false;
29
30            left++;
31            right--;
32        }
33        return true;
34    }
35}