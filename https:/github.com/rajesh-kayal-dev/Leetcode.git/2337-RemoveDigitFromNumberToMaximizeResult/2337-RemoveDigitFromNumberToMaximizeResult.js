// Last updated: 7/25/2026, 10:13:44 AM
/**
 * @param {string} number
 * @param {character} digit
 * @return {string}
 */
var removeDigit = function(number, digit) {
let max = -Infinity;
    for(let i = 0;i <number.length; i++){
        if(number[i]===digit){
            let temp=number.slice(0,i) + number.slice(i+1)
                if(temp > max){
                    max= temp;
                }
        }
    }
    return max;
};