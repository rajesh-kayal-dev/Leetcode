// Last updated: 8/1/2026, 10:14:11 AM
1
2class Solution {
3
4    private static int length(ListNode head){
5        ListNode temp = head;
6        int count = 0;
7        while(temp != null){
8            count++;
9            temp = temp.next;
10        }
11        return count;
12    }
13    public ListNode middleNode(ListNode head) {
14        int mid = length(head)/2;
15
16        ListNode temp = head;
17
18        for(int i = 0; i < mid; i++){
19            temp = temp.next;
20        }
21
22        return temp;
23    }
24}