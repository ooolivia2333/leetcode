class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        if not head or not head.next:
            return head
        
        n = 0
        curr = head
        while curr:
            n+=1
            curr = curr.next
        
        k = k % n
        dummyHead = ListNode(0, head)
        con = head
        while k > 0:
            k-=1
            con = con.next
        
        tail = head
        while con.next:
            con = con.next
            tail = tail.next

        con.next = dummyHead.next
        dummyHead.next = tail.next
        tail.next = None

        return dummyHead.next