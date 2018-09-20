package algorithms.java;

import java.util.Arrays;

/**
 * @Author: respass
 * @Date: 2018
 */
public class TargetSum {

    public int findTargetSumWays(int[] nums, int S) {

        int[][] memo = new int[nums.length][1004];
        for (int[] row : memo) {
            Arrays.fill(row, Integer.MIN_VALUE);
        }
        return dfs(nums, 0, S, memo);
    }

    public int dfs(int[] nums, int cur, int S, int[][] memo) {


        if (cur >= nums.length ) {
            if (S == 0) {
                return 1;
            }
            return 0;
        }

        if (memo[cur][S] != Integer.MIN_VALUE) {
            return memo[cur][S];
        }

        return  memo[cur][S] = dfs(nums, cur+1, S-nums[cur], memo) +
                dfs(nums, cur+1, S+nums[cur], memo) ;
    }

}
