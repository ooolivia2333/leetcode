class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        ans = []
        stack = []
        curr = root
        prev = None
        while stack or curr:
            while curr:
                stack.append(curr)
                curr = curr.left
            curr = stack[-1]
            if not curr.right or curr.right == prev:
                ans.append(curr.val)
                prev = curr
                curr = None
                stack.pop()
            else:
                curr = curr.right

        return ans

