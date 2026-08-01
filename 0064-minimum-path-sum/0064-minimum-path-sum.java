class Solution {
    public int minPathSum(int[][] grid) {

        Integer[][] dp = new Integer[grid.length][grid[0].length];

        return mycode(grid, dp, 0, 0);
    }

    public static int mycode(int[][] arr, Integer[][] dp, int row, int col) {

        if (row >= arr.length || col >= arr[0].length)
            return (int) 1e9;

        if (row == arr.length - 1 && col == arr[0].length - 1)
            return arr[row][col];
         
          if (dp[row][col] != null)
              return dp[row][col];

          int  a = arr[row][col] + mycode(arr, dp, row + 1, col);
          int  b = arr[row][col] + mycode(arr, dp, row, col + 1);
        

        return dp[row][col] = Math.min(a, b);
    }
}