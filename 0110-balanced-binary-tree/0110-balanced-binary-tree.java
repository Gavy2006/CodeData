class Solution {
    public boolean isBalanced(TreeNode root) {
        
        if(root == null) return true ;

        if (Math.abs(mycode(root.left) - mycode(root.right)) > 1)
            return false;

        return isBalanced(root.left) && isBalanced(root.right) ;
    }

    public static int mycode(TreeNode node){

        if(node == null) return 0 ;

        int a = mycode(node.left) ;
        int b = mycode(node.right) ;

        return 1 + Math.max(a , b) ;
    }
}