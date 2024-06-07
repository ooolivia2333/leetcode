class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        fast = head
        if fast.next == None:
            return None
        
        while n > 0:
            fast = fast.next
            n-=1
        
        curr = head
        prev = None
        while fast:
            fast = fast.next
            prev = curr
            curr = curr.next
        
        if prev:
            prev.next = curr.next
        else:
            head = curr.next
        
        return head
