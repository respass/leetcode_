package algorithms.java;

/**
 * @Author: respass
 * @Date: 2019
 */
public class MagicDictionary {

    class TrieNode {
        char c;
        TrieNode[] child;
        boolean isWord;

        public TrieNode(char v) {
            c = v;
            child = new TrieNode[26];
            isWord = false;
        }
    }

    TrieNode root;

    /** Initialize your data structure here. */
    public MagicDictionary() {
        root = new TrieNode(' ');
    }

    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {
        for (String word : dict) {
            TrieNode cur = root;
            for (int i = 0; i < word.length(); i++) {
                if (cur.child[word.charAt(i) - 'a'] == null) {
                    cur.child[word.charAt(i) - 'a'] = new TrieNode(word.charAt(i));
                }
                cur = cur.child[word.charAt(i) - 'a'];
            }
            cur.isWord = true;
        }
    }

    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {

        return dfs(word, 0, 0, root);
    }

    private boolean dfs(String word, int cur, int dff, TrieNode node) {
        if (cur == word.length()) {
            return dff == 1 && node.isWord;
        }


        if (dff > 1) {
            return false;
        }


        char c = word.charAt(cur);




        for (int i = 0; i < 26; i++) {
            if (node.child[i] != null &&
                    dfs(word, cur+1, word.charAt(cur) - 'a' == i? dff : dff+1, node.child[i])){
                return true;
            }
        }


        return false;

    }
}