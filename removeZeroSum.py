class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def removeZeroSumSublists(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode(0, head)
        curr = dummy
        prefixMap = {}
        prefixSum = 0

        while curr:
            prefixSum += curr.val
            if prefixSum in prefixMap:
                prev = prefixMap[prefixSum]
                curr = prev.next

                p = prefixSum + curr.val
                while p != prefixSum:
                    del prefixMap[p]
                    curr = curr.next
                    p += curr.val
                
                prev.next = curr.next
            else:
                prefixMap[prefixSum] = curr
            curr = curr.next
        
        return dummy.next
