
class Solution {
    public void swapKth(List<Integer> arr, int k) {
        // code here
        int x=arr.size()-k;
        int a=arr.get(k-1);
        arr.set(k-1,arr.get(x));
        arr.set(x,a);
        
        
    }
}
