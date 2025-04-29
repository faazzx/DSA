/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode m = l1;
        ListNode n = l2;
        ListNode head = new ListNode();
        ListNode tail = new ListNode();
        int carry = 0;
        head.next = tail;
        while (m != null && n != null) {
            ListNode temp = new ListNode();
            int sum = (carry + m.val + n.val) % 10;
            temp.val = sum;
            carry = (carry + m.val + n.val) / 10;

            tail.next = temp;
            tail = temp;
            m = m.next;
            n = n.next;
            if (m == null) {
                while (n != null) {
                    ListNode temp2 = new ListNode();
                    sum = (carry + n.val) % 10;
                    temp2.val = sum;
                    tail.next = temp2;
                    tail = temp2;
                    carry = (carry + n.val) / 10;
                    n = n.next;
                }
            }
            if (n == null) {
                while (m != null) {
                    ListNode temp2 = new ListNode();
                    sum = (carry + m.val) % 10;
                    temp2.val = sum;
                    tail.next = temp2;
                    tail = temp2;
                    carry = (carry + m.val) / 10;
                    m = m.next;
                }
            }

        }
        if (carry != 0) {
            ListNode temp3 = new ListNode(carry);
            tail.next = temp3;
            tail = temp3;
        }
        return head.next.next;

    }
}