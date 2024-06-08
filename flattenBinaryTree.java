public class flattenBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode recurse(TreeNode node) {
        if (node == null) return node;
        if (node.left == null && node.right == null) return node;

        TreeNode leftTail = recurse(node.left);
        TreeNode rightTail = recurse(node.right);

        if (leftTail != null) {
            leftTail.right = node.right;
            node.right = node.left;
            node.left = null;
        }

        return rightTail != null? rightTail: leftTail;
    }
    
    public void flatten(TreeNode root) {
        recurse(root);
    }
}
