class Solution {
    public int change(int amount, int[] coins) {
        
        Integer[][] dp = new Integer[coins.length][amount+1] ;

        return mycode(coins , dp , 0 , 0 , amount ) ;
    }

    public static int mycode( int[] arr , Integer[][] dp , int index , int sum , int target){
       
        if(sum == target) return 1 ;

        if(sum > target) return 0 ;

        if(index == arr.length) return 0 ;

        if(dp[index][sum] != null) return dp[index][sum] ;
        
        int a =   mycode( arr , dp , index , sum + arr[index] , target ) ;
        int b =   mycode(arr , dp , index + 1, sum , target ) ;

      return   dp[index][sum] = a + b ; 

    }
}