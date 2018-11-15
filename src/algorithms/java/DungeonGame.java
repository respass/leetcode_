package algorithms.java;

import java.util.Arrays;

/**
 * @Author: respass
 * @Date: 2018
 */
public class DungeonGame {
//    public int calculateMinimumHP(int[][] dungeon) {
//
//        if (dungeon == null || dungeon.length == 0 || dungeon[0].length == 0)
//            return 0;
//
//        int x = dungeon[0].length;
//        int y = dungeon.length;
//        int[][] dp = new int[y+1][x+1];
//
//        for (int i = 0; i < y+1; i++) {
//            Arrays.fill(dp[i], Integer.MAX_VALUE);
//        }
//
//        dp[y][x-1] = dp[y-1][x] = 1;
//
//        for (int i = y-1; i >= 0; i--) {
//            for (int j = x-1; j >= 0; j--) {
//                dp[i][j] = Math.max(1,
//                        Math.min(dp[i+1][j], dp[i][j+1]) - dungeon[i][j]);
//            }
//        }
//
//        return dp[0][0];
//
//    }

    public int calculateMinimumHP(int[][] dungeon) {


        if (dungeon == null || dungeon.length == 0 || dungeon[0].length == 0)
            return 0;


        int x = dungeon[0].length;
        int[] dp = new int[x+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[x-1] = 1;
        for (int i = dungeon.length - 1; i >= 0; i--) {
            for (int j = x - 1; j >=0 ; j--) {
                dp[j] = Math.max(1, Math.min(dp[j], dp[j+1]) - dungeon[i][j]);
            }
        }
        return dp[0];



    }

}
