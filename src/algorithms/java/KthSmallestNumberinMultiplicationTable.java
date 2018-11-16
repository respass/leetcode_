package algorithms.java;

/**
 * @Author: respass
 * @Date: 2018
 */
public class KthSmallestNumberinMultiplicationTable {

    public int findKthNumber(int m, int n, int k) {
        int l = 1, r = m * n;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (lex(m, n, mid) >= k) {
                r = mid;
            }else {
                l = mid + 1;
            }
        }
        return l;
    }

    private int lex(int m, int n, int x) {
        int ans = 0;
        for (int i = 1; i <= m; i++) {
            ans += Math.min(n, x / i);
        }
        return ans;
    }
}
