// Last updated: 8/1/2026, 6:56:19 AM
1/**
2 * @param {string} s
3 * @param {string} t
4 * @return {boolean}
5 */
6var isAnagram = function(s, t) {
7    //sort s and t check length cset each carcter then return true
8
9    if(s.length != t.length) return 0;
10
11   s=s.split('').sort().join();
12   t=t.split('').sort().join();
13
14   return s != t ? false : true;
15
16    // return s.split("").sort().join("") === t.split("").sort().join("");
17};