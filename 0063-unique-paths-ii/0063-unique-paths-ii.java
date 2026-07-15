class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        
        int[][] dp = new int[arr.length][arr[0].length] ;

        for(int[] row : dp){
            Arrays.fill(row , -1) ;
        }
               
       if(arr[dp.length-1] [dp[0].length-1] == 1 ) return 0 ;        
        
      return mycode(dp , arr , dp.length-1 , dp[0].length-1 , 0) ;

    }

    public static int mycode(int[][] dp , int[][] arr ,int  m , int n  , int count){

        if(m == 0 && n ==0){
             
             count++ ;
             return count ;
             }
   

     if(dp[m][n] != -1) return dp[m][n] ;
       
       int a = 0 ;
       int b = 0 ;

        if( n > 0){

            if(arr[m][n-1] != 1){
           a = mycode(dp ,arr , m , n-1 , count) ;
           }
        }

        if( m > 0){

            if(arr[m-1][n] != 1){

            b= mycode(dp ,arr , m -1 , n , count) ; 
            
            }
        }
 
        dp[m][n] = a+ b ;


        return dp[m][n] ;
    }
}