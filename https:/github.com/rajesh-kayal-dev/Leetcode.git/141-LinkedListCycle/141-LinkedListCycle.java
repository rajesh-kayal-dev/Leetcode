// Last updated: 6/15/2026, 10:01:58 AM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;//move 1 step
            fast = fast.next.next;//move 2 step

            if(slow == fast) return true;
        }
        return false;
    }
}