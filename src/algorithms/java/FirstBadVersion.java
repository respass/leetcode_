package algorithms.java;

/**
 * @Author: respass
 * @Date: 2018
 */
public abstract class FirstBadVersion {

    abstract boolean isBadVersion(int m);

    public int firstBadVersion(int n) {

        int l = 1, r = n;
        while(l < r) {
            int m = l + (r - l) / 2;
            if(isBadVersion(m)) {
                r = m;
            }else {
                l = m + 1;
            }
        }

        return l;
    }

}