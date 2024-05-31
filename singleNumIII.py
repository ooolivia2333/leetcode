from typing import List
from collections import Counter

class Solution:
    def __init__(self) -> None:
        pass

    def singleNumber(self, nums: List[int]) -> List[int]:
        xor = 0
        for num in nums:
            xor ^= num
        
        mask = 1
        while xor & mask == 0:
            mask = mask << 1
        
        num1, num2 = 0, 0
        for num in nums:
            if num & mask == 0:
                num1 ^= num
            else:
                num2 ^= num
        
        return [num1, num2]

    
def main():
    solution = Solution()
    print(solution.singleNumber([1, 2, 1, 3, 2, 5]))

if __name__ == "__main__":
    main()