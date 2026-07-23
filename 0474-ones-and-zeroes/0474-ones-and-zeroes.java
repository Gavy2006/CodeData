class Solution {
    public int findMaxForm(String[] strs, int m, int n) {

        int[][][] dp = new int[strs.length][m + 1][n + 1];

        for (int[][] mat : dp) {
            for (int[] row : mat) {
                Arrays.fill(row, -1);
            }
        }
        return mycode(strs, m, n, 0 , dp);
    }

    public static int mycode(String[] strs, int m, int n, int index, int[][][] dp) {

        if (index == strs.length)
            return 0;

        if (dp[index][m][n] != -1)
            return dp[index][m][n];

        String s = strs[index];

        int one = 0;
        int zero = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '0') {
                zero++;
            }

            else {
                one++;
            }

        }

        int a = 0;

        if (m - zero >= 0 && n - one >= 0) {
            a = 1 + mycode(strs, m - zero, n - one, index + 1, dp);
        }

        int b = mycode(strs, m, n, index + 1, dp);

        return dp[index][m][n] = Math.max(a, b);
    }
}