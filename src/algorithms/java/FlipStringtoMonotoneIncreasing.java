package algorithms.java;

/**
 * @Author: respass
 * @Date: 2018
 */
public class FlipStringtoMonotoneIncreasing {
    public int minFlipsMonoIncr(String S) {

        int len = S.length();
        int dp0 = 0;
        int dp1 = 0;
        for (int i = 1; i <= len; i++) {
            int temp0 = dp0 + (S.charAt(i-1) == '1' ? 1 : 0);
            dp1 = Math.min(dp0, dp1) + (S.charAt(i-1) == '0' ? 1 : 0);
            dp0 = temp0;
        }
        return Math.min(dp0, dp1);

    }
}
