package algorithms.java;

import algorithms.java.basic.ListNode;

import java.util.List;

/**
 * @Author: respass
 * @Date: 2018
 */
public class InsertionSortList {

    public ListNode insertionSortList(ListNode head) {

        if (head == null || head.next == null)
            return head;



        ListNode fakeHead = new ListNode(-1);


        ListNode cur = head;
        while (cur != null) {

            ListNode temp = cur;
            cur = cur.next;


            ListNode insertIndex = fakeHead;
            if (fakeHead.next != null) {
                for (ListNode i = fakeHead.next; i != null && i.val < temp.val; i = i.next) {
                    insertIndex = i;
                }
            }
            temp.next = insertIndex.next;
            insertIndex.next = temp;



        }
        return fakeHead.next;
    }
}
