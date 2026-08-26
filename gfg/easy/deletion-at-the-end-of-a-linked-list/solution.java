/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Solution {
    public Node removeLastNode(Node head) {
        // code here
        Node t=head;
          if (head == null)
            return null;

        // Case 2: Only one node
        if (head.next == null)
            return null;
        while(t.next.next!=null)
        {
            t=t.next;
        }
        t.next=null;
        return head;
    }
}