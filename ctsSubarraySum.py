from typing import List

class Solution:
    def checkSubarraySum(self, nums: List[int], k: int) -> bool:
        prefixSum = 0
        map = {}
        map[0] = -1

        for i in range(len(nums)):
            prefixSum = (prefixSum + nums[i]) % k
            if prefixSum in map.keys():
                if i - map[prefixSum] > 1:
                    return True
            else:
                map[prefixSum] = i
        
        return False