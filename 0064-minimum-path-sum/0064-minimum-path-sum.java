class Solution {
    public int minPathSum(int[][] grid) {

        int[][] dp = new int[grid.length][grid[0].length];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int row = grid.length - 1;
        int col = grid[0].length - 1;

        return mycode(row, col, grid, dp);
    }

    public static int mycode(int row, int col, int[][] grid, int[][] dp) {

        if (row == 0 && col == 0)
            return grid[0][0];

        if (dp[row][col] != -1)
            return dp[row][col];

        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        if (row > 0) {

            a = grid[row][col] + mycode(row - 1, col, grid, dp);

        }

        if (col > 0) {

            b = grid[row][col] + mycode(row, col - 1, grid, dp);

        }

        dp[row][col] = Math.min(a, b);

        return dp[row][col];
    }

}