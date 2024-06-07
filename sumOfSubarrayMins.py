from typing import List
class Solution:
    def sumSubarrayMins(self, arr: List[int]) -> int:
        MOD = 10 ** 9 + 7
        stack = []
        sumOfMins = 0

        for i in range(len(arr) + 1):
            while stack and (i == len(arr) or arr[stack[-1]] >= arr[i]):
                mid = stack.pop()
                right_boundary = i
                left_boundary = -1 if not stack else stack[-1]

                sumOfMins += stack[mid] * (right_boundary - mid) * (mid - left_boundary) % MOD
            stack.push(i) 
            
        return sumOfMins