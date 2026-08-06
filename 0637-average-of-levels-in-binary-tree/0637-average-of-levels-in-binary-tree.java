class Solution {
    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> list = new ArrayList<>();

        if (root == null)
            return list;

        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);

        while (!qu.isEmpty()) {

            int size = qu.size();
            double sum = 0;

            for (int i = 0; i < size; i++) {

                TreeNode node = qu.poll();
                sum += node.val;

                if (node.left != null) {
                    qu.offer(node.left);
                }

                if (node.right != null) {
                    qu.offer(node.right);
                }
            }

            list.add(sum / size);
        }

        return list;
    }
}