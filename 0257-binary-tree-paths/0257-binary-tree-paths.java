class Solution {
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> list = new ArrayList<>();

        String str = String.valueOf(root.val);

        return mycode(list, str, root);
    }

    public static List<String> mycode(List<String> list, String str, TreeNode node) {

        if (node.left == null && node.right == null) {
            list.add(str);
            return list;
        }

        if (node.right != null) {
            mycode(list, str + "->" + node.right.val, node.right);
        }

        if (node.left != null) {
            mycode(list, str + "->" + node.left.val, node.left);
        }
    
        return list;
    }
}