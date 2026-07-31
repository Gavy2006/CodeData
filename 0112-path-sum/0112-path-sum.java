class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null)
            return false;

        return mycode(root, targetSum);

    }

    public static boolean mycode(TreeNode node, int target) {

        if (node.left == null && node.right == null) {
             return (target - node.val) == 0;
        }

        boolean a = false;
        boolean b = false;

        if (node.right != null) {
            a = mycode(node.right, target - node.val);
        }

        if (node.left != null) {
            b = mycode(node.left, target - node.val);
        }

        return a || b;
    }
}