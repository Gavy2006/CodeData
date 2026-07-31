class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> list = new ArrayList<>() ;

        return mycode(list , root , String.valueOf(root.val));
    }

    public static List<String> mycode(List<String> list , TreeNode node , String str){

        if(node.left == null && node.right == null){
           list.add(str);
           return list ;
        }

      if(node.left != null){
        mycode(list , node.left , str + "->" + + node.left.val ) ;
      }

     if(node.right != null){
        mycode(list , node.right , str + "->" + node.right.val  ) ;
      }


        return list ;
    }
}