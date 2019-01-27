package algorithms.java;

import algorithms.java.basic.ListNode;

import java.util.List;

/**
 * @Author: respass
 * @Date: 2018
 */
public class SortList {


    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode slow = head, fast = head;
        ListNode pre = null;

        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;

        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        return merge(l1, l2);
    }


    ListNode merge(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0), p = l;
        while (l1 != null && l2 != null) {
            ListNode temp;
            if (l1.val < l2.val) {
                temp = l1;
                l1 = l1.next;
            }else {
                temp = l2;
                l2 = l2.next;
            }
            temp.next = p.next;
            p.next = temp;
            p = temp;
        }

        if (l1 != null) {
            p.next = l1;
        }

        if (l2 != null) {
            p.next = l2;
        }

        return l.next;

    }
}
