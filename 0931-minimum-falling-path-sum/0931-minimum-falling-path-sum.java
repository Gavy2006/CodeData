class Solution {
    public int minFallingPathSum(int[][] matrix) {

        Integer[][] dp = new Integer[matrix.length][matrix[0].length];

        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < matrix[0].length; j++) {
            ans = Math.min(ans, mycode(matrix, dp, 0, j));
        }
        return ans;
    }

    public static int mycode(int[][] matrix, Integer[][] dp, int row, int col) {

        if (row == matrix.length)
            return 0;

        if (dp[row][col] != null)
            return dp[row][col];

        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;
        int down = Integer.MAX_VALUE;

        if (col > 0) {
            left = matrix[row][col] + mycode(matrix, dp, row + 1, col - 1);
        }

        if (col < matrix[0].length - 1) {
            right = matrix[row][col] + mycode(matrix, dp, row + 1, col + 1);
        }

        down = matrix[row][col] + mycode(matrix, dp, row + 1, col);

        dp[row][col] = Math.min(left, Math.min(right, down));

        return dp[row][col];
    }
}