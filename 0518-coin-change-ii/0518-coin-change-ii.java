class Solution {
    public int change(int amount, int[] coins) {

        Integer[][] dp = new Integer[coins.length][amount + 1];

        return mycode(coins, dp, 0, amount);
    }

    public static int mycode(int[] coins, Integer[][] dp, int index, int remaining) {

        if (remaining == 0)
            return 1;

        if (remaining < 0)
            return 0;

        if (index == coins.length)
            return 0;

        if (dp[index][remaining] != null)
            return dp[index][remaining];

        int take = mycode(coins, dp, index, remaining - coins[index]);
        int notTake = mycode(coins, dp, index + 1, remaining);

        return dp[index][remaining] = take + notTake;
    }
}