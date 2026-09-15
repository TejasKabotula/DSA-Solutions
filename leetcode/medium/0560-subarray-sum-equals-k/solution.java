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