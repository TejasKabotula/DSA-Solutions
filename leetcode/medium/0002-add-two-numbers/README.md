# Add Two Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given two  **non-empty**  linked lists representing two non-negative integers. The digits are stored in  **reverse order**, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

 **Example 1:** 

```
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

```

 **Example 2:** 

```
Input: l1 = [0], l2 = [0]
Output: [0]

```

 **Example 3:** 

```
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]

```

 

 **Constraints:** 

- The number of nodes in each linked list is in the range [1, 100].
- 0 <= Node.val <= 9
- It is guaranteed that the list represents a number that does not have leading zeros.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 46.6 MB (beats 19.85%)  
**Submitted:** 2026-08-17T14:08:48.255Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/add-two-numbers/)