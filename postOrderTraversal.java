import java.util.ArrayList;
import java.util.List;
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

public class postOrderTraversal {
    // 145. Binary Tree Postorder Traversal
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root, prevNode = null;
        while (!stack.isEmpty() || curr != null) {
            while (curr != null) {
                stack.add(curr);
                curr = curr.left;
            }

            curr = stack.peek();
            if (curr.right == null || prevNode == curr.right) {
                stack.pop();
                ans.add(curr.val);
                prevNode = curr;
                curr = null;
            } else {
                curr = curr.right;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.right = new TreeNode(2);
        head.right.left = new TreeNode(3);
        postOrderTraversal postOrderTraversal = new postOrderTraversal();
        List<Integer> ans = postOrderTraversal.postorderTraversal(head);
        for (int num: ans) {
            System.out.println(num);
        }
        
    }
}
