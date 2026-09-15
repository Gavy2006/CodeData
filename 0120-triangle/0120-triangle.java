class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        Integer[][] dp = new Integer[triangle.size()][triangle.size()];

        return mycode(triangle, dp, 0, 0);
    }

    public static int mycode(List<List<Integer>> list , Integer[][] dp , int row , int col){

        if(row == list.size() -1 ) return list.get(row).get(col);


        if(dp[row][col] != null) return dp[row][col] ;

        int a =  list.get(row).get(col) + mycode(list , dp , row + 1 , col) ;

        int b = list.get(row).get(col) + mycode(list , dp , row + 1 , col + 1) ;

        dp[row][col] = Math.min(a , b) ;



        return dp[row][col] ;
    }
}