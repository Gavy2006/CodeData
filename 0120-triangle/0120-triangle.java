class Solution {
    public int minimumTotal(List<List<Integer>> list) {
        
        Integer[][] dp = new Integer[list.size()][list.size()];
        return mycode(list , dp , 0 , 0) ;

    }

    public static int mycode(List<List<Integer>> list ,  Integer[][] dp , int row , int col){
       
       if(row == list.size()) return 0;

       if(dp[row][col] != null) return dp[row][col] ;

      
       int a = Integer.MIN_VALUE ;
       int b = Integer.MIN_VALUE ;
    
     a = list.get(row).get(col) + mycode(list , dp , row + 1 , col +1) ;
     b = list.get(row).get(col) + mycode(list , dp , row + 1 , col ) ;

     dp[row][col] = Math.min(a , b) ;

     return dp[row][col] ;

    }
}