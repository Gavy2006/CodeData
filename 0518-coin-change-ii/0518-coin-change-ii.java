class Solution {
    public int change(int amount, int[] coins) {
     

        Integer[][] dp = new Integer[coins.length][amount+1] ;

        return mycode(coins , dp , 0 , 0 , amount) ;
    }

    public static int mycode(int[] coins , Integer[][] dp , int index , int sum , int target){

        if(sum == target) return 1 ;

        if(sum > target) return 0 ;

        if(index == coins.length) return 0 ;

        if(dp[index][sum] != null) return dp[index][sum] ;

  
    int a = mycode(coins , dp , index  , sum+coins[index]  , target) ;
    int b = mycode(coins , dp , index + 1 , sum  , target) ;


              dp[index][sum] = a + b ;

        return dp[index][sum] ;
    }
}