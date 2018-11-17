package algorithms.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: respass
 * @Date: 2018
 */
public class CourseSchedule {

    //Topological Sort
    //O(n)
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numCourses; ++i)
            graph.add(new ArrayList<>());

        for (int i = 0; i < prerequisites.length; ++i) {
            int course = prerequisites[i][0];
            int prerequisite = prerequisites[i][1];
            graph.get(course).add(prerequisite);
        }

        int[] visited = new int[numCourses];
        for (int i = 0; i < numCourses; ++i)
            if (dfs(i, graph, visited)) return false;

        return true;
    }

    private boolean dfs(int curr, ArrayList<ArrayList<Integer>> graph, int[] visited) {
        if (visited[curr] == 1) return true;
        if (visited[curr] == 2) return false;

        //visiting
        visited[curr] = 1;

        for (int next : graph.get(curr))
            if (dfs(next, graph, visited)) return true;

        //visited
        visited[curr] = 2;
        return false;
    }

//    dfs O(n * n)
//    public boolean canFinish(int numCourses, int[][] prerequisites) {
//        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
//
//        for (int i = 0; i < numCourses; ++i)
//            graph.add(new ArrayList<Integer>());
//
//        for (int i = 0; i < prerequisites.length; ++i) {
//            int course = prerequisites[i][1];
//            int prerequisite = prerequisites[i][0];
//            graph.get(course).add(prerequisite);
//        }
//
//
//        for(int i = 0; i < numCourses; i++) {
//            boolean[] visited = new boolean[numCourses];
//            if(dfs(i, i, visited, graph))
//                return false;
//        }
//
//        return true;
//    }
//
//    private boolean dfs(int start, int cur, boolean[] visited, ArrayList<ArrayList<Integer>> graph) {
//        if(cur == start && visited[start])
//            return true;
//        if(graph.get(cur).size() == 0)
//            return false;
//        for(int next : graph.get(cur)) {
//            if(visited[next])
//                continue;
//            visited[next] = true;
//            if(dfs(start, next, visited, graph))
//                return true;
//        }
//        return false;
//    }


}
