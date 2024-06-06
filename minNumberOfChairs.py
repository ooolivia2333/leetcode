class Solution:
    def minimumChairs(self, s: str) -> int:
        ans = 0
        curr = 0
        for i in range(len(s)):
            if s[i] == 'E':
                curr+=1
                ans = max(ans, curr)
            else:
                curr-=1
        return ans