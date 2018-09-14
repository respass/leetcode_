package algorithms.java;

import java.util.Arrays;

/**
 * @Author: respass
 * @Date: 2018
 */
public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {

        if(nums == null || nums.length == 0) {
            return 0;
        }


        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        int res = 1;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], 1 + dp[j]);
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }

}
