class Solution {
    public int climbStairs(int n) {

        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);

        return mycode(n, dp);
    }

    public static int mycode(int n, int[] dp) {

   
        if (dp[n] != -1) {
            return dp[n];
        }

        if (n == 0 || n == 1) {
            dp[n] = 1;
            return dp[n];
        }
 

       dp[n] = mycode(n - 1, dp) + mycode(n - 2, dp);

        return dp[n];
    }
}