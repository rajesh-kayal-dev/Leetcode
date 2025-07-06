class Trie {

    private class TriseNode{
         TriseNode[] children = new TriseNode[26];  //26 lowercase letter
         boolean isEndOfWord = false;
    }

    private final TriseNode root;

    public Trie(){
        root = new TriseNode();
    }
    
    public void insert(String word) {
        TriseNode node = root;
        for(char ch : word.toCharArray()){
            int index = ch - 'a';
            if(node.children[index] == null) {
                node.children[index] = new TriseNode(); // create node if missing
            }
           node = node.children[index];
        }
        node.isEndOfWord = true;
    }
    
    public boolean search(String word) {
        TriseNode node = root;
        for(char ch : word.toCharArray()){
            int index = ch - 'a';
            if(node.children[index] == null) return false;
           node = node.children[index];
        }
        return node.isEndOfWord;
    }
    
    public boolean startsWith(String prefix) {
        TriseNode node = root;
        for(char ch : prefix.toCharArray()){
            int index = ch - 'a';
            if(node.children[index] == null) return false;
           node = node.children[index];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */