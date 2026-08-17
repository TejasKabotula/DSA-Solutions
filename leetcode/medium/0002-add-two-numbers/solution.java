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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1=l1;
        ListNode h2=l2;
        ListNode temp=null;
         ListNode ans=null;
        int c=0;
        while(h1 !=null || h2 !=null)
        {   int v=0;
        if(h1!=null && h2!=null)
             v=h1.val+h2.val + c;
             else if(h1!=null && h2==null)
             v=h1.val+c;
             else if(h1==null && h2!=null)
             v=h2.val + c;
             else 
             v=c;
            int d=v%10;
            ListNode newnode =new ListNode(d);
            c=v/10;
            if(ans == null)
              {  temp=newnode;
                ans=newnode;}
            else
            {temp.next=newnode;
             temp=temp.next;
            }
            if(h1 !=null)
            h1=h1.next;
            if(h2 != null)
            h2=h2.next;

        }
        if(c>0)
        {ListNode newnode =new ListNode(c);
        temp.next=newnode;}
        return ans;

    }
}