// Last updated: 7/25/2026, 10:59:43 AM
/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var rotate = function(matrix) {
    
    //Transpose matrix

    for(let i = 0 ; i < matrix.length; i++){
        for(let j = i + 1 ; j < matrix.length; j++){
            [matrix[i][j], matrix[j][i]] = [matrix[j][i], matrix[i][j]]
        }
    }

    //Reverse Matrix
    for(let row of matrix){
        row.reverse();
    }

};