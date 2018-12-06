package algorithms.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: respass
 * @Date: 2018
 */
public class PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {

        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        if (rowIndex == 0)
            return ans;
        ans.add(1);
        if (rowIndex == 1)
            return ans;

        int cur = 2;
        while (cur <= rowIndex) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int i = 1; i < ans.size(); i++) {
                temp.add(ans.get(i-1) + ans.get(i));
            }
            temp.add(1);
            ans = temp;
            cur++;
        }
        return ans;
    }


//    public List<Integer> getRow(int rowIndex) {
//        List<Integer> ret = new LinkedList<>();
//
//        for (int i = 0; i <= rowIndex; i++) {
//            int size = ret.size();
//            for (int j = 0; j < size -1; j++) {
//                ret.set(j, ret.get(j) + ret.get(j+1));
//            }
//            ret.add(0, 1);
//        }
//
//        return ret;
//    }
}
