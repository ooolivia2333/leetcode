import java.util.Stack;

class TreeNode {
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

public class rangeSum {
    public int rangeSumBST(TreeNode root, int low, int high) {
        Stack<TreeNode> stack = new Stack();
        if (root == null) return 0;
        int ans = 0;
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            if (curr.val < low && curr.right != null) stack.push(curr.right);
            else if (curr.val > high && curr.left != null) stack.push(curr.left);
            else if (curr.val >= low && curr.val <= high) {
                ans += curr.val;
                if (curr.left != null) stack.push(curr.left);
                if (curr.right != null) stack.push(curr.right);
            }
        }
        return ans;
    }
}
