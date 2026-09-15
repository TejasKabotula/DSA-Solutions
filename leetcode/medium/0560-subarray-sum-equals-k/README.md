# Subarray Sum Equals K

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers `nums` and an integer `k`, return  *the total number of subarrays whose sum equals to*  `k`.

A subarray is a contiguous  **non-empty**  sequence of elements within an array.

 

 **Example 1:** 

```
Input: nums = [1,1,1], k = 2
Output: 2

```

 **Example 2:** 

```
Input: nums = [1,2,3], k = 3
Output: 2

```

 

 **Constraints:** 

- 1 <= nums.length <= 2 * 104
- -1000 <= nums[i] <= 1000
- -107 <= k <= 107

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.7 MB  
**Submitted:** 2026-09-15T10:00:56.165Z  

```java
class Solution {
    public int subarraySum(int[] nums, int k) {
        int x=num(nums,k);
        int y=num(nums,k-1);
        return x-y; 
    }
    int num(int arr[],int k)
    {
        int sum =0,l=0,r=0,count=0;
        while(r<arr.length)
        {
            sum+=arr[r];
            while(sum>k)
            {
                sum-=arr[l];
                l++;
            }
            if(sum<=k)
            {
                count++;
                
            }
            r++;
        }
        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/subarray-sum-equals-k/)