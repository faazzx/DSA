/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int o) {
        int ct=1;
        ListNode n = head;
        while(n!=null){
            n=n.next;
            ct++;
        }
        if(ct-1==o) return head.next;
        int a= ct-o-1;
        int j=1;
        ListNode b= head;
        while(j<a){
            b=b.next;
            j++;
        }
        // if(b.next.next==null ){
        //     b.next=null;
        //     return head;
        // }
        b.next=b.next.next;
        return head;

    }
}