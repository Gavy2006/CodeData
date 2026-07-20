class Solution {
    public int lastStoneWeightII(int[] arr) {
        
        int sum = 0 ;

        for(int no : arr){
            sum+=no ;
        }
        
        Integer[][] dp = new Integer[arr.length][sum+1] ;

        return mycode(arr , 0 ,  sum  , 0, dp) ;
    }

    public static int mycode(int[] arr  , int sum ,  int target ,  int index , Integer[][] dp ){

       if(index == arr.length)  return Math.abs(target - sum*2) ;
    
        if(dp[index][sum] != null) return dp[index][sum] ;

        int take = mycode(arr , sum + arr[index] , target  , index + 1 , dp ) ;
        int nottake =  mycode(arr ,sum  , target  , index + 1  , dp) ;

        dp[index][sum] = Math.min(take  , nottake) ;

        return dp[index][sum]  ;
    }
}