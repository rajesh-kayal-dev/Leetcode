class Solution {
    public int lengthOfLongestSubstring(String s) {
        int right=0;
        int left=0;
        int maxLen=0;
        Set<Character> set = new HashSet<>();//for uniqe number
        //right se loop start karo
        for(right = 0;right < s.length();right++){
            //agar right mai kohi character repeat ho raha hai to left se remove karo and left ko age badhao

            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            //set mai right se add karo
            set.add(s.charAt(right)); //a b c 

            //maxLength update karo
            maxLen = Math.max(maxLen,right - left +1);
            // Example:(a,b,c,d,e) left = 0, right = 2 → length = 2 - 0 + 1 = 3(a,b,c)
        }
        return maxLen;
    }
}
