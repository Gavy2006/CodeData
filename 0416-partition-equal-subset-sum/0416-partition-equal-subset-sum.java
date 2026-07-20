class Solution {
    public boolean canPartition(int[] nums) {
        
        int num = 0 ;

        for(int no : nums){
         num = num  + no ;
        }

        if(num %2 !=0 ) return false ;

        Boolean dp[][] = new Boolean[nums.length][num] ;

        return mycode(nums , 0 , 0 , num , dp) ;
         
    }

    public static boolean mycode(int[] nums , int sum ,int index , int num , Boolean[][] dp){

        if(index == nums.length) return false ;
  
        if(dp[index][sum] != null) return dp[index][sum] ;

        if(sum == num/2) return true ;

        boolean take = false ;
        boolean nottake = false ;

        take = mycode(nums ,  sum + nums[index] , index + 1 , num , dp) ;
        nottake = mycode(nums ,  sum  , index + 1 , num , dp) ;

         dp[index][sum] = take || nottake  ;
        return  dp[index][sum] ;
    }
}