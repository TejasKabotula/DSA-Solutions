class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int x : a)
        {
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for(int x:b)
        {
            hm.put(x,hm.getOrDefault(x,0)-1);
        }
        Set<Integer>s=hm.keySet();
        for(int x:s)
        {
            if(hm.get(x)!=0)
            return false;
        }
        return true;
        
    }
}