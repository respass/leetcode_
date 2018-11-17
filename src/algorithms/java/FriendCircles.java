package algorithms.java;

/**
 * @Author: respass
 * @Date: 2018
 */
public class FriendCircles {

    //O(n * n)
    public int findCircleNum(int[][] M) {

        int n = M.length;
        boolean[] visited = new boolean[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;
            dfs(M, i, n, visited);
            ++ans;
        }
        return ans;
    }

    void dfs(int[][] M, int cur, int n, boolean[] visited) {
        if (visited[cur])
            return;

        visited[cur] = true;
        for (int i = 0; i < n; i++) {
            if (!visited[i] && M[cur][i] == 1) {
                dfs(M, i, n, visited);
            }
        }
    }
}
