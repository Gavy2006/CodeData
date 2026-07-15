class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        Queue<TreeNode> qu = new LinkedList<>();

        List<List<Integer>> list = new ArrayList<>();

        qu.offer(root);

        while (!qu.isEmpty()) {

            int size = qu.size();
            List<Integer> lis = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode node = qu.poll();
                lis.add(node.val);

                if (node.left != null) {
                    qu.offer(node.left);
                }

                if (node.right != null) {
                    qu.offer(node.right);
                }
            }

            list.add(lis);
        }

        return list;
    }
} 