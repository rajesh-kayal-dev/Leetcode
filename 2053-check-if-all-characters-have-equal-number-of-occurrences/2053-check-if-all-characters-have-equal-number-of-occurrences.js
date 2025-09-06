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
    
    let freq = 0;

    for(let i = 0; i < arr.length;i++){
        if(arr[i] > 0){
            if(freq === 0){
                freq = arr[i];
            }else if (arr[i] !== freq){
             return false;
        }
    }
    }

 return true;


};