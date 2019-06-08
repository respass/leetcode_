package algorithms.java;

import java.util.*;

/**
 * @Author: respass
 * @Date: 2019
 */
public class CutOffTreesforGolfEvent {

    int[][] dirs = {{0,1}, {0,-1}, {1,0}, {-1,0}};

    public int cutOffTree(List<List<Integer>> forest) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });

        for (int i = 0; i < forest.size(); i++) {
            for (int j = 0; j < forest.get(i).size(); j++) {
                if (forest.get(i).get(j) != 0)
                    pq.add(new int[]{i,j, forest.get(i).get(j)});
            }
        }

        int ans = 0;

        int now_i = 0, now_j = 0;
        while (!pq.isEmpty()) {

            int[] next = pq.poll();
            int cost = bfs(forest, now_i, now_j, next[0], next[1]);
            if (cost == -1) {
                return -1;
            }
            ans += cost;
            now_i = next[0];
            now_j = next[1];
        }

        return ans;


    }

    private int bfs(List<List<Integer>> forest, int now_i, int now_j, int target_i, int target_j) {

        int ans = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {now_i, now_j});
        boolean[][] visited = new boolean[forest.size()][forest.get(0).size()];

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] now = queue.poll();
                if (now[0] == target_i && now[1] == target_j)
                    return ans;
                for (int j = 0; j < 4; j++) {
                    int next_i = now[0] + dirs[j][0];
                    int next_j = now[1] + dirs[j][1];
                    if (next_i >= 0 && next_i < forest.size() && next_j >= 0 && next_j < forest.get(0).size()
                        && forest.get(next_i).get(next_j) != 0 && !visited[next_i][next_j]) {
                        visited[next_i][next_i] = true;
                        queue.offer(new int[] {next_i, next_j});
                    }
                }
            }
            ans++;
        }

        return -1;


    }


}
