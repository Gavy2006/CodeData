class Solution {
    public int climbStairs(int n) {

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return mycode(n, dp, 0);
    }

    public static int mycode(int n, int[] dp, int index) {

        if (index > n)
            return 0;

        if (index == n)
            return 1;

        if (dp[index] != -1)
            return dp[index];

        int a = mycode(n, dp, index + 1);
        int b = mycode(n, dp, index + 2);

        dp[index] = a + b;

        return dp[index];
    }

}