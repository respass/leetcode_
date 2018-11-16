package algorithms.java;

/**
 * @Author: respass
 * @Date: 2018
 */
public class FindSmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char target) {

       if (letters[letters.length-1] <= target) {
           return letters[0];
       }

        int l = 0, r = letters.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (letters[m] <= target) {
                l = m + 1;
            }else {
                r = m;
            }
        }
        return letters[l];
    }
}
