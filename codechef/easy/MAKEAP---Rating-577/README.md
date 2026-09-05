# MAKEAP - Rating 577

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Make AP

Chef is given two integers $A$ and $C$ such that $A \leq C$.

Chef wants to find whether there exists any  **integer**  $B$ such that $A, B,$ and $C$ are in arithmetic progression.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two space-separated integers $A$ and $C$, the given integers.
### Output Format

For each test case, output $-1$ if there exists no integer $B$ such that $A, B,$ and $C$ are in arithmetic progression. Else, output the value of $B$.

### Constraints
- $1 \leq T \leq 60$
- $1 \leq A \leq C \leq 10$
### Sample 1:
Input
Output

```
4
3 5
6 6
2 7
1 9

```

```
4
6
-1
5

```

### Explanation:

 **Test case $1$:**  Considering $B = 4$, the three integers are in arithmetic progression as $B-A = C-B = 1$.

 **Test case $2$:**  Considering $B = 6$, the three integers are in arithmetic progression as $B-A = C-B = 0$.

 **Test case $3$:**  There exists no integral value of $B$ such that $A, B,$ and $C$ are in arithmetic progression.

 **Test case $4$:**  Considering $B = 5$, the three integers are in arithmetic progression as $B-A = C-B = 4$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T14:26:42.814Z  

```java
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t-->0){
		    int x=scn.nextInt(),y=scn.nextInt();
		    if((x+y)%2==0) System.out.println((x+y)/2);
		    else System.out.println(-1);
		}
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MAKEAP)