class Solution {

    public int minFallingPathSum(int[][] arr) {

       Integer[][] dp = new Integer[arr.length][arr[0].length];


        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr[0].length; i++) {

            int a = mycode(arr, dp, 0, i);

            min = Math.min(min, a);
        }
        return min;
    }

    public static int mycode(int[][] arr, Integer [][] dp, int row, int col) {

        if (row == arr.length - 1) {
            return arr[row][col];
        }

        if (dp[row][col] != null) {
            return dp[row][col];
        }
        int r = arr[row][col] + mycode(arr, dp, row + 1, col);

        int c = Integer.MAX_VALUE;
        if (col < arr[0].length - 1) {
            c = arr[row][col] + mycode(arr, dp, row + 1, col + 1);
        }

        int d = Integer.MAX_VALUE;
        if (col > 0) {
            d = arr[row][col] + mycode(arr, dp, row + 1, col - 1);
        }

        dp[row][col] = Math.min(r, Math.min(c, d));


        return dp[row][col];

    }
}