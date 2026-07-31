class Solution {
    public int maxDepth(TreeNode root) {

         return mycode(root) ;
    }

    public static int mycode(TreeNode node){

        if(node == null) return 0 ;

         int a = 1 + mycode(node.right) ;

         int b = 1 + mycode(node.left) ;


         return Math.max(a ,b) ;
    }
}