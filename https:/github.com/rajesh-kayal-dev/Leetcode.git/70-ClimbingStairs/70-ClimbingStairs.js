// Last updated: 7/25/2026, 10:59:34 AM
/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    if(n === 0 || n === 1) return 1;

    let prev = 1;
    let next = 1;
    let current = 0;

    for(let i = 2; i <= n; i++){
        current = prev + next;
        next = prev;
        prev = current;
    }

    return current;
};