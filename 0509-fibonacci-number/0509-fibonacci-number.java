class Solution {
    public int fib(int n) {
        
        int[] dp = new int[n+1] ;

        Arrays.fill(dp , -1) ;

        return mycode(dp , n );
    }


    public static int mycode(int[] dp , int n){

        if(n == 0) return 0 ;
        if(n==1) return 1 ;

        if(dp[n] != -1) return dp[n] ;


        return dp[n] = mycode(dp , n-1) + mycode(dp , n-2)  ;
    }


}