// Last updated: 8/1/2026, 10:43:55 AM
1class Solution {
2    public ListNode middleNode(ListNode head) {
3        if(head == null) return head;
4        ListNode first= head;
5        ListNode slow= head;
6
7        while(first != null && first.next != null){
8            slow = slow.next;
9            first= first.next.next;
10        }
11        return slow;
12    }
13}