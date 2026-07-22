class Solution {
    public boolean canPartition(int[] arr) {
        
        int sum = 0 ;

    for(int no : arr){
        sum+=no ;
    }

       if(sum%2 != 0) return false ;

       Boolean[][] dp = new Boolean[arr.length][sum/2 + 1] ;
    
        return mycode(arr , 0 , dp , sum/2 , 0) ;
         
    }

    public static boolean mycode(int[] arr , int index , Boolean[][] dp , int target , int sum ){

  if (sum == target) return true;

if (index == arr.length) return false;

if (sum > target) return false;
if (dp[index][sum] != null) return dp[index][sum];


        dp[index][sum] = mycode(arr , index+1 , dp , target , sum+arr[index] ) || mycode(arr , index+1 , dp , target , sum) ;

       
       return dp[index][sum] ;

    }
}