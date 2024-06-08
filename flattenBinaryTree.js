
function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}

/*
 * @param {TreeNode} root
 * @return {void} Do not return anything, modify root in-place instead.
 */
var flatten = function(root) {
    recurse(root);

    function recurse(node) {
        if (node == null) {
            return node;
        } 
        if (node.left == null && node.right == null) {
            return node;
        }

        let leftTail = recurse(node.left);
        let rightTail = recurse(node.right);

        if (leftTail != null) {
            leftTail.right = node.right;
            node.right = node.left;
            node.left = null;
        }

        return rightTail != null? rightTail: leftTail;
    }
};