from typing import List
import math

class Solution:
    def __init__(self) -> None:
        pass

    def firstMissingPositive(self, nums: List[int]) -> int:
        n = len(nums)
        contains1 = False
        for i in range(len(nums)):
            if nums[i] == 1:
                contains1 = True
            elif nums[i] < 1 or nums[i] > n:
                nums[i] = 1
        if not contains1:
            return 1
        
        for i in range(len(nums)):
            curr = abs(nums[i])
            if curr == n:
                nums[0] = -abs(nums[0])
            else:
                nums[curr] = -abs(nums[curr])
        for i in range(1, len(nums)):
            if nums[i] > 0:
                return i
        if nums[0] > 0:
            return n
        return n+1

def main():
    print(Solution().firstMissingPositive([1, 2, 0]))

if __name__ == "__main__":
    main()   