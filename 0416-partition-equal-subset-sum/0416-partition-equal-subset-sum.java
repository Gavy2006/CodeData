class Solution {
    public boolean canPartition(int[] nums) {

        int target = 0;

        for (int no : nums) {
            target += no;
        }

        if (target % 2 != 0)
            return false;

        target /= 2;

        Boolean[][] dp = new Boolean[nums.length][target + 1];

        return mycode(nums, target, 0, 0, dp);
    }

    public static boolean mycode(int[] nums, int target, int sum, int index, Boolean[][] dp) {

        if (sum == target)
            return true;

        if (sum > target)
            return false;

        if (index == nums.length)
            return false;

        if (dp[index][sum] != null)
            return dp[index][sum];

        boolean take = mycode(nums, target, sum + nums[index], index + 1, dp);
        boolean notTake = mycode(nums, target, sum, index + 1, dp);

        return dp[index][sum] = take || notTake;
    }
}