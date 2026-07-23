class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int[][] dp = new int[coins.length][amount+1] ;

        for(int[] row : dp){
            Arrays.fill(row , -1) ;
        }

        int ans = mycode(coins, dp, 0, amount);

if (ans == 1000000000) {
    return -1;
}
return ans;
    }

    public static int mycode(int[] coins , int[][] dp , int index , int target){
     
     if(target == 0) return 0 ;

     if(target < 0) return 1000000000;;

     if(index == coins.length) return 1000000000;
   
     if(dp[index][target] != -1) return dp[index][target] ;

     int a = 1 + mycode(coins , dp , index , target - coins[index]);
     int b = mycode(coins , dp , index +1 , target );

     dp[index][target] = Math.min(a , b) ;

     return dp[index][target] ;
    }
}