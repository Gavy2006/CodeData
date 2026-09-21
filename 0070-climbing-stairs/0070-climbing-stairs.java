class Solution {
    public int climbStairs(int n) {
        
        int[] dp = new int[n+1] ;
        Arrays.fill(dp , -1) ;

        return mycode(n , dp) ;
    }

    public static int mycode(int n , int[] dp){

        if(n == 0) return 1 ;
        if(n == 1) return 1 ;

        if(dp[n] != -1) return dp[n] ;

        int a = mycode(n - 1 , dp) ;
        int b = mycode(n - 2 , dp) ;

        dp[n] = a+b ;

        return dp[n] ;
    }
}