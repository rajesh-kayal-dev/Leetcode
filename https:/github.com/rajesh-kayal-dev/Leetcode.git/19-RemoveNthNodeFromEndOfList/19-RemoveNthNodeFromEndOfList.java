// Last updated: 6/15/2026, 10:03:29 AM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head;

        for(int i = 0; i < n;i++){
            fast= fast.next;
        }

        if(fast == null){ //if two node 1 then remove
            return head.next;
        }

        while(fast != null && fast.next !=null){
            fast= fast.next;
            slow= slow.next;
        }

        if(slow != null && slow.next != null){
        slow.next=slow.next.next;
        }


        return head;

    }
}