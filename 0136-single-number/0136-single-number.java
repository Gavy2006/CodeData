class Solution {
    public int singleNumber(int[] nums) {
        
        int no = 0 ;

       for(int num : nums){
        no = no ^ num ;
       }
      return no ;
    }
}