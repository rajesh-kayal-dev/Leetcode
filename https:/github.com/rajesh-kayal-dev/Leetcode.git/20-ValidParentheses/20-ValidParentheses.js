// Last updated: 6/15/2026, 10:03:34 AM
/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {

    const stack =[];
    const map = {
        ')':'(',
        '}':'{',
        ']':'[',
    }

    for(const c of s){

        if(map[c]){
            const topElement = stack.pop();

            if(topElement !== map[c]){
                return false;
            }
        }else{
                stack.push(c);
            }
    }
    
    return stack.length == 0;
    
};