package algorithms.java;

/**
 * @Author: respass
 * @Date: 2018
 */
public class DecodeWaysII {

    public int numDecodings(String s) {
        if (s == null || s.length() == 0)
            return 0;
        long[] dp = new long[2];
        dp[0] = 1;
        dp[1] = ways(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            long dp_i = ways(s.charAt(i)) * dp[1] + ways(s.charAt(i-1), s.charAt(i)) * dp[0];
            dp_i %= 1000000007;
            dp[0] = dp[1];
            dp[1] = dp_i;
        }
        return (int)dp[1];


    }

    private int ways(char c) {
        if (c == '0')
            return 0;
        if (c == '*')
            return 9;
        return 1;
    }

    private int ways(char c1, char c2) {
        if (c1 == '*' && c2 == '*')
            return 15;

        if (c1 == '*')
            return (c2 >= '0' && c2 <= '6') ? 2 : 1;
        else if (c2 == '*') {
            switch (c1) {
                case '1' : return 9;
                case '2' : return 6;
                default: return 0;
            }
        }else {
            int prefix = (c1 - '0') * 10 + (c2 - '0');
            return prefix >= 10 && prefix <= 26 ? 1 : 0;
        }
    }
}
