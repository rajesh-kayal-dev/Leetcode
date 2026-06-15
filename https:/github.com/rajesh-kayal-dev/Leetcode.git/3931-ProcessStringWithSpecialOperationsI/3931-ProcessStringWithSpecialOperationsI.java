// Last updated: 6/15/2026, 9:59:01 AM
class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(Character.isLowerCase(ch)){
                result.append(ch); //if letter lowercase insert into result
            }else if(ch == '*'){
                if(result.length() > 0){
                    result.deleteCharAt(result.length() - 1); //if * remove last
                }
            }else if(ch == '#'){
                result.append(result.toString());//if # copy whole string
            }else if(ch == '%'){
                result.reverse();
            }
        }

        return result.toString();
    }
}