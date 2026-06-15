// Last updated: 6/15/2026, 10:01:06 AM

class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}