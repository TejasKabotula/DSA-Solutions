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