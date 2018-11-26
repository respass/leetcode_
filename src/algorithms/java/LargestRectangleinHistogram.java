package algorithms.java;

import java.util.Stack;

/**
 * @Author: respass
 * @Date: 2018
 */
public class LargestRectangleinHistogram {

    public int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for (int i = 0; i < heights.length; i++) {

            if (stack.isEmpty()) {
                stack.push(i);
                ans = Math.max(ans, heights[i]);
            }else {

                while (!stack.isEmpty() && heights[i] > heights[stack.peek()]) {
                    ans = Math.max(ans, (i - stack.peek() + 1) * heights[i]);
                    stack.pop();
                }

                stack.push(i);


            }

        }
        return ans;
    }
}
