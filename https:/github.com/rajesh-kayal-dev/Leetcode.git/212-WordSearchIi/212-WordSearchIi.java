// Last updated: 6/15/2026, 10:01:19 AM
class Solution {
    class TrieNode{
        TrieNode[] children = new TrieNode[26];
        String word = null;
    }

    private TrieNode buildTree(String [] words){
        TrieNode root = new TrieNode();
        for(String word : words){
            TrieNode node = root;
            for(char ch : word.toCharArray()){
                int idx = ch - 'a';
                if(node.children[idx] == null){
                    node.children[idx] = new TrieNode();
                }
                node = node.children[idx];
            }
            node.word = word;
        }
        return root;
    }
    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        TrieNode root = buildTree(words);

        int row = board.length, col = board[0].length;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                dfs(board, i, j, root, result);
            }
        }
        return result;
    }
    private void dfs(char[][] board, int i, int j, TrieNode node, List<String> result) {
        char c = board[i][j];

        // base case: visited or not a word path
        if(c == '#' || node.children[c - 'a'] == null) return;

        node = node.children[c - 'a'];

        // if we found a word
        if(node.word != null) {
            result.add(node.word);
            node.word = null;  // avoid duplicates
        }

        board[i][j] = '#';  // mark visited

        // 4 directions: up, down, left, right
        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
        for(int[] dir : dirs) {
            int newRow = i + dir[0], newCol = j + dir[1];
            if(newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board[0].length) {
                dfs(board, newRow, newCol, node, result);
            }
        }

        board[i][j] = c; // backtrack
    }
}
