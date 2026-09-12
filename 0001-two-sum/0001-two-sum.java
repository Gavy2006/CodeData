class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer , Integer> map = new HashMap<>() ;
        
        int[] result = {-1 , -1} ;

        for(int i = 0 ; i<nums.length ; i++){
            map.put(nums[i] , i) ;
        }


      for(int i = 0 ; i<nums.length ; i++){

            int no = nums[i] ;
            int check = target - nums[i] ;

            if(map.containsKey(check) && (map.get(check) != i)){

                result[0] = i ;
                result[1] =  map.get(check) ;
            }
      }


      return result ;


    }
}