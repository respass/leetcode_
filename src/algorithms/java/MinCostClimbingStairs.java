package algorithms.java;

import java.util.Arrays;

/**
 * @Author: respass
 * @Date: 2018
 */
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = cost[0];
        for (int i = 1; i < cost.length; i++) {
            dp[i] = Math.min(dp[i-1] ,
                  (i > 1 ? dp[i-2] : 0)) + cost[i];
        }

        return Math.min(dp[cost.length-1], dp[cost.length-2]);

    }
}
