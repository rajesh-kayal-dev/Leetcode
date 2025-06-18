class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // Opening brackets ko push karo
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Closing bracket ke liye check karo
            else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Agar end mein stack empty hai to valid
        return stack.isEmpty();
    }
}