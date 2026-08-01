// Last updated: 8/2/2026, 5:07:20 AM
1class Solution {
2    public int climbStairs(int n) {
3       if (n < 3) {
4            return n;
5        }
6
7        int a = 1;
8        int b = 2;
9
10        while (n-- > 2) {
11            int c = a + b;
12            a = b;
13            b = c;
14        }
15
16        return b;
17    }
18}