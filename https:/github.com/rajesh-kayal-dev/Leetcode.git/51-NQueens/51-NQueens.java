// Last updated: 6/15/2026, 10:02:54 AM
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        
        for(int i = 0; i < n;i++){
            Arrays.fill(board[i],'.');
        }
        boolean[] cols = new boolean[n];//track column
        boolean[] digo = new boolean[2 * n - 1];//digonal (row - col)
        boolean[] AntiDigo = new boolean[2 * n -1];//AntiDigonal (row + col)

        backtrack(0,board, result, cols, digo, AntiDigo, n);
        return result;

    }
    private void backtrack(int row, char[][] board, List<List<String>> result, boolean[] cols, boolean[] digo,  boolean[] AntiDigo, int n)
    {
        if(row==n){
            result.add(buildBoard(board));
            return;
        }

        for(int col = 0; col < n; col++){
            int d = row - col + n - 1;
            int ad = row + col;

            if(cols[col] || digo[d] || AntiDigo[ad] ) continue;
            board[row][col]= 'Q';
            cols[col] = digo[d] = AntiDigo[ad] = true;

            backtrack(row + 1,board, result, cols, digo, AntiDigo, n);
            board[row][col]= '.';
            cols[col] = digo[d] = AntiDigo[ad] = false;
        }

    }

    private List<String> buildBoard(char[][] board){
        List<String> list = new ArrayList<>();
        for(char[] ch : board){
            list.add(new String(ch));
        }
        return list;
    }
}