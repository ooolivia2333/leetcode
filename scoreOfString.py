import math

class Solution:
    def __init__(self) -> None:
        pass

    def scoreOfString(self, s:str)->int:
        ans = 0
        for i in range(len(s)-1):
            ans += abs(ord(s[i]) - ord(s[i+1]))
        return ans

def main():
    solution = Solution()
    print(solution.scoreOfString("hello"))

if __name__ == "__main__":
    main()