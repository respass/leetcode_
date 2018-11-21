package algorithms.java;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: respass
 * @Date: 2018
 */
public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {

        Set<Integer> h = new HashSet<>();
        Set<Integer> l = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    h.add(i);
                    l.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (h.contains(i) || l.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }

    }

//    public void setZeroes(int[][] matrix) {
//        boolean[] row = new boolean[matrix.length];
//        boolean[] col = new boolean[matrix[0].length];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] == 0) {
//                    row[i] = true;
//                    col[j] = true;
//                }
//            }
//        }
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (row[i] || col[j]) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//    }
}
