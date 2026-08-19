class Solution {
    public String longestCommonPrefix(String[] strs) {
         if(strs.length==0) return "";
        Arrays.sort(strs);
        char[] f=strs[0].toCharArray();
        char[] l=strs[strs.length-1].toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<f.length && i<l.length;i++)
        {
            if(f[i]==l[i])
                sb.append(f[i]);
            else
                break;
        }
        return sb.toString();
    }
}