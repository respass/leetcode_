package algorithms.java;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: respass
 * @Date: 2018
 */
public class RomantoInteger {
    public int romanToInt(String s) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("I", 1);
        map1.put("V", 5);
        map1.put("X", 10);
        map1.put("L", 50);
        map1.put("C", 100);
        map1.put("D", 500);
        map1.put("M", 1000);
        map1.put("IV", 4);
        map1.put("IX", 9);
        map1.put("XL", 40);
        map1.put("XC", 90);
        map1.put("CD", 400);
        map1.put("CM", 900);


        int ans = 0;
        for (int i = 0; i < s.length();) {
            if (i + 1 < s.length()) {
                String str = s.substring(i, i+2);
                if (map1.containsKey(str)) {
                    ans += map1.get(str);
                    i += 2;
                    continue;
                }
            }
            ans += map1.get("" + s.charAt(i));
            i++;
        }
        return ans;
    }
}
