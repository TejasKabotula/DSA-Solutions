class Solution {
    public int sumExceptFirstLast(int[] arr) {
        // code here
        int su=0;
        for(int i=1;i<arr.length-1;i++)
        {
            su+=arr[i];
        }
        return su;
    }
}