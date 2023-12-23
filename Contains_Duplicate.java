import java.util.HashSet;

class Solution {
    public boolean Contains_Duplicate(int[] nums) {
        
         HashSet<Integer> hs = new HashSet<Integer>();

         for(int num : nums){
            
             if(hs.contains(num)){
                 return true;
             }
             hs.add(num);
     
         }

         return false;
    }
}
