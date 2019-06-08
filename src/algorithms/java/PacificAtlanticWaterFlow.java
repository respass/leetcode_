package algorithms.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: respass
 * @Date: 2019
 */
public class PacificAtlanticWaterFlow {

    public List<int[]> pacificAtlantic(int[][] matrix) {

        List<int[]> ans = new ArrayList<>();

        if(matrix == null || matrix.length == 0 ) {
            return ans;
        }


        int h = matrix.length;
        int l = matrix[0].length;
        boolean[][] vp = new boolean[h][l];
        boolean[][] vq = new boolean[h][l];



        for (int x = 0; x < h; x++) {
            dfs(matrix, x, 0, 0, vp);
            dfs(matrix, x, l-1, 0, vq);
        }

        for (int y = 0; y < l; y++) {
            dfs(matrix, 0, y, 0,  vp);
            dfs(matrix, h-1, y, 0,  vq);
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (vp[i][j] && vq[i][j]) {
                    ans.add(new int[] {i,j});
                }
            }
        }

        return ans;

    }

    private void dfs(int[][] matrix, int x, int y, int h, boolean[][] v) {

        if (x < 0 || x > matrix.length - 1 || y < 0 || y > matrix[0].length - 1 ||
                v[x][y]  || matrix[x][y] < h) {
            return;
        }
        h = matrix[x][y];
        v[x][y] = true;
        dfs(matrix, x - 1, y, h, v);
        dfs(matrix, x + 1, y, h, v);
        dfs(matrix, x, y - 1, h, v);
        dfs(matrix, x, y + 1, h, v);
    }
}
