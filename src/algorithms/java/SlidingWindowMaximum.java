package algorithms.java;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author: respass
 * @Date: 2018
 */
public class SlidingWindowMaximum {



    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            return new int[0];
        }

        int[] ans = new int[nums.length - k + 1];
        Arrays.fill(ans, Integer.MIN_VALUE);
        for (int i = 0; i < k; i++) {
            ans[0] = Math.max(ans[0], nums[i]);
        }

        int max = ans[0];
        for (int i = k; i < nums.length; i++) {
            if (nums[i] < max && nums[i-k] != max) {
                ans[i-k+1] = max;
            }else {
                for (int j = i-k+1; j <= i; j++) {
                    ans[i-k+1] = Math.max(ans[i-k+1], nums[j]);
                }
                max = ans[i-k+1];
            }
        }
        return ans;
    }


//    public int[] maxSlidingWindow(int[] nums, int k) {
//        if (k == 0) return nums;
//
//        int[] ans = new int[nums.length - k + 1];
//        Deque<Integer> indices = new LinkedList<>();
//
//        for (int i = 0; i < nums.length; ++i) {
//            while (indices.size() > 0 && nums[i] >= nums[indices.getLast()])
//                indices.removeLast();
//
//            indices.addLast(i);
//            if (i - k + 1 >= 0) ans[i - k + 1] = nums[indices.getFirst()];
//            if (i - k + 1 >= indices.getFirst()) indices.removeFirst();
//        }
//
//        return ans;
//    }
}
