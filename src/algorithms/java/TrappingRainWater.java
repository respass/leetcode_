package algorithms.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: respass
 * @Date: 2018
 */
public class TrappingRainWater {


    public int trap(int[] height) {

        int i = 0;
        int ans = 0;
        while (i <= height.length - 3) {

            if (height[i] == 0) {
                i++;
                continue;
            }

            int cur = 0;
            int j = i + 1;
            while (j < height.length && height[j] < height[i]) {
                cur += height[i] - height[j];
                j++;
            }
            if (j < height.length && height[j] >= height[i]) {
                ans += cur;
            }
            i++;



        }
        return ans;


    }
}
