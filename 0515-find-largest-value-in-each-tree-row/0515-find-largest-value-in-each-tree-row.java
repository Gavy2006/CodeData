class Solution {
    public List<Integer> largestValues(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        if (root == null)
            return list;

        LinkedList<TreeNode> qu = new LinkedList<>();

        qu.offer(root);

        while (!qu.isEmpty()) {

            int size = qu.size();
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < size; i++) {
                int val = qu.get(i).val;
                max = Math.max(max, val);
            }

            list.add(max);

            for (int i = 0; i < size; i++) {

                TreeNode node = qu.poll();

                if (node.left != null)
                    qu.offer(node.left);

                if (node.right != null)
                    qu.offer(node.right);
            }
        }

        return list;
    }
}