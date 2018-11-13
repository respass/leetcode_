package algorithms.java;

/**
 * @Author: respass
 * @Date: 2018
 */
public class RangeSumQueryImmutable {

    class NumArray {

        int[] nums;
        int[] temp;
        public NumArray(int[] nums) {
            this.nums = nums;
            temp = new int[nums.length];
            int sum = 0;
            for(int i = 0; i < nums.length; i++) {
                sum += nums[i];
                temp[i] = sum;
            }
        }

        public int sumRange(int i, int j) {

            return temp[j] - (i == 0 ? 0 :temp[i-1]);
        }
    }
}
