// Last updated: 7/24/2026, 11:32:19 AM
1/**
2 * @param {string} number
3 * @param {character} digit
4 * @return {string}
5 */
6var removeDigit = function(number, digit) {
7let max = -Infinity;
8    for(let i = 0;i <number.length; i++){
9        if(number[i]===digit){
10            let temp=number.slice(0,i) + number.slice(i+1)
11                if(temp > max){
12                    max= temp;
13                }
14        }
15    }
16    return max;
17};