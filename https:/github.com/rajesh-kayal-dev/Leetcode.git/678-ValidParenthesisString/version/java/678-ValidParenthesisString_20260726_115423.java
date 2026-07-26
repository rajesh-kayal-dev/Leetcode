// Last updated: 7/26/2026, 11:54:23 AM
1class Solution {
2    public boolean checkValidString(String s) {
3        int cmin = 0;
4        int cmax = 0;
5        
6        for (int i = 0; i < s.length(); i++) {
7            char c = s.charAt(i);
8            
9            if (c == '(') {
10                cmin++;
11                cmax++;
12            } else if (c == ')') {
13                cmin = Math.max(0, cmin - 1);
14                cmax--;
15            } else { // c == '*'
16                cmin = Math.max(0, cmin - 1); // treat as ')'
17                cmax++; // treat as '('
18            }
19            
20            if (cmax < 0) {
21                return false;
22            }
23        }
24        
25        return cmin == 0;
26    }
27}