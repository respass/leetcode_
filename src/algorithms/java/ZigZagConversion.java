package algorithms.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: respass
 * @Date: 2018
 */
public class ZigZagConversion {

    public String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }

        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            list.add(new StringBuilder());
        }

        int cur = 0;
        boolean down = false;

        for (char c : s.toCharArray()) {
            list.get(cur).append(c);
            if (cur == 0 || cur == numRows - 1)
                down = !down;
            cur += down ? 1 : -1;
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuilder row : list) {
            ans.append(row);
        }
        return ans.toString();

    }
}
