// Last updated: 6/15/2026, 10:03:22 AM
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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue<>(
            (a,b) -> a.val - b.val
        );

        for(ListNode node : lists){
            if(node != null){
                heap.add(node);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while( !heap.isEmpty()){
            ListNode node = heap.poll();
            current.next = node;
            current = current.next;

        if(node.next != null){
            heap.add(node.next);
        }
    }
    return dummy.next;

     }
      
    }
