# Longest Common Prefix

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string `""`.

 

 **Example 1:** 

```
Input: strs = ["flower","flow","flight"]
Output: "fl"

```

 **Example 2:** 

```
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

```

 

 **Constraints:** 

- 1 <= strs.length <= 200
- 0 <= strs[i].length <= 200
- strs[i] consists of only lowercase English letters if it is non-empty.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 61.09%)  
**Memory:** 43.5 MB (beats 16.90%)  
**Submitted:** 2026-08-19T16:21:56.167Z  

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
         if(strs.length==0) return "";
        Arrays.sort(strs);
        char[] f=strs[0].toCharArray();
        char[] l=strs[strs.length-1].toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<f.length && i<l.length;i++)
        {
            if(f[i]==l[i])
                sb.append(f[i]);
            else
                break;
        }
        return sb.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-common-prefix/)