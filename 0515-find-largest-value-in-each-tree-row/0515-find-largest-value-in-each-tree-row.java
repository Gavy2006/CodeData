class Solution {
    public List<Integer> largestValues(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();

        if (root == null)
            return list;

        qu.offer(root);

        while (!qu.isEmpty()) {

            int size = qu.size();
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < size; i++) {

                TreeNode node = qu.poll();

                max = Math.max(max, node.val);

                if (node.left != null)
                    qu.offer(node.left);

                if (node.right != null)
                    qu.offer(node.right);
            }

            list.add(max);
        }

        return list;
    }
}