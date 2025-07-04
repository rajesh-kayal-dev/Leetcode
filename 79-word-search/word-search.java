class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int cols = board[0].length;

        for(int i = 0;i < row;i++){
            for(int j = 0; j < cols;j++){
                if(dfs(board, word, i, j,0)) return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int row, int col,int index){
        if(index == word.length()) return true;//word complete

        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length || 
        board[row][col] != word.charAt(index)) return false;

        char temp = board[row][col];
        board[row][col]='#';

        boolean found = dfs(board, word, row - 1, col, index + 1) || //up
                        dfs(board, word, row + 1, col, index + 1) || //down
                        dfs(board, word, row, col - 1, index + 1) || //left
                        dfs(board, word, row, col + 1, index + 1) ;  //right

        board[row][col] = temp;

        return found;
    }
}