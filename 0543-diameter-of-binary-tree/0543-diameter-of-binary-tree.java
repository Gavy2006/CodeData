class Solution {

     int ans = 0 ;

    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root == null) return 0 ;

              mycode(root) ;

              return ans ;  
    }

    public  int mycode(TreeNode node){

        if(node == null) return 0 ;

        int a = mycode(node.right) ;
        int b =  mycode(node.left) ;

         ans = Math.max( ans  , a + b) ;

        return 1 + Math.max(a , b) ;
    }
}