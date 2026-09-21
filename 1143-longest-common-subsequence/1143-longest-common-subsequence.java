class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int[][] dp = new int[text1.length()][text2.length()] ;

        for(int[] row : dp){
            Arrays.fill(row , -1) ;
        }

        return mycode(text1 , text2 , text1.length()-1 , text2.length()-1 , dp ) ;
    }

    public static int mycode(String text1 , String text2 , int a , int b , int[][] dp){
           
        if(a<0 || b<0 ) return 0 ;   
         
         if(dp[a][b] != -1) return dp[a][b] ;

        int c = Integer.MIN_VALUE ;
        int d = Integer.MIN_VALUE ;


        if(text1.charAt(a) == text2.charAt(b) ){
            c = 1 + mycode(text1 , text2 , a-1 , b-1 , dp);
        }


        else {

            d = 0 + Math.max( mycode(text1 , text2 , a , b-1 , dp) ,  mycode(text1 , text2 , a-1 , b , dp)) ; 
        }


        dp[a][b] = Math.max(c,d) ;
 


               return dp[a][b] ;
    }
}