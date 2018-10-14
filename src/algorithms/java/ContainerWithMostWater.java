package algorithms.java;
import java.util.Map;

/**
 * @Author: respass
 * @Date: 2018
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int res = Math.min(height[0], height[r]) * r;
        while (l < r) {
            res = Math.max(res, Math.min(height[l], height[r]) * (l-r));
            if (height[l] < height[r])
                l++;
            else
                r--;

        }
        return res;
    }

}
