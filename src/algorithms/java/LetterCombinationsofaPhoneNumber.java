package algorithms.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: respass
 * @Date: 2018
 */
public class LetterCombinationsofaPhoneNumber {

    public static Map<Character, String> map = new HashMap<>();
    static {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {



        List<String> ans = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return ans;
        }


        String cur = map.get(digits.charAt(0));

        if (digits.length() == 1) {
            for (int i = 0; i < cur.length(); i++) {
                ans.add("" + cur.charAt(i));
            }
            return ans;
        }

        List<String> right = letterCombinations(digits.substring(1));

        for (int i = 0; i < cur.length(); i++) {
            for (String s : right) {
                ans.add(cur.charAt(i) + s);
            }
        }

        return ans;


    }
}
