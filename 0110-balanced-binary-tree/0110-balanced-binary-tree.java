class Solution {

    public boolean isBalanced(TreeNode root) {

        if (root == null) return true;

        int a = height(root.left);
        int b = height(root.right);

        if (Math.abs(a - b) > 1) return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int height(TreeNode node) {

        if (node == null) return 0;

        int a = height(node.left);
        int b = height(node.right);

        return 1 + Math.max(a, b);
    }
}