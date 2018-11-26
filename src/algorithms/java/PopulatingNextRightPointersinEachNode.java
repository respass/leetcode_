package algorithms.java;

/**
 * @Author: respass
 * @Date: 2018
 */
public class PopulatingNextRightPointersinEachNode {

//    public void connect(TreeLinkNode root) {
//        if(root == null)
//            return;
//
//        List<TreeLinkNode> cur = new LinkedList<>();
//        List<TreeLinkNode> next = new LinkedList<>();
//        TreeLinkNode pre = null;
//        cur.add(root);
//        while(!cur.isEmpty()) {
//            TreeLinkNode p = cur.remove(0);
//            if(pre != null) {
//                pre.next = p;
//            }
//            pre = p;
//
//            if(p.left != null) {
//                next.add(p.left);
//            }
//
//            if(p.right != null) {
//                next.add(p.right);
//            }
//
//            if(cur.isEmpty()) {
//                pre = null;
//                List<TreeLinkNode> temp = cur;
//                cur = next;
//                next = temp;
//            }
//
//
//
//
//        }



//    public void connect(TreeLinkNode root){
//        if(root == null) return;
//        if(root.left != null){
//            root.left.next = root.right;
//            if(root.next != null){
//                root.right.next = root.next.left;
//            }
//        }
//        connect(root.left);
//        connect(root.right);
//    }
}
