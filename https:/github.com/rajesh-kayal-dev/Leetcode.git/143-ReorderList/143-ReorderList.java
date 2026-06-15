// Last updated: 6/15/2026, 10:01:54 AM
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
    public void reorderList(ListNode head) {
        if(head == null && head.next == null) return;

        ListNode fast = head;
        ListNode slow = head;

        while( fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //after loop second will in the mid 
        //example -> 1,2,3,4,5 slow is mid = 3
        ListNode second = reverseList(slow.next); //reverse the second half
        slow.next = null;//Break them into two halfs
        ListNode first = head;

        while( second != null ){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            //reverse pointer
            first.next= second; //1 -> 5
            second.next= temp1;  //5 -> 2

            first = temp1;
            second = temp2;
        }
        
    }

    private ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        //reversing
        while( curr != null){
            ListNode NextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = NextNode;
        }
        return prev; //new  haed prev
    }
}