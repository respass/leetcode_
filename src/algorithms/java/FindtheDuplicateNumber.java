package algorithms.java;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: respass
 * @Date: 2018
 */
public class FindtheDuplicateNumber {

    public int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }

        return -1;
    }
}
