public class validateBST {
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

    public boolean valid(TreeNode node, int left_bound, int right_bound) {
        if (node == null) return true;
        if (node.left == null && node.right == null) return true;

        boolean valid = true;
        if (node.left != null) {
            if (node.left.val <= left_bound || node.left.val >= right_bound) return false;
            valid &= valid(node.left, left_bound, node.left.val);
        }
        if (node.right != null) {
            if (node.right.val <= node.val) return false;
            valid &= valid(node.right, node.right.val, right_bound);
        }

        return valid;
    }

    public boolean isValidBST(TreeNode root) {
        return valid(root.left, Integer.MIN_VALUE, root.val) && valid(root.right, root.val, Integer.MAX_VALUE);
    }
}
