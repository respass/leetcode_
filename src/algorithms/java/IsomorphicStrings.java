package algorithms.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author: respass
 * @Date: 2019
 */
public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (!map.containsKey(a)) {
                if (map.containsValue(b)) {
                    return false;
                }
                map.put(a, b);
            }else {
                if (b != map.get(a)){
                    return false;
                }
            }
        }
        return true;
    }
}
