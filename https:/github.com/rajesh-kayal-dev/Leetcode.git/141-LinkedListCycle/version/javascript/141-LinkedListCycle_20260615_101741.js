// Last updated: 6/15/2026, 10:17:41 AM
1/**
2 * Definition for singly-linked list.
3 * function ListNode(val) {
4 *     this.val = val;
5 *     this.next = null;
6 * }
7 */
8
9/**
10 * @param {ListNode} head
11 * @return {boolean}
12 */
13var hasCycle = function(head) {
14       let slow = head; 
15        let fast = head; 
16
17        while(fast != null && fast.next != null){
18            slow = slow.next;
19            fast = fast.next.next;
20        
21            if(slow == fast){
22                return true;
23            }
24        }
25        return false;
26};