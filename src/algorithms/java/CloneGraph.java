package algorithms.java;

import java.util.*;

/**
 * @Author: respass
 * @Date: 2019
 */
public class CloneGraph {

    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {}

        public Node(int _val, List<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

//    bfs
//    public Node cloneGraph(Node node) {
//        Queue<Node> queue = new LinkedList<>();
//        queue.offer(node);
//        Map<Node, Node> map = new HashMap<>();
//        Set<Node> visited = new HashSet<>();
//        visited.add(node);
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                Node cur = queue.poll();
//                Node copy_cur = null;
//                if (!map.containsKey(cur)) {
//                    copy_cur = new Node(cur.val, new LinkedList<>());
//                    map.put(cur, copy_cur);
//                }
//                copy_cur = map.get(cur);
//
//                for (int j = 0; j < cur.neighbors.size(); j++) {
//                    Node t = cur.neighbors.get(j);
//                    if (!map.containsKey(t)) {
//                        Node copy_t = new Node(t.val, new LinkedList<>());
//                        map.put(t, copy_t);
//                    }
//                    copy_cur.neighbors.add(map.get(t));
//                    if (!visited.contains(t)) {
//                        queue.offer(t);
//                        visited.add(t);
//                    }
//                }
//            }
//        }
//        return map.get(node);
//    }


    //dfs
    HashMap<Node, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        map.put(node, new Node(node.val, new ArrayList<>()));

        for(Node n : node.neighbors){
            if(map.containsKey(n)){
                map.get(node).neighbors.add(map.get(n));
            }else{
                map.get(node).neighbors.add(cloneGraph(n));
            }
        }
        return map.get(node);
    }
}
