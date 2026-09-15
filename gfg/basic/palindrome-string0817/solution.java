class Solution {
    boolean isPalindrome(String s) {
        // code here
        int i=0,j=s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else 
            return false;
        }
        return true;
    }
}