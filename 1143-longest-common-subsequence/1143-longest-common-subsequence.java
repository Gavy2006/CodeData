class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        Integer[][] dp = new Integer[text1.length() ][text2.length() ] ;

        return mycode(text1 , text2 , 0 , 0  , dp) ;
    }

    public static int mycode(String text1 , String text2 , int i1 , int i2 , Integer[][] dp ){

        if(i1 == text1.length() || i2 == text2.length()) return 0 ;

       if(dp[i1][i2] != null) return dp[i1][i2] ;


       if(text1.charAt(i1) == text2.charAt(i2)){

        return dp[i1][i2]  = 1 + mycode(text1 , text2 , i1+1 ,i2 +1 , dp) ;
       }


       else{

        return dp[i1][i2]  = Math.max(mycode(text1 , text2 , i1+1 ,i2  , dp) , mycode(text1 , text2 , i1 ,i2 +1 , dp)) ; 
       }




    }
}