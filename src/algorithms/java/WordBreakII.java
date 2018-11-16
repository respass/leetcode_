package algorithms.java;

import java.util.*;

/**
 * @Author: respass
 * @Date: 2018
 */
public class WordBreakII {
    Map<String, List<String>> mem = new HashMap<>();
    public List<String> wordBreak(String s, List<String> wordDict) {

        return dfs(s, new HashSet<>(wordDict));
    }

    private List<String> dfs(String s, Set<String> wordDict) {
       if (mem.containsKey(s) ) {
           return mem.get(s);
       }

       List<String> ans = new ArrayList<>();
       if (wordDict.contains(s)) {
           ans.add(s);
       }

        for (int i = 1; i < s.length(); i++) {
            String right = s.substring(i);
            if (!wordDict.contains(right))
                continue;
            String left = s.substring(0, i);
            List<String> left_ans = dfs(left, wordDict);

            for(String s1 : left_ans) {
                ans.add(s1 + right);
            }
        }
        mem.put(s, ans);
        return ans;
    }
}
