package algorithms.java;

/**
 * @Author: respass
 * @Date: 2018
 */
public class SingleElementinaSortedArray {

//    public int singleNonDuplicate(int[] nums) {
//        int ans = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            ans ^= nums[i];
//        }
//        return ans;
//    }

    public int singleNonDuplicate(int[] nums) {
        int l = 0, r = nums.length - 1;
        while(l < r) {
            int m = l + (r - l) / 2;
            int n = m ^ 1;
            if(nums[m] == nums[n]) {
                l = m + 1;
            }else {
                r = m;
            }
        }
        return nums[l];
    }
}
