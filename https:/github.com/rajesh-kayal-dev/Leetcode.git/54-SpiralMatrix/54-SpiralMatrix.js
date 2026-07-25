// Last updated: 7/25/2026, 10:59:38 AM
/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var spiralOrder = function(matrix) {
    let ans =[];

    let top = 0;
    let bottom = matrix.length - 1;

    let left = 0;
    let right = matrix[0].length - 1;

    while(top <= bottom && left <= right){
    //top row
    for(let i = left; i <= right; i++){
        ans.push(matrix[top][i]);
    }
    top++;

    //right column
    for(let i = top; i <= bottom; i++){
        ans.push(matrix[i][right]);
    }
    right--;

    //bottom row
    if(top <= bottom){
    for(let i = right; i >= left; i--){
        ans.push(matrix[bottom][i]);
    }
    bottom--;
    }

    //left column
    if(left <= right){
    for(let i = bottom; i >= top; i--){
        ans.push(matrix[i][left]);
    }
    left++;
    }
    }

    return ans;
    
};