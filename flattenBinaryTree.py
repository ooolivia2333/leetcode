class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def recurse(self, node: TreeNode) -> TreeNode:
        if not node:
            return node
        if not node.left and not node.right:
            return node
        
        leftTail = self.recurse(node.left)
        rightTail = self.recurse(node.right)

        if leftTail:
            leftTail.right = node.right
            node.right = node.left
            node.left = None

        return rightTail if rightTail else leftTail


    def flatten(self, root: Optional[TreeNode]) -> None:
        """
        Do not return anything, modify root in-place instead.
        """
        if not root:
            return root
        self.recurse(root)

