package algorithms.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: respass
 * @Date: 2018
 */
public class CourseScheduleII {

    //O(V+E)
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            int pre = prerequisites[i][1];
            int course = prerequisites[i][0];
            graph.get(pre).add(course);
        }

        int[] visited = new int[numCourses];
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            if (dfs(i, graph, visited, ans))
                return new int[0];
        }

        int[] res = new int[numCourses];
        for (int i = ans.size()-1; i >= 0; i--) {
            res[ans.size()-1-i] = ans.get(i);
        }
        return res;
    }

    private boolean dfs(int cur, List<List<Integer>> graph, int[] visited, List<Integer> ans) {
        if (visited[cur] == 1)
            return true;
        if (visited[cur] == 2)
            return false;


        visited[cur] = 1;
        for(int next :graph.get(cur)) {
            if (dfs(next, graph, visited, ans))
                return true;
        }
        visited[cur] = 2;
        ans.add(cur);
        return false;
    }
}
