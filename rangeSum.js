function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}

var rangeSumBST = function(root, low, high) {
    if (root == null) return 0;
    const stack = [root];
    let ans = 0;
    while (stack.length != 0) {
        let curr = stack.shift();
        if (curr.val > low && curr.left != null) stack.push(curr.left);
        if (curr.val < high && curr.right != null) stack.push(curr.right);
        if (curr.val <= high && curr.val >= low) ans += curr.val;
    }
    return ans;
}