class Solution {

    public int findLength(int[] nums1, int[] nums2) {

        Integer[][] dp = new Integer[nums1.length][nums2.length];

        int ans = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                ans = Math.max(ans, mycode(nums1, nums2, i, j, dp));
            }
        }

        return ans;
    }

    public static int mycode(int[] nums1, int[] nums2,
                             int i1, int i2, Integer[][] dp) {

        if (i1 == nums1.length || i2 == nums2.length)
            return 0;

        if (dp[i1][i2] != null)
            return dp[i1][i2];

        if (nums1[i1] == nums2[i2]) {
            dp[i1][i2] = 1 + mycode(nums1, nums2, i1 + 1, i2 + 1, dp);
        } else {
            dp[i1][i2] = 0;
        }

        return dp[i1][i2];
    }
}