// Last updated: 7/25/2026, 10:59:31 AM
/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var setZeroes = function(matrix) {

    let rows = new Set();
    let cols = new Set();
    let m = matrix.length;
    let n = matrix[0].length;

    //finds all zero
    for(let i = 0 ; i < m; i++){
        for(let j = 0 ; j < n; j++){
            if(matrix[i][j] === 0){
                rows.add(i);
                cols.add(j);
            }
        }
    }

    //make rows zero
    for(let row of rows){
        for(let i = 0 ; i < n; i++){
            matrix[row][i]=0;
        }
    }

    //make cols zero
        for(let col of cols){
        for(let i = 0 ; i < m; i++){
            matrix[i][col]=0;
        }
    }

    
};