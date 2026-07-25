// Last updated: 7/25/2026, 10:15:45 AM
/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
let str = s.toLowerCase().replaceAll(/[^a-z0-9]/g,'');
let rev = str.split('').reverse().join('');
  return str === rev
        
};