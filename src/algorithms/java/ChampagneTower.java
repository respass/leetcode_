package algorithms.java;

import java.util.Arrays;

/**
 * @Author: respass
 * @Date: 2018
 */
public class ChampagneTower {
//    public double champagneTower(int poured, int query_row, int query_glass) {
////        int k = 100;
////        double[][] dp = new double[k][k];
////        dp[0][0] = poured;
////        for (int i = 0; i < k - 1; i++) {
////            for (int j = 0; j <= i; j++) {
////                if (dp[i][j] > 1) {
////                    dp[i+1][j] += (dp[i][j] - 1) / 2.0;
////                    dp[i+1][j+1] += (dp[i][j] - 1) / 2.0;
////                }
////            }
////        }
////        return Math.min(1.0, dp[query_row][query_glass]);
////    }


    public double champagneTower(int poured, int query_row, int query_glass) {
        int k = 100;
        double[] dp = new double[k];
        dp[0] = poured;
        for (int i = 0; i < query_row; i++) {
            double[] temp = new double[k];
            for (int j = 0; j <= i; j++) {
                if (dp[j] > 1) {
                    temp[j] += (dp[j] - 1) / 2.0;
                    temp[j+1] += (dp[j] - 1) / 2.0;
                }
            }
            dp = temp;
        }
        return Math.min(1.0, dp[query_glass]);
    }
}
