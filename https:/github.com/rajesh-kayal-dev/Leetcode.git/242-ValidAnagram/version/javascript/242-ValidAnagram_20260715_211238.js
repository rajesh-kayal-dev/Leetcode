// Last updated: 7/15/2026, 9:12:38 PM
1/**
2 * @param {string} s
3 * @param {string} t
4 * @return {boolean}
5 */
6var isAnagram = function(s, t) {
7    //sort s and t check length cset each carcter then return true
8
9    s = s.split('').sort().join('');
10    t = t.split('').sort().join('');
11
12    if(s.length !== t.length) return false;
13
14    for(let i = 0;i < s.length; i++){
15        if(s[i] != t[i]) return false;
16    }
17
18    return true;
19};