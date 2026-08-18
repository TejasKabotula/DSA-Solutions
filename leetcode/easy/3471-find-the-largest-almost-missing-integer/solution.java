class Solution {
    public int largestInteger(int[] nums, int k) {
        int i=0,k1=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        while (i <= nums.length - k) {

            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }

            // Count each number only once per window
            for (int num : set) {
                hm.put(num, hm.getOrDefault(num, 0) + 1);
            }

            i++;
        }

        int largest = Integer.MIN_VALUE;

        // Find largest number appearing in exactly one window
        for (int num : hm.keySet()) {
            if (hm.get(num) == 1) {
                largest = Math.max(largest, num);
            }
        }

        return largest == Integer.MIN_VALUE ? -1 : largest;
    }
}