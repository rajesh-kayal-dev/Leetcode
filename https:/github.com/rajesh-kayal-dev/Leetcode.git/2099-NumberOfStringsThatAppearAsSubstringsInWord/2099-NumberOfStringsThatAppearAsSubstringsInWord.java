// Last updated: 6/15/2026, 9:59:00 AM
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String s: patterns){
            if(word.indexOf(s) != -1){
                count++;
            }
        }
        return count;
    }
}