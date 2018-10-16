package algorithms.java;

/**
 * @Author: respass
 * @Date: 2018
 */
public class FindMinimuminRotatedSortedArray {
    public int findMin(int[] nums) {

        return find(nums, 0, nums.length-1);
    }

    private boolean isSorted(int[] nums, int l, int r) {
        return nums[l] < nums[r];
    }

    private int find(int[] nums, int l, int r) {

        if(l == r) {
            return nums[l];
        }

        if(l + 1 == r) {
            return Math.min(nums[l], nums[r]);
        }


        if (isSorted(nums, l, r) ){
            return nums[l];
        }



        int mid = (l+r) / 2;
        return Math.min(find(nums, l, mid-1), find(nums, mid, r));
    }

}
