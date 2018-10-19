package algorithms.java;

import algorithms.java.basic.TreeNode;

import java.util.*;

/**
 * @Author: respass
 * @Date: 2018
 */
public class SecondMinimumNodeInaBinaryTree {


//
//    public int findSecondMinimumValue(TreeNode root) {
//        TreeSet<Integer> set = new TreeSet<>();
//        dfs(root, set);
//        List<Integer> list = new ArrayList<>(set);
//        return list.size() >= 2 ? list.get(1) : -1;
//    }
//
//    void dfs(TreeNode root, Set<Integer> set) {
//        if (root != null) {
//            set.add(root.val);
//            dfs(root.left, set);
//            dfs(root.right, set);
//        }
//    }


    int min1;
    long ans = Long.MAX_VALUE;

    public void dfs(TreeNode root) {
        if (root != null) {
            if (min1 < root.val && root.val < ans) {
                ans = root.val;
            } else if (min1 == root.val) {
                dfs(root.left);
                dfs(root.right);
            }
        }
    }
    public int findSecondMinimumValue(TreeNode root) {
        min1 = root.val;
        dfs(root);
        return ans < Long.MAX_VALUE ? (int) ans : -1;
    }
}
