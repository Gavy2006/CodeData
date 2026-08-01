class Solution {
    public int findTargetSumWays(int[] nums, int target) {

        int sum = 0;
        for (int x : nums)
            sum += x;

        if (Math.abs(target) > sum)
            return 0;

        Integer[][] dp = new Integer[nums.length][2 * sum + 1];

        return mycode(nums, 0, target, 0, sum, dp);
    }

    public static int mycode(int[] nums, int curr, int target, int index,
                             int offset, Integer[][] dp) {

        if (index == nums.length)
            return curr == target ? 1 : 0;

        if (dp[index][curr + offset] != null)
            return dp[index][curr + offset];

        int plus = mycode(nums, curr + nums[index], target,
                          index + 1, offset, dp);

        int minus = mycode(nums, curr - nums[index], target,
                           index + 1, offset, dp);

        return dp[index][curr + offset] = plus + minus;
    }
}