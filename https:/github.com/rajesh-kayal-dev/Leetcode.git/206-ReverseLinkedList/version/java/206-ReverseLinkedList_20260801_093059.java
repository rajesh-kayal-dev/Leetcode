// Last updated: 8/1/2026, 9:30:59 AM
1class Solution {
2    public ListNode reverseList(ListNode head) {
3        ListNode prev = null;
4        ListNode curr = head;
5
6        while(curr != null){
7            ListNode next = curr.next;
8            curr.next = prev; // 1-> = null
9            prev= curr; //null = 1
10            curr = next;//1=2
11        }
12        return prev;
13    }
14}