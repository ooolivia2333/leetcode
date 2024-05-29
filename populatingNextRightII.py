import collections

class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next

class Solution:
    def connect(self, root: 'Node') -> 'Node':
        if root == None:
            return root
        
        Q = collections.deque([root])
        while Q:
            size = len(Q)
            prev = None
            for i in range(size):
                curr = Q.popleft()
                if prev:
                    prev.next = curr
                prev = curr
                if curr.left:
                    Q.append(curr.left)
                if curr.right:
                    Q.append(curr.right)
        
        return root
