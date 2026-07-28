class Solution {

    public int findTargetSumWays(int[] nums, int target) {

        int total = 0;
        for (int x : nums) {
            total += x;
        }

        Integer[][] dp = new Integer[nums.length][2 * total + 1];

        return mycode(nums, target, 0, dp, 0, total);
    }

    public static int mycode(int[] nums, int target, int index, Integer[][] dp, int sum, int total) {

        if (index == nums.length) {
            return sum == target ? 1 : 0;
        }

        if (dp[index][sum + total] != null) {
            return dp[index][sum + total];
        }

        int plus = mycode(nums, target, index + 1, dp, sum + nums[index], total);

        int minus = mycode(nums, target, index + 1, dp, sum - nums[index], total);

        return dp[index][sum + total] = plus + minus;
    }
}