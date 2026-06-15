// Last updated: 6/15/2026, 10:02:20 AM
/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let maxProfit = 0;
    let min = prices[0];

    for(let i = 0; i < prices.length; i++){
        if(prices[i] < min)min = prices[i];
            let profit = prices[i] - min;
         maxProfit = Math.max(profit, maxProfit);
        
    }
    return maxProfit;
};