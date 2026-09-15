# Max Sum Subarray of size K

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of integers **arr[]**  and a number **k**. Return the maximum sum of a subarray of size k.

 **Note:**  A subarray is a contiguous part of any given array.

 **Examples:** 

```
Input: arr[] = [100, 200, 300, 400], k = 2
Output: 700
Explanation: arr2 + arr3 = 700, which is maximum.
```

```
Input: arr[] = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4
Output: 39
Explanation: arr1 + arr2 + arr3 + arr4 = 39, which is maximum.

```

```
Input: arr[] = [100, 200, 300, 400], k = 1
Output: 400
Explanation: arr3 = 400, which is maximum.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-15T05:47:13.023Z  

```java
class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum =0,maxsum=0;
        int l=0,r=k-1;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        maxsum=sum;
        while(r<arr.length-1)
        {
            
            sum=sum-arr[l];
            l++;
            r++;
            sum=sum+arr[r];
           maxsum=Math.max(sum,maxsum);
             
        }
        return maxsum;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1)