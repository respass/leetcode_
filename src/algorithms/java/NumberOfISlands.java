package algorithms.java;

/**
 * @Author: respass
 * @Date: 2018
 */
public class NumberOfISlands {
    public int numIslands(char[][] grid) {

        if (grid == null || grid.length < 1) {
            return 0;
        }

        int[][] v = new int[grid.length][grid[0].length];
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (dfs(grid, i, j, v) > 0){
                    res++;
                }
            }
        }
        return res;
    }

    int dfs(char[][] grid, int x, int y, int[][] visited) {

        if (x < 0 || x > grid.length-1 || y < 0 || y > grid[0].length-1
                || grid[x][y] == '0' || visited[x][y] == 1) {
            return 0;
        }

        visited[x][y] = 1;
        return 1 + dfs(grid, x+1, y, visited) + dfs(grid, x-1, y, visited)
                + dfs(grid, x, y+1, visited) +  dfs(grid, x, y-1, visited);



    }

//
//    public int numIslands(char[][] grid) {
//        int result = 0;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                if (grid[i][j] == '1') {
//                    result++;
//                    dfs(grid, i, j);
//                }
//            }
//        }
//        return result;
//    }
//    private void dfs(char[][] grid, int row, int col) {
//        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == '0') {
//            return;
//        }
//        grid[row][col] = '0';
//        dfs(grid, row + 1, col);
//        dfs(grid, row - 1, col);
//        dfs(grid, row, col + 1);
//        dfs(grid, row, col - 1);
//    }
}
