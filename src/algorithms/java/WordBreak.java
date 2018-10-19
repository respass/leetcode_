package algorithms.java;

import java.util.*;

/**
 * @Author: respass
 * @Date: 2018
 */
public class WordBreak {


    public boolean wordBreak(String s, List<String> wordDict) {
        Map<String, Boolean> map = new HashMap<>();
        return dfs(s, map, new HashSet<>(wordDict));
    }

    private boolean dfs(String s, Map<String, Boolean> map, Set<String> wordDict) {
        if (map.containsKey(s)) {
            return map.get(s);
        }

        if (wordDict.contains(s)) {
            map.put(s, true);
            return true;
        }

        boolean res = false;
        for (int i = 1; i < s.length(); i++) {
            res = res ||
                    (dfs(s.substring(0,i), map, wordDict) && dfs(s.substring(i), map, wordDict));
            if (res){
                map.put(s, true);
                return true;
            }
        }
        map.put(s, res);
        return res;
    }

}
