class Solution {
    public int numSquares(int n) {
        
        int[][] dp = new int[(int)Math.sqrt(n) + 2][n+1] ;

        for(int[] row : dp){
            Arrays.fill(row , -1) ;
        }
        return mycode(n , 1 , dp) ;
    }

    public static int mycode(int n , int index , int[][] dp){

        if (n == 0)
            return 0;

        if (index * index > n)
            return Integer.MAX_VALUE;

        if (dp[index][n] != -1)
            return dp[index][n];
        
        int a = Integer.MAX_VALUE;

        if(n -(index*index) >=0 ){
          int temp  = mycode(n - ( index*index ) , index , dp) ; 

          if(temp !=  Integer.MAX_VALUE){
            a = 1 + temp ;
          }
         }

        int b = mycode(n , index + 1 , dp) ;

        return dp[index][n] =Math.min(a , b) ;
    }
}