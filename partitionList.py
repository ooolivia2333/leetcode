class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def partition(self, head: Optional[ListNode], x: int) -> Optional[ListNode]:
        curr = head
        lesser = ListNode()
        greater = ListNode()
        greaterHead = greater
        head = lesser

        while curr:
            if curr.val < x:
                lesser.next = curr
                lesser = lesser.next
            else:
                greater.next = curr
                greater = greater.next
            curr = curr.next
        
        greater.next = None
        lesser.next = greaterHead.next

        return head.next