// Last updated: 7/28/2026, 10:18:40 AM
1/**
2 * @param {number[]} coins
3 * @param {number} amount
4 * @return {number}
5 */
6var coinChange = function(coins, amount) {
7    let dp = new Array(amount + 1).fill(amount + 1);
8
9    dp[0] =0;
10
11    for(let i  = 1; i <= amount; i ++){
12        for(let coin of coins){
13            if(coin <= i){
14                dp[i] = Math.min(dp[i], dp[i - coin]+ 1);
15            }
16        }
17    }
18
19    return dp[amount] > amount ? -1 : dp[amount];
20    
21};