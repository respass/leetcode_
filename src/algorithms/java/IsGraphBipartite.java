package algorithms.java;

/**
 * @Author: respass
 * @Date: 2019
 */
public class IsGraphBipartite {


    public boolean isBipartite(int[][] graph) {

        int size = graph.length;
        boolean[] color = new boolean[size];
        boolean[] visited = new boolean[size];

        boolean ans = true;
        for(int i = 0; i < graph.length; i++) {
            if(!visited[i])
                ans = ans  && dfs(graph, color, false, visited, i);
        }

        return ans;

    }

    private boolean dfs(int[][] graph, boolean[] color, boolean cur, boolean[] visited, int s)
    {
        if(!visited[s]) {
            visited[s] = true;
            color[s] = cur;
            for(int i = 0; i < graph[s].length; i++) {

                if(!dfs(graph, color, !cur, visited, graph[s][i])) {
                    return false;
                }

            }
            return true;


        }else{
            return color[s] == cur;
        }
    }



}
