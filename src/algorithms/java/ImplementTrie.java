package algorithms.java;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: respass
 * @Date: 2019
 */
public class ImplementTrie {


    class Trie {

        class TrieNode {
            Map<Integer, TrieNode> children;
            boolean isWord;

            TrieNode() {
                children = new HashMap<>();
            }
        }

        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            TrieNode curr = root;
            for (char ch : word.toCharArray()) {
                int key = ch - 'a';
                if(!curr.children.containsKey(key)) {
                    // create new child node if doesn't exsit
                    curr.children.put(key, new TrieNode());
                }

                curr = curr.children.get(key);
            }
            curr.isWord = true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            TrieNode curr = root;
            for (char ch : word.toCharArray()) {
                int key = ch - 'a';
                if(!curr.children.containsKey(key)) {
                    return false;
                }
                curr = curr.children.get(key);
            }
            return curr.isWord;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            TrieNode curr = root;
            for (char ch : prefix.toCharArray()) {
                int key = ch - 'a';
                if(!curr.children.containsKey(key)) {
                    return false;
                }
                curr = curr.children.get(key);
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
}
