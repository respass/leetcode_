package algorithms.java;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: respass
 * @Date: 2018
 */
public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {


        if (s == null || s.length() == 0 || t == null || t.length() == 0) return "";

        char[] target = t.toCharArray();
        char[] source = s.toCharArray();
        int[] count = new int[128];
        int targetCount = -t.length();
        for (char ch : target) {
            count[ch] -= 1;
        }

        int left = 0;
        int minSize = Integer.MAX_VALUE;
        int minHead = 0;

        for (int right = 0; right < source.length; right++) {
            char r = source[right];
            count[r] += 1;
            if (count[r] <= 0) targetCount++;

            if (targetCount == 0) {
                while (left <= right && targetCount == 0) {
                    //update min
                    if (right - left + 1 < minSize) {
                        minSize = Math.min(minSize, right - left + 1);
                        minHead = left;
                    }
                    //count-- left++
                    char l = source[left];
                    count[l] -= 1;
                    if (count[l] < 0) {
                        targetCount--;
                    }
                    left++;
                }
            }

        }
        return minSize == Integer.MAX_VALUE ? "" : s.substring(minHead, minHead + minSize);
    }



}
