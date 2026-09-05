import java.util.*;

class Solution{
    static List<Long> jugglerSequence(long n){
        List<Long> ans=new ArrayList<>();
        while(n!=1){
            ans.add(n);
            if(n%2==0){
                n=(long)Math.floor(Math.sqrt(n));
            }else{
                n=(long)Math.floor(Math.pow(n,1.5));
            }
        }
        ans.add(1L);
        return ans;
    }
}
