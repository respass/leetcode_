package algorithms.java;

/**
 * @Author: respass
 * @Date: 2018
 */
public class DominoandTrominoTiling {
    public int numTilings(int N) {
        int kMod = 1000000007;
        long[][][] dp = new long[N+1][2][1];
        dp[0][0][0] = dp[1][0][0] = 1;
        for (int i = 2; i <= N; i++) {
            dp[i][0][0] = (dp[i-1][0][0] + dp[i-2][0][0]
                + 2 * dp[i-1][1][0]) % kMod;
            dp[i][1][0] = (dp[i-2][0][0] + dp[i-1][1][0]) % kMod;
        }
        return (int)dp[N][0][0];

    }

}
