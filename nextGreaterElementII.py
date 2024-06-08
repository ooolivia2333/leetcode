class Solution(object):
    def __init__(self) -> None:
        pass

    def nextGreaterElements(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        stack = []
        n = len(nums)
        i = 2 * n - 1
        ans = [-1] * n

        while i > 0:
            curr = i % n
            while stack and nums[stack[-1]] <= nums[curr]:
                stack.pop()
            if stack:
                ans[curr] = nums[stack[-1]]
            stack.append(curr)
            i -= 1
        
        return ans

print(Solution().nextGreaterElements([1, 2, 1]))