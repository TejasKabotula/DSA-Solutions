/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        ArrayList<Integer>al=new ArrayList<>();
        Node t=head;
        while(t!=null)
        {
            al.add(t.data);
            t=t.next;
        }
        return al;
    }
}