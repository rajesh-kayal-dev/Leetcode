// Last updated: 6/15/2026, 10:02:01 AM
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;

        Map<Node, Node> map = new HashMap<>();

        Node curr = head;

        //copy all the nodes and store them into map
        while( curr != null){
            map.put(curr, new Node(curr.val)); //clone none
            curr = curr.next;
        }
        //set next and random pointer 
        curr = head;
        while(curr != null){
            Node copy = map.get(curr);
            copy.next= map.get(curr.next);//copy -> next node
            copy.random = map.get(curr.random); //copy -> random
            curr = curr.next;
        }
        //return deep copy head
        return map.get(head);
    }
}