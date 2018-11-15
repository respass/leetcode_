package algorithms.java;

/**
 * @Author: respass
 * @Date: 2018
 */
public class MedianOfTwoSortedArrays {

//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int l1 = 0, r1 = nums1.length-1;
//        int l2 = 0, r2 = nums2.length-1;
//        double res = 0;
//
//        while (l1 <= r1 && l2 <= r2) {
//            if (nums1[l1] < nums2[l2]) {
//                l1++;
//            }else {
//                l2++;
//            }
//
//            if (nums1[r1] < nums2[r2]) {
//                r2--;
//            }else {
//                r1--;
//            }
//        }
//
//       if (l1 <= r1 || l2 <= r2) {
//           if (l2 <= r2) {
//               l1 = l2;
//               r1 = r2;
//               nums1 = nums2;
//
//           }
//
//
//           if (r1 - l1 + 1 == 0) {
//               res = l1;
//           } else if ((r1 - l1 + 1) % 2 == 0) {
//               res = nums1[(l1 + r1) / 2] + nums2[(l1 + r1) / 2 + 1];
//           } else {
//               res = nums1[(l1 + r1) / 2];
//           }
//
//        }else {
//            res = (nums1[--r1] + nums2[++r2]) / 2;
//        }
//        return res;
//    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if (n1 > n2)
            return findMedianSortedArrays(nums2, nums1);

        int k = (n1 + n2 + 1) / 2;
        int l = 0;
        int r = n1;

        while (l < r) {
            int m1 = l + (r - l) / 2;
            int m2 = k - m1;
            if (nums1[m1] < nums2[m2 - 1])
                l = m1 + 1;
            else
                r = m1;
        }

        int m1 = l;
        int m2 = k - l;

        int c1 = Math.max(m1 <= 0 ? Integer.MIN_VALUE : nums1[m1 - 1],
                m2 <= 0 ? Integer.MIN_VALUE : nums2[m2 - 1]);

        if ((n1 + n2) % 2 == 1)
            return c1;

        int c2 = Math.min(m1 >= n1 ? Integer.MAX_VALUE : nums1[m1],
                m2 >= n2 ? Integer.MAX_VALUE : nums2[m2]);

        return (c1 + c2) * 0.5;
    }

}
