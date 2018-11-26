package algorithms.java;

import java.util.Arrays;

/**
 * @Author: respass
 * @Date: 2018
 */
public class DistinctSubsequences {

    public int numDistinct(String s, String t) {

        int ls = s.length();
        int lt = t.length();
        int[][] dp = new int[lt+1][ls+1];
        Arrays.fill(dp[0], 1);
        for (int i = 1; i <= lt; i++) {
            for (int j = 1; j <= ls; j++) {
                if (t.charAt(i-1) == s.charAt(j-1)) {
                    dp[i][j] = dp[i][j-1] + dp[i-1][j-1];
                }else {
                    dp[i][j] = dp[i][j-1];
                }
            }
        }
        return dp[lt][ls];

    }
}
