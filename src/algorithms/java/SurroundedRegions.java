package algorithms.java;

/**
 * @Author: respass
 * @Date: 2018
 */
public class SurroundedRegions {

    public void solve(char[][] board) {

        if(board.length == 0) return;

        int[][] visited = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 'O')
                dfs(board, visited, i, 0);
            if (board[i][board[0].length-1] == 'O')
                dfs(board, visited, i, board[0].length-1);
        }

        for (int i = 0; i < board[0].length; i++) {
            if (board[0][i] == 'O')
                dfs(board, visited, 0, i);
            if (board[board.length-1][i] == 'O')
                dfs(board, visited, board.length-1, i);
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (visited[i][j] == 0)
                    board[i][j] = 'X';
            }
        }
    }


    void dfs(char[][] board, int[][] visited, int x, int y) {
        if (x >= board.length || x < 0 || y >= board[0].length || y < 0 || visited[x][y] != 0 || board[x][y] == 'X')
            return;

        visited[x][y] = 1;
        dfs(board, visited, x+1, y);
        dfs(board, visited, x-1,y);
        dfs(board, visited, x, y+1);
        dfs(board, visited, x, y-1);

    }
}
