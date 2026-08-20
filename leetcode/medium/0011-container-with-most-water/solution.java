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
