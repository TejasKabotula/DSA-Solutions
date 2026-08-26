# Container With Most Water

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `height` of length `n`. There are `n` vertical lines drawn such that the two endpoints of the `ith` line are `(i, 0)` and `(i, height[i])`.

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return  *the maximum amount of water a container can store*.

 **Notice**  that you may not slant the container.

 

 **Example 1:** 

```
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

```

 **Example 2:** 

```
Input: height = [1,1]
Output: 1

```

 

 **Constraints:** 

- n == height.length
- 2 <= n <= 105
- 0 <= height[i] <= 104

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 94.95%)  
**Memory:** 77.2 MB (beats 69.07%)  
**Submitted:** 2026-08-26T13:03:58.899Z  

```java
class Solution {
    public int maxArea(int[] h) {
        int i = 0;             //start pointer
        int j = h.length-1;   //end pointer

        int ans = -1;

        while(i<j ){
            int min = h[i]<h[j] ? h[i] : h[j];//get min of h[i] & h[j]
            if(min*(j-i) > ans )ans = min*(j-i); // update ans to max value
            if(h[i]<h[j])i++; // move i if h[i] is <
            else j--;         // else move j
        }

        return ans;

    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/container-with-most-water/)