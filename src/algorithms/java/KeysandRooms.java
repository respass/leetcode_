package algorithms.java;

import java.util.List;

/**
 * @Author: respass
 * @Date: 2019
 */
public class KeysandRooms {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        boolean[] visited = new boolean[rooms.size()];
        dfs(rooms, 0, visited);
        boolean ans = true;
        for (boolean b : visited) {
            ans = ans && b;
        }
        return ans;


    }

    public void dfs(List<List<Integer>> rooms, int cur, boolean[] visited) {

        List<Integer> keys = rooms.get(cur);
        visited[cur] = true;
        for(int k : keys) {
            if (!visited[k]) {
                dfs(rooms, k, visited);
            }
        }

    }


}
