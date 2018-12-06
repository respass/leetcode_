package algorithms.java;

import algorithms.java.basic.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: respass
 * @Date: 2018
 */
public class SerializeandDeserializeBinaryTree {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null)
            return "# ";
        return "" + root.val + " " + serialize(root.left) + serialize(root.right);
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        cur = 0;
        return dfs(data.split(" "));
    }

    int cur;
    TreeNode dfs(String[] data) {

        if (cur > data.length- 1 ) {
            return null;
        }

        if (data[cur].equals("#")) {
            cur++;
            return null;
        }


        TreeNode t = new TreeNode(Integer.valueOf(data[cur]));
        cur++;
        t.left = dfs(data);
        t.right = dfs(data);
        return t;
    }




}
