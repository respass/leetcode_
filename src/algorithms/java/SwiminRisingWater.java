package algorithms.java;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author: respass
 * @Date: 2019
 */
public class SwiminRisingWater {
    public int swimInWater(int[][] grid) {


        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        queue.add(new int[]{grid[0][0], 0, 0});
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        visited[0][0] = true;

        while (!queue.isEmpty()) {

            int[] local = queue.poll();
            int w = local[0];
            int i = local[1];
            int j = local[2];

            if (local[1] == grid.length - 1 && local[2] == grid[0].length - 1) {
                return w;
            }

            if (i - 1 >= 0 && !visited[i-1][j]) {
                queue.add(new int[]{Math.max(w, grid[i-1][j]), i-1, j});
                visited[i-1][j] = true;
            }

            if (i + 1 < grid.length && !visited[i+1][j]) {
                queue.add(new int[]{Math.max(w, grid[i+1][j]), i+1, j});
                visited[i+1][j] = true;
            }

            if (j - 1 >= 0 && !visited[i][j-1]) {
                queue.add(new int[]{Math.max(w, grid[i][j-1]), i , j-1});
                visited[i][j-1] = true;
            }

            if (j + 1 < grid[0].length && !visited[i][j+1]) {
                queue.add(new int[]{Math.max(w, grid[i][j+1]), i, j+1});
                visited[i][j+1] = true;
            }

        }
        return -1;


    }
}
