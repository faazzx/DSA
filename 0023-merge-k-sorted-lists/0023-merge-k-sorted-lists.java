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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int i = 0; i < lists.length; i++) {
            ListNode temp = lists[i];
            while (temp != null) {
                p.add(temp.val);
                temp = temp.next;
            }
        }
        ListNode head = new ListNode();
        ListNode tail = new ListNode();
        head.next = tail;
        while (!p.isEmpty()) {
            ListNode temp = new ListNode(p.poll());
            tail.next = temp;
            tail = temp;

        }
        return head.next.next;
    }
}