class WordDictionary {
        private class TrieNode{
            TrieNode[] children = new TrieNode[26];
            boolean isWord = false;
        }
        private final TrieNode root;
    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode node = root;
        for(char ch : word.toCharArray()){
            int idx = ch - 'a';
            if(node.children[idx] == null){
                node.children[idx] = new TrieNode();
            }
            node = node.children[idx];
        }
        node.isWord = true;
        
    }
    
    public boolean search(String word) {
        return searchIndexNode(word, 0, root);
    }

    private boolean searchIndexNode(String word, int index, TrieNode node){
        if(index == word.length()){
            return node.isWord;
        }

        char ch = word.charAt(index);
        if( ch == '.'){
            for(TrieNode child : node.children){
                if( child != null && searchIndexNode(word, index + 1, child)){
                    return true;
                }
            }
            return false;
        }else{
                int idx = ch -'a';
                TrieNode next = node.children[idx];
                if(next == null) return false;

                return searchIndexNode(word, index + 1, next);
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */