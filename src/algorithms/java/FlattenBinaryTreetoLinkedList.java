package algorithms.java;

import algorithms.java.basic.TreeNode;

/**
 * @Author: respass
 * @Date: 2018
 */
public class FlattenBinaryTreetoLinkedList {
    public void flatten(TreeNode root) {
        if(root == null)
            return;

        flatten(root.left);
        flatten(root.right);
        TreeNode t = root.left;
        while(t != null && t.right != null) {
            t = t.right;
        }
        if(t != null) {
            t.right = root.right;
            root.right = root.left;
            root.left = null;
        }
    }
}
