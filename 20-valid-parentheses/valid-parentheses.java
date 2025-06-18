class Solution {
    public boolean isValid(String s) {
       Stack <Character> stack = new Stack<>();

       for(char ch : s.toCharArray()){
            //push opening brackets
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()) return false;

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
       }
       //if stack is empty at the end then valid
       return stack.isEmpty(); //true
    }
}
