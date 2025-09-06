/**
 * @param {string} s
 * @return {boolean}
 */
var areOccurrencesEqual = function(s) {
    let arr = Array(128).fill(0);

    for(let i = 0; i < s.length;i++){
        let idx = s.charCodeAt(i);
        arr[idx] += 1;
    }
    
 

    let freq = new Set();
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] > 0) {
            freq.add(arr[i]);
        }
    }

    // If all frequencies are same, set size = 1
    return freq.size === 1;


};