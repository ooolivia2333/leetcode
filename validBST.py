class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        return self.valid(root, None, None)
    
    def valid(self, root: Optional[TreeNode], left, right) -> bool:
        if not root:
            return True
        if left and root.val <= left:
            return False
        if right and root.val >= right:
            return False
        
        return self.valid(root.left, left, root.val) and self.valid(root.right, root.val, right)