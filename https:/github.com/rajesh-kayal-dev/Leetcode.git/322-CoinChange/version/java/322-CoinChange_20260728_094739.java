// Last updated: 7/28/2026, 9:47:39 AM
1import java.util.Arrays;
2
3class Solution {
4    public int coinChange(int[] coins, int amount) {
5        // dp[i] will store the minimum coins needed to make amount 'i'
6        int[] dp = new int[amount + 1];
7        
8        // Fill array with a value larger than any possible answer (amount + 1 acts as infinity)
9        Arrays.fill(dp, amount + 1);
10        
11        // Base case: 0 coins are needed to make amount 0
12        dp[0] = 0;
13
14        // Build up the answer for all amounts from 1 to 'amount'
15        for (int i = 1; i <= amount; i++) {
16            for (int coin : coins) {
17                if (coin <= i) {
18                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
19                }
20            }
21        }
22
23        // If dp[amount] wasn't updated, it means it's impossible to make that amount
24        return dp[amount] > amount ? -1 : dp[amount];
25    }
26}