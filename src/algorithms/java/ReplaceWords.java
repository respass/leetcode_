package algorithms.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: respass
 * @Date: 2019
 */
public class ReplaceWords {

    public String replaceWords(List<String> dict, String sentence) {
        StringBuilder ans = new StringBuilder();
        String[] arr = sentence.split(" ");
        Trie trie = new Trie();

        for (String s : dict) {
            trie.insertWord(s);
        }

        for (int i = 0; i < arr.length; i++) {
            ans.append(trie.getShort(arr[i])).append(" ");
        }

        return ans.substring(0, ans.length() - 1);
    }

    class TrieNode {
        boolean isWord;
        Map<Character, TrieNode> child;

        public TrieNode() {
            isWord = false;
            child = new HashMap<>();
        }
    }

    class Trie{
        TrieNode root;
        Trie() {
            root = new TrieNode();
        }

        public void insertWord(String word) {
            TrieNode cur = root;
            for (int i = 0; i < word.length(); i++) {
                if (!cur.child.containsKey(word.charAt(i))) {
                    cur.child.put(word.charAt(i), new TrieNode());
                }
                cur = cur.child.get(word.charAt(i));

            }
            cur.isWord = true;
        }

        public String getShort(String word) {
            StringBuilder ans = new StringBuilder();
            TrieNode cur = root;
            for (int i = 0; i < word.length(); i++) {
              if (cur.child.containsKey(word.charAt(i))) {
                  ans.append(word.charAt(i));
                  cur = cur.child.get(word.charAt(i));
                  if (cur.isWord) {
                    return ans.toString();
                  }
              }else {
                  return word;
              }
            }
            return word;
        }
    }










}
