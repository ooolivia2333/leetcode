class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def rangeSumBST(self, root: Optional[TreeNode], low: int, high: int) -> int:
        if not root:
            return 0
        ans = 0
        stack = [root]
        while len(stack) > 0:
            curr = stack.pop()
            if curr.val > low and curr.left:
                stack.append(curr.left)
            if curr.val < high and curr.right:
                stack.append(curr.right)
            if curr.val >= low and curr.val <= high:
                ans += curr.val
        return ans