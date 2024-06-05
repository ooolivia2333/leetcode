from typing import List

class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        ans = []
        if len(nums) == 0:
            return ans
        
        start = nums[0]
        for i in range(1, len(nums) + 1):
            if i == len(nums) or nums[i] != nums[i-1] + 1:
                end = nums[i-1]
                if end == start:
                    ans.append(str(start))
                else:
                    ans.append(str(start) + "->" + str(end))
                if i < len(nums):
                    start = nums[i]
        
        return ans  
    