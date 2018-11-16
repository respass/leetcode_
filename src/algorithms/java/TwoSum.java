package algorithms.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author: respass
 * @Date: 2018
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int l = 0, r = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x)) {
                l = map.get(x);
                r = i;
                break;
            }
            map.put(nums[i], i);
        }
        return new int[]{l, r};
    }
}
