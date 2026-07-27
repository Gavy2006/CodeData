class Solution {

    int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        height(root);
        return ans;
    }

    public int height(TreeNode node) {

        if (node == null) return 0;

        int a = height(node.left);
        int b = height(node.right);

        ans = Math.max(ans, a + b);

        return 1 + Math.max(a, b);
    }
}