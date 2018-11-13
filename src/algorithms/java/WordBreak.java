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
                    (wordDict.contains(s.substring(i)) && dfs(s.substring(0,i), map, wordDict));
            if (res){
                map.put(s, true);
                return true;
            }
        }
        map.put(s, res);
        return res;
    }


//    public boolean wordBreak(String s, List<String> wordDict) {
//        if(s == null || s.length() == 0)
//            return false;
//
//        Set<String> set = new HashSet(wordDict);
//        int len = s.length();
//        boolean[] dp = new boolean[len];
//
//        for(int i = 0; i < len; i++) {
//            for(int j = 0; j <= i; j++) {
//                String sub = s.substring(j, i+1);
//                if(set.contains(sub) && (j == 0 || dp[j-1] == true)) {
//                    dp[i] = true;
//                    break;
//                }
//            }
//        }
//        return dp[len-1];
//    }

}
