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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;  // Step 1: next = 2
            curr.next = prev;           // Step 2: 1.next = null (reverse)
            prev = curr;                // Step 3: prev = 1
            curr = next;                // Step 4: curr = 2
        }
        return prev; // points to 4 → 3 → 2 → 1 → null
    }
}