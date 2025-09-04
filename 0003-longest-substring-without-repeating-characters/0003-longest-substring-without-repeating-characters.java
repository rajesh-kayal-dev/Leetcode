class Solution {
    public int lengthOfLongestSubstring(String s) {
        int right = 0;
        int left = 0;
        int maxLen= 0;

        HashSet<Character> set = new HashSet<>();

    for(right = 0 ; right < s.length();right++){

        //check duplicate and remove left move left
        while(set.contains(s.charAt(right))){
            set.remove(s.charAt(left));
            left++;
        }
        set.add(s.charAt(right));
        maxLen=Math.max(maxLen, right - left + 1);
        //right 2 - left 0 + 1 = 3 (a,b,c)

    }
    return maxLen;
    }
}