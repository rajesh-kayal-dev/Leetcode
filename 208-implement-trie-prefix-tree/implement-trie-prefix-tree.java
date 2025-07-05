class TrieNode {
    TrieNode[] children = new TrieNode[26]; // a to z
    boolean isEndOfWord = false;
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode(); // root is an empty node
    }

    // Inserts a word into the Trie
    public void insert(String word) {
        TrieNode node = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (node.children[index] == null) {
                node.children[index] = new TrieNode(); // create node if not exist
            }
            node = node.children[index];
        }

        node.isEndOfWord = true; // mark end of word
    }

    // Returns true if the word is in the Trie
    public boolean search(String word) {
        TrieNode node = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }

        return node.isEndOfWord;
    }

    // Returns true if there is any word that starts with the prefix
    public boolean startsWith(String prefix) {
        TrieNode node = root;

        for (char ch : prefix.toCharArray()) {
            int index = ch - 'a';

            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }

        return true; // prefix matched
    }
}
