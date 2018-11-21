package algorithms.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: respass
 * @Date: 2018
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {

//        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
//        ArrayList<Integer> row = new ArrayList<Integer>();
//        for(int i=0;i<numRows;i++)
//        {
//            row.add(0, 1);
//            for(int j=1;j<row.size()-1;j++)
//                row.set(j, row.get(j)+row.get(j+1));
//            allrows.add(new ArrayList<Integer>(row));
//        }
//        return allrows;
//

        List<List<Integer>> ans = new ArrayList<>();

        if(numRows < 1) {
            return ans;
        }



        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        if (numRows == 1) {
            ans.add(l1);
            return ans;
        }


        List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(1);

        ans.add(l1);
        ans.add(l2);


        for (int i = 2; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 0; j < ans.get(i-1).size() - 1; j++) {
                temp.add(ans.get(i-1).get(j) + ans.get(i-1).get(j+1));
            }
            temp.add(1);
            ans.add(temp);
        }
        return ans;
    }
}
