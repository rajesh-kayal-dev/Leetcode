// Last updated: 6/15/2026, 10:03:47 AM
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //dummy node to simplify result 
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        //loop will rull untill list are empty
        while(l1 != null || l2 != null || carry != 0){
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
        // calculate sum and carry
        int sum = val1 + val2 + carry;
        carry = sum / 10;

        //create a new node with digit value
        current.next = new ListNode(sum % 10);
        current = current.next;
        
        //Move the next pointer
        if(l1 != null) l1 = l1.next;
        if(l2 != null) l2 = l2.next;
        }
        return dummyHead.next;
    }
    
}