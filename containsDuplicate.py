from typing import List
class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        idx = {}
        for i, num in enumerate(nums):
            if num in idx.keys():
                if idx[num] >= i-k:
                    return True
            idx[num] = i
        return False