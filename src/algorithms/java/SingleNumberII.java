package algorithms.java;


import java.util.*;

/**
 * @Author: respass
 * @Date: 2018
 */
public class SingleNumberII {

    public int singleNumber(int[] nums) {


        int[] t = new int[32];

        for (int n : nums) {
            for (int i = 31; i >= 0; i--) {
                t[i] += n & 1;
                n >>= 1;
                if (n == 0) {
                    break;
                }
            }
        }

        int ans = 0;
        for (int i = 31; i >= 0; --i) {
            if (t[i] % 3 != 0) {
                ans += 1 << (31 - i);
            }
        }
        return ans;

    }
}
