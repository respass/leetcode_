package algorithms.java;

import java.util.Arrays;

/**
 * @Author: respass
 * @Date: 2019
 */
public class RedundantConnection {

    public int[] findRedundantConnection(int[][] edges) {

        int[] parent = new int[1024];

        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < edges.length; i++) {

            int a = edges[i][0];
            int b = edges[i][1];

            int a_parent = find(parent, a);
            int b_parent = find(parent, b);

            if (a_parent == b_parent) {
                return new int[]{a, b};
            }

            parent[a_parent] = b_parent;

        }

        return null;



    }


    int find(int[] parents, int f) {
        if (f == parents[f]) {
            return f;
        }


        parents[f] = find(parents, parents[f]);

        return parents[f];
    }
}
