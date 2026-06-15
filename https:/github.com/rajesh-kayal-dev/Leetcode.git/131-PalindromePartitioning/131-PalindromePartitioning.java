// Last updated: 6/15/2026, 10:02:05 AM
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> current = new ArrayList<>();
        backtrack(0,s,current,result);
        return result;
    }
    private void backtrack(int start, String s, List<String> current, List<List<String>> result)
    {
        if(start == s.length()){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i = start;i < s.length(); i++){
            String substring = s.substring(start, i + 1);

            if(isPalindrome(substring)){
                current.add(substring);
                backtrack(i + 1, s, current, result);
                current.remove(current.size() - 1);
            }
        }
    }
    private boolean isPalindrome(String s){
        int left = 0,right = s.length() - 1;

        while(left < right){
            if(s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}