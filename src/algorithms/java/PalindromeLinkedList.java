package algorithms.java;

import algorithms.java.basic.ListNode;

/**
 * @Author: respass
 * @Date: 2019
 */
public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {

        if(head == null) {
            return true;
        }

        ListNode slow = head, fast = head;

        while(fast.next != null && fast.next.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }


        ListNode r = slow.next;
        slow.next = null;
        while(r != null) {
            ListNode temp = r;
            r = r.next;

            temp.next = slow.next;
            slow.next = temp;
        }

        while(slow.next != null) {
            if(head.val != slow.next.val) {
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
}
