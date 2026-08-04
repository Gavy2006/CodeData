class Solution {
    public int longestPalindromeSubseq(String str) {

        Integer[][] dp = new Integer[str.length()][str.length()];

        return mycode(str, 0, str.length() - 1, dp);
    }

    public static int mycode(String str, int i, int j, Integer[][] dp) {

        if (i > j)
            return 0;
        if (i == j)
            return 1;

        if (dp[i][j] != null)
            return dp[i][j];

        if (str.charAt(i) == str.charAt(j)) {
            return dp[i][j] = 2 + mycode(str, i + 1, j - 1, dp);
        }

        else {
            return dp[i][j] = Math.max(mycode(str, i + 1, j, dp), mycode(str, i, j - 1, dp));
        }
    }
}