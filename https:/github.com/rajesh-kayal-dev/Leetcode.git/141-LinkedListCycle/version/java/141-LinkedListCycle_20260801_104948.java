// Last updated: 8/1/2026, 10:49:48 AM
1public class Solution {
2    public boolean hasCycle(ListNode head) {
3        if(head == null) return false;
4
5        ListNode first = head.next;
6        ListNode slow = head;
7
8        while(first != null && first.next != null ){
9            if(first == slow) return true;
10            slow = slow.next;
11            first = first.next.next;
12        }
13        return false;
14    }
15}