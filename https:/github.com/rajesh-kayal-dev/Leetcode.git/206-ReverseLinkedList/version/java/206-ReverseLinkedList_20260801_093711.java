// Last updated: 8/1/2026, 9:37:11 AM
1class Solution {
2    public ListNode reverseList(ListNode head) {
3        if(head == null || head.next == null) return head;
4
5        ListNode newHead = reverseList(head.next);
6        head.next.next = head;
7        head.next = null;
8
9        return newHead;
10
11    }
12}