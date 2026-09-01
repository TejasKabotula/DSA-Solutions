import java.util.*;

class Solution {
    public void insertAtIndex(ArrayList<Integer> arr, int index, int val) {
        // code here
        if(arr.size()<=index)
        {arr.add(val);
        
        }
        else
        {
            arr.add(index,val);
        }
    
                
        
    }
}
