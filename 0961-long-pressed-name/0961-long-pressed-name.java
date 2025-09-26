class Solution {
    public boolean isLongPressedName(String s1, String s2) {

        int i = 0, j=0;
        while(i < s1.length() && j <s2.length()){
            char ch1= s1.charAt(i);
            char ch2= s2.charAt(j);
            if(ch1 == ch2){
                i++;j++;
            }else if(i > 0 && ch2==s1.charAt(i-1)){
                j++;
            }else{
                return false;
            }
        }

        if(i<s1.length()) return false;
        
        while(j<s2.length()){
            if(s2.charAt(j) != s1.charAt(i-1)) return false;
            j++;
        }
        return true;
    }
}