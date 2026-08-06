class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        

        List<Integer> list = new ArrayList<>() ;
        
        if(root == null) return list ;

        Queue<TreeNode> qu = new LinkedList<>() ;
        qu.offer(root) ;


        while(!qu.isEmpty()){
        
          int size = qu.size() ;

          for(int i = 0 ; i < size ; i++){

            TreeNode node = qu.poll() ;
            
            if(i == 0) list.add(node.val) ;
            
            if(node.right != null){
                qu.offer(node.right) ;
            }
            
             if(node.left != null){
                qu.offer(node.left) ;
            }

          }
        }
            
         return list ;   
    } 
}