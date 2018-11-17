package algorithms.java;

import java.util.Arrays;

/**
 * @Author: respass
 * @Date: 2018
 */
public class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int ans = 0;
        int gIndex = g.length - 1;
        int sIndex = s.length - 1;

        while (gIndex >= 0 && sIndex >= 0) {
            if (g[gIndex] <= s[sIndex]) {
                gIndex--;
                sIndex--;
                ans++;
            }else {
                gIndex--;
            }
        }
        return ans;
    }
}
