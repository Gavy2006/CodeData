class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>() ;
        return mycode(root , list) ;
    }

    public static List<Integer> mycode(TreeNode node , List<Integer> list){

        if(node == null) return list ;

        if(node.left != null){
            mycode(node.left , list) ;
        }
          
           
        if(node.right != null){
            mycode(node.right , list) ;
        }

         list.add(node.val);

        return list ;
    }
}