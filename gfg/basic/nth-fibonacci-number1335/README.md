# Nth Fibonacci Number

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Find the  **n-th**  Fibonacci number for a given non-negative integer **n**.
The Fibonacci sequence is defined as:

- F(0) = 0
- F(1) = 1
- F(n) = F(n - 1) + F(n - 2) for n ≥ 2

 **Examples :** 

```
Input: n = 5
Output: 5
Explanation: The 5th Fibonacci number is 5.
```

```
Input: n = 0
Output: 0 
Explanation: The 0th Fibonacci number is 0.

```

```
Input: n = 1
Output: 1
Explanation: The 1st Fibonacci number is 1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-14T16:38:53.616Z  

```java
// User function Template for Java

class Solution {
    public int nthFibonacci(int n) {
        // code here
         if(n==1)
            return 1;
        if(n==2)
            return 1;
        int a=0,b=1,c=0;
        for (int i = 2; i <=n; i++) {
            c=a+b;
            a=b;
            b=c;

        }
        return c;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/nth-fibonacci-number1335/1)