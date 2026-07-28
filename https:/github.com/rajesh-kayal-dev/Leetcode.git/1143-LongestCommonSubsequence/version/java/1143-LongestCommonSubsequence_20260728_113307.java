// Last updated: 7/28/2026, 11:33:07 AM
1class Solution {
2    private static int m, n;
3    private int[][] memo;
4    public int longestCommonSubsequence(String s1, String s2) {
5        int m = s1.length();
6        int n = s2.length();
7
8        memo = new int[m][n];
9        for(int[] row : memo){
10            Arrays.fill(row, -1);
11        }
12
13        return solve(s1, s2, 0, 0);
14    }
15
16    private int solve(String s1, String s2, int i, int j){
17        if(i >= s1.length() || j >= s2.length()) return 0;
18
19        if (memo[i][j] != -1) {
20            return memo[i][j];
21        }
22        if(s1.charAt(i) == s2.charAt(j)){
23            return memo[i][j] = 1 + solve(s1, s2, i + 1, j + 1);
24        }
25
26        return memo[i][j] = Math.max(solve(s1, s2, i+1, j), solve(s1, s2 , i , j+1));
27    }
28
29}