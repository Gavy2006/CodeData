class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>() ;
        return mycode(root , list) ;

    }


    public static List<Integer> mycode(TreeNode node , List<Integer> list){

        if(node == null) return list ;

        if(node.left != null){
            mycode(node.left , list) ;
        }

          
          list.add(node.val);
          
        if(node.right != null){
            mycode(node.right , list) ;
        }

        return list ;
    }
}