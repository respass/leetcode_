package algorithms.java;

import java.util.List;

/**
 * @Author: respass
 * @Date: 2018
 */
public class Triangle {
//    public int minimumTotal(List<List<Integer>> triangle) {
//        dfs(triangle, 0, 0, 0);
//        return res;
//    }
//
//
//    int res = Integer.MAX_VALUE;
//    void dfs(List<List<Integer>> triangle, int cur, int index, int sum) {
//
//        if (cur == triangle.size()-1) {
//            res = Math.min(res, sum + triangle.get(cur).get(index));
//            return;
//        }
//
//        dfs(triangle, cur+1, index, sum + triangle.get(cur).get(index));
//        dfs(triangle, cur+1, index+1, sum + triangle.get(cur).get(index));
//    }

    public int minimumTotal(List<List<Integer>> trgl) {

        int sz = trgl.size();

        int[] results = new int[sz+1];


        for(int i=sz-1; i>=0; i--) {

            List<Integer> tmp = trgl.get(i);


            for(int j=0; j<tmp.size(); j++) {

                results[j] = Math.min(results[j], results[j+1]) + tmp.get(j);

            }

        }

        return results[0];

    }


}
