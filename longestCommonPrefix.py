from typing import List
class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if (len(strs[0]) == 0):
            return "" 
        for i in range(len(strs[0])):
            c = strs[0][i]
            for j in range(1, len(strs)):
                if i == len(strs[j]) or strs[j][i] != c:
                    return strs[j][:i]
                
        return strs[0]
