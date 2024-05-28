
import java.util.HashMap;
import java.util.Map;

public class binaryTreeFromPreandIn {

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

    // 105. Construct Binary Tree from Preorder and Inorder Traversal
    int preIndex = 0;
    Map<Integer, Integer> inOrderMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inOrderMap = new HashMap();
        for (int i = 0; i < inorder.length; i++) {
            inOrderMap.put(inorder[i], i);
        }
        return arrayToTree(preorder, 0, preorder.length-1);
    }

    private TreeNode arrayToTree(int[] preorder, int left, int right) {
        if (left > right) return null;
        int rootVal = preorder[preIndex++];
        int index = inOrderMap.get(rootVal);
        TreeNode root = new TreeNode(rootVal);
        root.left = arrayToTree(preorder, left, index-1);
        root.right = arrayToTree(preorder, index+1, right);
        return root;
    }
}
