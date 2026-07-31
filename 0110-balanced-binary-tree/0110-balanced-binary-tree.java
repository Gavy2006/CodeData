class Solution {

    public boolean isBalanced(TreeNode root) {

        if (root == null)
            return true;

        int a = mycode(root.left);
        int b = mycode(root.right);

        if (Math.abs(a - b) > 1) {
            return false;
        }

        return isBalanced(root.right) && isBalanced(root.left);

    }

    public static int mycode(TreeNode node) {

        if (node == null)
            return 0;

        int a = 1 + mycode(node.left);
        int b = 1 + mycode(node.right);

        return Math.max(a, b);
    }
}