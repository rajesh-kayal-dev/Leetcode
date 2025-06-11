class Solution {
    public String decodeString(String s) {
        Stack<String> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        String currentStr = "";
        int num = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Make full number (for multi-digit like 12, 23)
                num = num * 10 + (ch - '0');
            } else if (ch == '[') {
                // Push current number and string
                numStack.push(num);
                strStack.push(currentStr);
                // Reset for next level
                num = 0;
                currentStr = "";
            } else if (ch == ']') {
                // Pop number and previous string
                int repeat = numStack.pop();
                String prevStr = strStack.pop();
                // Repeat and combine
                StringBuilder temp = new StringBuilder(prevStr);
                for (int i = 0; i < repeat; i++) {
                    temp.append(currentStr);
                }
                currentStr = temp.toString();
            } else {
                // Add character to current part
                currentStr += ch;
            }
        }

        return currentStr;
    }
}
