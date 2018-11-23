package algorithms.java;

import algorithms.java.basic.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: respass
 * @Date: 2018
 */
public class BinaryTreeInorderTraversal {


    List<Integer> ans = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {

        in_order(root);
        return ans;

    }


    //线索化 空间复杂度: O(1)
    void in_order(TreeNode root) {
        TreeNode cur = root;
        while (cur != null) {
            if (cur.left == null) {
                ans.add(cur.val);
                cur = cur.right;
            }else {
                TreeNode n = cur.left;
                while (n.right != null && n.right != cur) {
                    n = n.right;
                }
                //还没线索化
                if (n.right == null) {
                    n.right = cur;
                    cur = cur.left;
                }else {
                    //已经线索化, 访问节点,删除线索
                    ans.add(cur.val);
                    n.right = null;
                    cur = cur.right;
                }
            }
        }

    }
}
