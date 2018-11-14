package algorithms.java;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: respass
 * @Date: 2018
 */
public class SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return 0;

        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0,1);
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (counts.containsKey(sum - k)) {
                ans += counts.get(sum - k);
            }

            counts.put(sum, counts.getOrDefault(sum, 0) + 1);

        }

        return ans;
    }
}
