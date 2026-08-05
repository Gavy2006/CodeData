class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> qu = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return new ArrayList<>();
        
        qu.offer(root);

        while (!qu.isEmpty()) {

            int size = qu.size();
            List<Integer> list1 = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode node = qu.poll();

                list1.add(node.val);

                if (node.left != null) {
                    qu.offer(node.left);
                }

                if (node.right != null) {
                    qu.offer(node.right);
                }

            }

            list.add(new ArrayList<>(list1));
        }

        return list;
    }
}