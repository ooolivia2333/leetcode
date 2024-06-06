from typing import List
class Solution:
    def countDays(self, days: int, meetings: List[List[int]]) -> int:
        meetings.sort(key=lambda x: x[0])
        ans = 0
        curr = 1
        for meeting in meetings:
            if meeting[1] < curr:
                continue
            if meeting[0] > curr:
                ans += meeting[0] - curr
            curr = meeting[1] + 1
        
        if curr <= days:
            ans += days - curr + 1
        
        return ans