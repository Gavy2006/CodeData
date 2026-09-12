class Solution {
    public int climbStairs(int n) {

        Integer[] dp = new Integer[n + 1];
        return mycode(0, n, dp);
    }

    public static int mycode(int i, int n, Integer[] dp) {

        if (i == n) {
            return 1;
        }

        if (i > n) {
            return 0;
        }

        if (dp[i] != null) {
            return dp[i];
        }
        int a = mycode(i + 1, n, dp);
        int b = mycode(i + 2, n, dp);

        return dp[i] = a + b;
    }
}