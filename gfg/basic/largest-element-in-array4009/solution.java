class Solution {
    public static int largest(int[] arr) {
        // code here
      int min=Integer.MIN_VALUE;
      for(int x:arr)
      {
          if(x>min)
          {
              min=x;
          }
      }
      return min;
    }
}
