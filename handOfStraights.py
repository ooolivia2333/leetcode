from typing import List
from collections import Counter
import heapq

class Solution:
    def isNStraightHand(self, hand: List[int], groupSize: int) -> bool:
        n = len(hand)
        if n % groupSize != 0:
            return False
        
        freq_count = Counter(hand)
        min_heap = list(freq_count.keys())
        heapq.heapify(min_heap)

        while min_heap:
            smallest = min_heap[0]
            for i in range(groupSize):
                if freq_count[smallest+i] == 0:
                    return False
                freq_count[smallest+i]-=1
                if freq_count[smallest+i] == 0:
                    if smallest + i != heapq.heappop(min_heap):
                        return False
        
        return True
                