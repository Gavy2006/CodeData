class Solution {
    public int rob(int[] nums) {
        
        int[] dp = new int[nums.length +1] ;

        Arrays.fill(dp , -1) ;

        return mycode(nums , 0 , dp) ;
    }

    public static int mycode(int[] nums , int index , int[] dp ){

        if(index >= nums.length) return 0 ;
        
        if(dp[index] != -1) return dp[index] ;

        int a = nums[index] + mycode(nums , index+2 ,dp) ;
        int b =  mycode(nums , index+1 , dp) ;

        dp[index] = Math.max(a , b) ;

        return dp[index] ;


    }
}