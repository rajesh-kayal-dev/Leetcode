// Last updated: 8/2/2026, 6:41:31 AM
1class Solution {
2    public int numDecodings(String s) {
3
4        if(s.length() == 1){
5            if(s.charAt(0) == '0'){
6                return 0;
7            }else{
8                return 1;
9            }
10        }
11
12        int N = s.length();
13
14        int[] dp = new int[s.length() + 1];
15
16        dp[N] = 1;
17
18        for(int idx = N -1; idx >= 0; idx--){
19            if(s.charAt(idx) == '0'){
20                dp[idx] = 0;
21            }else{
22              dp[idx] =  dp[idx + 1];
23            if(idx < s.length() -1 && Integer.parseInt(s.substring(idx, idx + 2)) <= 26 ){
24                dp[idx] += dp[idx +2];
25            }
26            }
27
28        }
29        return dp[0];
30        
31    }
32}