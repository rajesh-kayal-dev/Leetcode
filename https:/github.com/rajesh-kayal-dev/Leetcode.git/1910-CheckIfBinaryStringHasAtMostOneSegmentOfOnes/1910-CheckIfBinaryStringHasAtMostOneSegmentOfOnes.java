// Last updated: 6/15/2026, 9:59:11 AM
class Solution {
    public boolean checkOnesSegment(String s) {
        int n =s.length();
        for(int i =1;i<n;i++){
            if(s.charAt(i-1)=='0' && s.charAt(i)=='1')
            {
                return false;
            }
        }
        return true;
    }
}