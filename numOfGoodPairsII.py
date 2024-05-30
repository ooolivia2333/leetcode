import math
from collections import Counter
from typing import List

class Solution:
    def __init__(self) -> None:
        pass

    def numberOfPairs(self, nums1: List[int], nums2: List[int], k: int) -> int:
        freqs = Counter(num * k for num in nums2)
        counts = [0] * (max(nums1) + 1)

        for number, count in freqs.items():
            for multiplier in range(number, len(counts), number):
                counts[multiplier] += count
        
        return sum(counts[num] for num in nums1)
    
def main():
    solution = Solution()
    print(solution.numberOfPairs([1, 2, 4, 12], [2, 4], 3))

if __name__ == "__main__":
    main()