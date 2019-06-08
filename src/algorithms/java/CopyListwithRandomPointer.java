package algorithms.java;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: respass
 * @Date: 2019
 */
public class CopyListwithRandomPointer {

    class Node {
        public int val;
        public Node next;
        public Node random;

        public Node() {}

        public Node(int _val,Node _next,Node _random) {
            val = _val;
            next = _next;
            random = _random;
        }
    }

    Map<Node,Node> map = new HashMap<>();

    public Node copyRandomList(Node head) {

        if (head == null){
            return null;
        }

        if (map.containsKey(head)) {
            return map.get(head);
        }

        Node copy_head = new Node(head.val, null, null);
        map.put(head, copy_head);
        copy_head.random = copyRandomList(head.random);
        copy_head.next = copyRandomList(head.next);
        return copy_head;


    }
}
