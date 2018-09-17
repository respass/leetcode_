package algorithms.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: respass
 * @Date: 2018
 */
public class SpiralMatrixII {

    public int[][] generateMatrix(int n) {

        int[][] res = new int[n][n];
        int top = 0, bottom = n-1;
        int left = 0, right = n-1;
        int index = 1;
        while (true) {
            for (int i = left; i <= right; i++) {
                res[top][i] = index++;
            }
            top++;
            if (left > right || top > bottom) {
                break;
            }

            for (int i = top; i <= bottom; i++) {
                res[i][right] = index++;
            }
            right--;
            if (left > right || top > bottom) {
                break;
            }

            for (int i = right; i >= left; i--) {
                res[bottom][i] = index++;
            }
            bottom--;
            if (left > right || top > bottom) {
                break;
            }

            for (int i = bottom; i >= top; i--) {
                res[i][left] = index++;
            }
            left++;
            if (left > right || top > bottom) {
                break;
            }


        }
        return res;


    }

}
