from typing import List
from collections import Counter
import math

class Solution:
    def __init__(self) -> None:
        pass

    def commonChars(self, words: List[str]) -> List[str]:
        common_count = Counter(words[0])
        n = len(words)
        ans = []

        for i in range(1, n):
            curr_count = Counter(words[i])
            for letter in common_count.keys():
                common_count[letter] = min(common_count[letter], curr_count[letter])
        
        for letter, repeat in common_count.items():
            for j in range(repeat):
                ans.append(letter)

        return ans
    
def main():
    print(Solution().commonChars(["bella","label","roller"]))

if __name__ == "__main__":
    main()