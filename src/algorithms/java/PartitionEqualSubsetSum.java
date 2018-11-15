package algorithms.java;

/**
 * @Author: respass
 * @Date: 2018
 */
public class PartitionEqualSubsetSum {
//    public boolean canPartition(int[] nums) {
//
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//        }
//        if (sum % 2 != 0)
//            return false;
//
//        int len = nums.length;
//        boolean[][] dp = new boolean[len+1][sum+1];
//        dp[0][0] = true;
//        for (int i = 1; i <= len; i++) {
//
//            for (int j = 0; j <= sum - nums[i-1]; j++) {
//                if (dp[i-1][j]) {
//                    dp[i][j] = true;
//                    dp[i][j + nums[i-1]] = true;
//                }
//            }
//
//            if (dp[i][sum / 2]) {
//                return true;
//            }
//        }
//        return false;
//    }

    public boolean canPartition(int[] nums) {

        int sum = 0;
        for(int i : nums) {
            sum += i;
        }

        if(sum % 2 != 0)
            return false;


        boolean[] dp = new boolean[sum+1];
        dp[0] = true;
        for(int i : nums) {
            for(int j = sum; j >= 0; j--) {
                if(dp[j]) {
                    dp[i + j] = true;
                }
            }
            if(dp[sum / 2]) {
                return true;
            }
        }
        return false;
    }
}
