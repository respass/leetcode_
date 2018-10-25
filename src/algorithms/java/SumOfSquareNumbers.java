package algorithms.java;

/**
 * @Author: respass
 * @Date: 2018
 */
public class SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        int l = 0, r = (int)Math.sqrt(c) + 1;
        while(l <= r) {
            int x = l * l + r * r;
            if(x == c) {
                return true;
            }else if(x < c) {
                l++;
            }else{
                r--;
            }
        }
        return false;
    }
}
