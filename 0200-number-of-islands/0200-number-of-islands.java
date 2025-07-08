class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid[0].length == 0) return 0;
        
        int count = 0;
        int row = grid.length;
        int col = grid[0].length;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col ;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid,int row,int col){

        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] != '1'){
            return;
        }
        grid[row][col]= '0';

        // Visit all 4 directions
        dfs(grid, row - 1, col); // up
        dfs(grid, row + 1, col); // down
        dfs(grid, row, col - 1); // left
        dfs(grid, row, col + 1); // right

    }
}