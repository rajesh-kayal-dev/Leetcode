// Last updated: 7/15/2026, 9:13:22 PM
/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    return s.split("").sort().join("") === t.split("").sort().join("");
};