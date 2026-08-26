# Deletion at the end of a Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a Linked List,  **delete** the  **tail** (i.e., the last node) of the Linked List and return the  **new**  head of the modified Linked List.

 **Examples:** 

```
Input:
   
Output: 1 -> 2 -> 3 -> 4
Explanation: After deleting tail from the given linked list, we'll be left with just 1 -> 2 -> 3 -> 4.
   

```

```
Input:
   
Output: 3 -> 12
Explanation: After deleting tail from the given linked list, we'll be left with just 3 -> 12.
   

```

 **Constraints:** 
1 ≤ number of nodes ≤ 105
1 ≤ node->data ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T13:04:50.293Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/deletion-at-the-end-of-a-linked-list/1)