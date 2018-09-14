package algorithms.java;

/**
 * @Author: respass
 * @Date: 2018
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int preMax = nums[0];
        int res = preMax;
        for(int i = 1; i < nums.length; i++) {
            int max = Math.max(nums[i], preMax + nums[i]);
            preMax = max;

            res = Math.max(res, max);

        }
        return res;
    }
}
