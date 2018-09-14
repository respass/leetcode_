package algorithms.java;

/**
 * @Author: respass
 * @Date: 2018
 */
public class MaximumProductSubarray {

    public int maxProduct(int[] nums) {

        int premax = nums[0];
        int premin = nums[0];
        int res = premax;
        for (int i = 1; i < nums.length; i++) {

            int max = Math.max(nums[i], Math.max(premax * nums[i], premin * nums[i]));
            int min = Math.min(nums[i], Math.min(premin * nums[i], premax * nums[i]));
            res = Math.max(res, Math.max(max, min));

            premax = max;
            premin = min;

        }
        return res;
    }

}
