package algorithms.java;

import com.sun.org.apache.xerces.internal.xs.ShortList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: respass
 * @Date: 2018
 */
public class DifferentWaysToAddParentheses {



    Map<String, List<Integer>> map = new HashMap<>();

    public List<Integer> diffWaysToCompute(String input) {
        if (map.containsKey(input))
            return map.get(input);


        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '-' ||
                input.charAt(i) == '+' ||
                input.charAt(i) == '*') {
                String a = input.substring(0, i);
                String b = input.substring(i+1);
                List<Integer> aRes = diffWaysToCompute(a);
                List<Integer> bRes = diffWaysToCompute(b);
                for(Integer a1 : aRes) {
                    for(Integer b1 : bRes) {
                        int c = 0;
                        switch (input.charAt(i)) {
                            case '+' : c = a1 + b1;
                            break;
                            case '-': c = a1 - b1;
                            break;
                            case '*' : c = a1 * b1;
                            break;
                        }
                        res.add(c);
                    }
                }
            }
        }
        if (res.size() == 0) {
            res.add(Integer.valueOf(input));
        }
        map.put(input, res);
        return res;

    }



}
