class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        
        Integer[][] dp = new Integer[s1.length()][s2.length()] ;
        return mycode(s1, s2, s1.length() - 1, s2.length() - 1 , dp);
    }

    public static int mycode(String s1 , String s2 , int i1 , int i2 , Integer[][] dp){

        if(i1 < 0 || i2 < 0) return 0 ;
      

      if(dp[i1][i2] != null) return dp[i1][i2] ;

        else if (s1.charAt(i1) == s2.charAt(i2)){
            return dp[i1][i2] =  1 + mycode(s1 , s2 , i1-1 , i2-1 , dp) ;
        }

        else {
            return dp[i1][i2] =  0 +  Math.max(mycode(s1 , s2 , i1-1 , i2 , dp)  , mycode(s1 , s2 , i1 , i2-1 , dp) ) ;
        }
    }
}