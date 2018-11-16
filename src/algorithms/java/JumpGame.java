package algorithms.java;

/**
 * @Author: respass
 * @Date: 2018
 */
public class JumpGame {
//    public boolean canJump(int[] nums) {
//        boolean[] m = new boolean[nums.length];
//        m[0] = true;
//        for(int i = 0; i < nums.length -1; i++) {
//            if(m[i]) {
//                for(int j = 1; j <= nums[i]; j++) {
//                    if(i + j < nums.length) {
//                        m[i+j] = true;
//                    }
//                }
//            }
//        }
//        return m[nums.length-1];
//    }

    public boolean canJump(int[] nums) {
        int far = nums[0];
        for(int i =0; i < nums.length; i++) {
            if(i > far)
                break;
            far = Math.max(far, i + nums[i]);
        }
        return far >= nums.length - 1;
    }
}
