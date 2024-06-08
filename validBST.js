function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}

var isValidBST = function(root) {
    return valid(root, null, null);

    function valid(node, left, right) {
        if (node == null) return true;
        if (left != null && node.val >= left) return false;
        if (right != null && node.val <= right) return false;

        return valid(node.left, left, node.val) && valid(node.right, node.val, right);
    }
};