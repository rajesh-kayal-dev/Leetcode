class Solution {
    public void solve(char[][] board) {
        if( board == null || board.length == 0) return;

        int rows = board.length;
        int cols = board[0].length;

        for(int i = 0; i < rows; i++){
            dfs(board, i , 0);//first column
            dfs(board, i , cols - 1);//last column
        }

        for(int j = 0; j < cols; j++){
            dfs(board, 0 , j);//first row
            dfs(board, rows - 1 , j);//last row
        }

        for(int i = 0;i < rows; i++){
            for(int j = 0; j < cols;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }else if(board[i][j] == 'T'){
                    board[i][j]='O';
                }
            }
        }
    }

    private void dfs(char board[][], int i, int j){
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O'){
            return;
        }
        board[i][j]='T';

        dfs(board, i - 1, j);
        dfs(board, i + 1, j);
        dfs(board, i , j - 1);
        dfs(board, i , j + 1);
    }
}