// Last updated: 6/15/2026, 10:03:28 AM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();
                if(ch == ')' && top != '('){
                    return false;
                }
                if(ch == ']' && top != '['){
                    return false;
                }
                if(ch == '}' && top != '{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}