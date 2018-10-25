package algorithms.java;

import algorithms.java.basic.TreeNode;

/**
 * @Author: respass
 * @Date: 2018
 */
public class ConstructStringfromBinaryTree {
    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }

        String ans = "";
        ans += t.val;
        if (t.left != null) {
            ans += "(" + tree2str(t.left) + ")";
        }

        if (t.right != null) {
            if (t.left == null) {
                ans += "()";
            }
            ans += "(" + tree2str(t.right) + ")";
        }

        return ans;

    }
}
