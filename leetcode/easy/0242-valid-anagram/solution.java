class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer>hm=new HashMap<>();
        for(char x:s.toCharArray())
        {
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for(char x:t.toCharArray())
        {
            hm.put(x,hm.getOrDefault(x,0)-1);
        }

        for(Map.Entry<Character,Integer>h:hm.entrySet())
        {
            if(h.getValue()!=0)
            return false;
        }
        return true;
    
}}