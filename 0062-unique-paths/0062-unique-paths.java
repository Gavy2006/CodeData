class Solution {
    public int uniquePaths(int m, int n) {
        
        int[][] dp = new int[m][n] ;

        for(int[] row : dp){
            Arrays.fill(row , -1) ;
        }

      return mycode(dp , m-1 , n-1 , 0) ;
    }


    public static int mycode(int[][] dp , int  m , int n  , int count){

        if(m == 0 && n ==0){
             
             count++ ;
             return count ;
             }
   

     if(dp[m][n] != -1) return dp[m][n] ;
       
       int a = 0 ;
       int b = 0 ;

        if( n > 0){
           a = mycode(dp , m , n-1 , count) ;
        }

        if( m > 0){
            b= mycode(dp , m -1 , n , count) ;
        }
 
        dp[m][n] = a+ b ;


        return dp[m][n] ;
    }
}