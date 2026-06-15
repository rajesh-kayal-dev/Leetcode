// Last updated: 6/15/2026, 10:00:32 AM
class Solution {
    public String decodeString(String s) {
        Deque<StringBuilder> sbStack = new ArrayDeque<>();
        Deque<Integer> numStack = new ArrayDeque<>();

        StringBuilder currSb = new StringBuilder();
        int currNum = 0;

        for (Character c : s.toCharArray()) {
            if (c == ']') {
                StringBuilder popped = sbStack.pop();
                int size = numStack.pop();
                for (int i = 0; i < size; i++) {
                    popped.append(currSb);
                }
                
                currSb = popped;
            } else if (c == '[') {
                numStack.push(currNum);
                currNum = 0;
            } else if (Character.isDigit(c)) {
                if (currNum == 0) {
                    sbStack.push(currSb);
                    currSb = new StringBuilder();
                }
                
                currNum = currNum * 10 + (c - '0');
            } else {
                currSb.append(c);
            }
        }

        return currSb.toString();
    }
}
