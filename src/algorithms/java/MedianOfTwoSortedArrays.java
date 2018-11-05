package algorithms.java;

/**
 * @Author: respass
 * @Date: 2018
 */
public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = 0, r1 = nums1.length-1;
        int l2 = 0, r2 = nums2.length-1;
        double res = 0;

        while (l1 <= r1 && l2 <= r2) {
            if (nums1[l1] < nums2[l2]) {
                l1++;
            }else {
                l2++;
            }

            if (nums1[r1] < nums2[r2]) {
                r2--;
            }else {
                r1--;
            }
        }

       if (l1 <= r1 || l2 <= r2) {
           if (l2 <= r2) {
               l1 = l2;
               r1 = r2;
               nums1 = nums2;

           }


           if (r1 - l1 + 1 == 0) {
               res = l1;
           } else if ((r1 - l1 + 1) % 2 == 0) {
               res = nums1[(l1 + r1) / 2] + nums2[(l1 + r1) / 2 + 1];
           } else {
               res = nums1[(l1 + r1) / 2];
           }

        }else {
            res = (nums1[--r1] + nums2[++r2]) / 2;
        }
        return res;
    }

}
