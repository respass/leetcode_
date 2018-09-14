package algorithms.java;

import java.util.Arrays;

/**
 * @Author: respass
 * @Date: 2018
 */
public class WiggleSubsequence {
    public static int wiggleMaxLength(int[] nums) {

        if(nums == null || nums.length < 1) {
            return 0;
        }

        int len = nums.length;
        int[] dp = new int[len];
        int[] pre = new int[len];
        Arrays.fill(dp, 1);
        Arrays.fill(pre, -1);
        int res = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if ( (pre[j] == -1 && nums[j] != nums[i])
                        || (pre[j] != - 1 && (nums[pre[j]] - nums[j]) * (nums[j] - nums[i]) < 0 )) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        pre[i] = j;
                    }
                }
            }
//            System.out.println(dp[i]);

            res = Math.max(res, dp[i]);
        }
        return res;
    }

//
//    public int wiggleMaxLength(int[] nums) {
//        if(nums.length <= 1){
//            return nums.length;
//        }
//
//        int up = 1;
//        int down = 1;
//        for(int i = 1; i < nums.length; i ++){
//            if(nums[i] > nums[i - 1]){
//                up = down + 1;
//            }else if(nums[i] < nums[i - 1]){
//                down = up + 1;
//            }
//        }
//        return up > down ? up : down;
//    }

    public static void main(String[] args) {
        System.out.println(wiggleMaxLength(new int[] {3, 3, 3, 2, 5}));
    }
}
