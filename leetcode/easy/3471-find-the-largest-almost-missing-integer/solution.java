class Solution {
    public int largestInteger(int[] nums, int k) {
        int i=0,k1=0,j=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        while(i<=nums.length-k)
        {    

            HashSet<Integer> set = new HashSet<>();

            for (int num = i; num < i + k; num++) {
                set.add(nums[num]);
            }
            if(k1<k)
            {   
                hm.put(nums[j],hm.getOrDefault(nums[j],0)+1);
                j++;
                k1++;
            }
            else
            {
                i++;
                j=i;
                k1=0;
            }
        }
        int minFreq = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        // 
        for (int num : hm.keySet()) {
            minFreq = Math.min(minFreq, hm.get(num));
        }
        for (int num : hm.keySet()) {
            if (hm.get(num) == minFreq) {
                largest = Math.max(largest, num);
            }
        }
        return largest == Integer.MIN_VALUE ? -1 : largest;


    }
}