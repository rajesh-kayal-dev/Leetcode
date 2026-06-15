// Last updated: 6/15/2026, 10:03:20 AM
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        //pointers
        ListNode curr = dummy,prev = dummy, next = dummy;
        
        int count = 0;
        while(curr.next != null){
            curr = curr.next;
            count++;
        }

        while(count >= k){
            curr = prev.next;
            next = curr.next;
            //reverse k group

            for(int i = 1; i < k;i++){
                curr.next = next.next;//curr = 1 ,next = 2 it becomes 1-> 3
                next.next= prev.next;//2->1
                prev.next= next;//prev now point to next:
                // dummy->2(if reversed 1-> 2)
                next= curr.next;
            }
            prev = curr;
            
            count -= k;
        }
        return dummy.next;
    }
}