package algorithms.java;

import java.util.*;

/**
 * @Author: respass
 * @Date: 2019
 */
public class EvaluateDivision {


    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

        double[] ans = new double[queries.size()];

        //build graph
        Map<String, Map<String, Double>> graph = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);
            graph.putIfAbsent(a, new HashMap<>());
            graph.get(a).put(b, values[i]);

            graph.putIfAbsent(b, new HashMap<>());
            graph.get(b).put(a, 1 / values[i]);
        }

        for (int i = 0; i < queries.size(); i++) {

            String start = queries.get(i).get(0);
            String target = queries.get(i).get(1);

            ans[i] = dfs(graph, start, target, new HashSet<>());


        }
        return ans;


    }

    double dfs(Map<String, Map<String, Double>> graph, String s, String t, Set<String> visited) {

        if (!graph.containsKey(s))
            return -1.0;

        if (graph.get(s).containsKey(t)) {
            return graph.get(s).get(t);
        }


        for(Map.Entry<String, Double> entry : graph.get(s).entrySet()) {
            if (!visited.contains(entry.getKey())) {
                visited.add(entry.getKey());
                double cur = dfs(graph, entry.getKey(), t, visited);
                if (cur != -1.0) {
                    return cur * entry.getValue();
                }
            }
        }
        return -1.0;

    }











}
