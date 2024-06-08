class Solution(object):
    def __init__(self) -> None:
        pass

    def nextGreaterElement(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        map = {}
        stack = []
        ans = [-1] * len(nums1)
        for i, num in enumerate(nums1):
            map[num] = i
        
        j = len(nums2)-1
        while j >= 0:
            while stack and nums2[stack[-1]] <= nums2[j]:
                stack.pop()
            if nums2[j] in map.keys():
                ans[map[nums2[j]]] = -1 if not stack else nums2[stack[-1]]
            stack.append(j)
            j-=1
        
        return ans
    
def main():
    print(Solution().nextGreaterElement([4, 1, 2], [1, 3, 4, 2]))

if __name__ == "__main__":
    main()