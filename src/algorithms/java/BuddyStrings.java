package algorithms.java;

import java.util.*;

/**
 * @Author: respass
 * @Date: 2018
 */
public class BuddyStrings {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }


        if (A.equals(B)) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < A.length(); i++) {
                set.add(A.charAt(i));
            }

            return set.size() < A.length();

        }

        List<Integer> dif = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                dif.add(i);
            }
        }

        return dif.size() == 2 && A.charAt(dif.get(0)) == B.charAt(dif.get(1))
                && A.charAt(dif.get(1)) == B.charAt(dif.get(0));


    }
}
