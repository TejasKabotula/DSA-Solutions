# Valid Anagram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

 

 **Example 1:** 

 **Input:**  s = "anagram", t = "nagaram"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "rat", t = "car"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length, t.length <= 5 * 104
- s and t consist of lowercase English letters.

 

 **Follow up:**  What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

## Solution

**Language:** Java  
**Runtime:** 14 ms (beats 28.35%)  
**Memory:** 46.2 MB (beats 37.97%)  
**Submitted:** 2026-11-08T12:54:26.624Z  

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer>hm=new HashMap<>();
        for(char x:s.toCharArray())
        {
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for(char x:t.toCharArray())
        {
            hm.put(x,hm.getOrDefault(x,0)-1);
        }

        for(Map.Entry<Character,Integer>h:hm.entrySet())
        {
            if(h.getValue()!=0)
            return false;
        }
        return true;
    
}}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-anagram/)