class Solution {
    public boolean isAnagram(String s, String t) {

        //check both string length same or not
        if(s.length() != t.length()){
            return false;
        }

        //take an array to store a-z(26) letters
        int [] count = new int[26];

        //increment string s character
        for(int i = 0; i < s.length();i++){
            count[s.charAt(i) - 'a']++;
        }

        //decrement string s character
        for(int i = 0; i< t.length();i++){
            count[t.charAt(i) - 'a']--;
        }

        //check if all count is 0 then anagram
        for(int i = 0;i<count.length;i++){
            if(count[i] != 0){
                return false;
            }
        }

        return true; //strings are anagram
    }
}
