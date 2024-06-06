class Solution:
    def __init__(self) -> None:
        pass

    def clearStars(self, s: str) -> str:
        freqCount = [[] for _ in range(26)]
        removed = [False] * len(s)
        index = 0
        prev = 0

        for i in range(len(s)):
            if s[i] != '*':
                continue
            index = i

            for j in range(prev, index):
                freqCount[ord(s[j]) - ord('a')].append(j)
            
            for j in range(26):
                if len(freqCount[j]) > 0:
                    removeIndex = freqCount[j][-1]
                    freqCount[j] = freqCount[j][:-1]
                    removed[removeIndex] = True
                    break
            
            prev = index+1
        
        result = []
        for i in range(len(s)):
            if not removed[i] and s[i] != '*':
                result.append(s[i])
        
        return ''.join(result)