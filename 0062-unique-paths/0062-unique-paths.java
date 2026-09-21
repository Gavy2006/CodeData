class Solution {
    public int uniquePaths(int m, int n) {

     int[][] dp = new int[m][n] ;
      
      for(int[] row : dp){
        Arrays.fill(row , -1) ;
      }

     return mycode(m-1 , n-1 , dp) ;   
    }

    public static int mycode(int m , int n , int[][]dp){

        if(m==0 && n == 0 ) return 1 ;

       if(dp[m][n] != -1) return dp[m][n] ;
        
        int a = 0 ;
        int b = 0 ;

        if(m > 0){
          a = mycode(m-1 , n , dp) ;
        }

        if(n > 0){
          b = mycode(m , n-1 , dp) ;
        }

        dp[m][n] = a+b ;

        return dp[m][n] ;
    }
}